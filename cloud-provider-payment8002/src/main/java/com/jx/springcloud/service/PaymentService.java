package com.jx.springcloud.service;

import com.jx.springcloud.entities.Payment;

public interface PaymentService {

    int create(Payment payment);
    Payment getPaymentById(Long id);
}
