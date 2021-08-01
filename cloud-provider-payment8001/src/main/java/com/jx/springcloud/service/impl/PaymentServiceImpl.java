package com.jx.springcloud.service.impl;

import com.jx.springcloud.dao.PaymentDao;
import com.jx.springcloud.entities.Payment;
import com.jx.springcloud.service.PaymentService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return this.paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentDao.getPaymentById(id);
    }
}
