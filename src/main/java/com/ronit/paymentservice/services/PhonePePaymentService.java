package com.ronit.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class PhonePePaymentService implements PaymentService {
    @Override
    public String generatePaymentLink(String orderId) {
        return "";
    }
}
