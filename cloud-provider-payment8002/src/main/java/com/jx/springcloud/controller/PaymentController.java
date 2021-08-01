package com.jx.springcloud.controller;

import com.jx.springcloud.entities.CommonResult;
import com.jx.springcloud.entities.Payment;
import com.jx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = this.paymentService.create(payment);
        log.info("*********插入成功***********");
        if (result > 0) {
            return new CommonResult(200, "数据插入成功，serverPort" + serverPort, result);
        } else {
            return new CommonResult(404, "数据插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = this.paymentService.getPaymentById(id);
        log.info("*********查询成功*******"+"试下热部署好用吗");
        if (null != payment) {
            return new CommonResult(200, "数据查询成功，serverPort" + serverPort, payment);
        } else {
            return new CommonResult(404, "数没有对应的Id" + id + "记录", null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
