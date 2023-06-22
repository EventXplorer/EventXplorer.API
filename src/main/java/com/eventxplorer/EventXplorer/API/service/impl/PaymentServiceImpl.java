package com.eventxplorer.EventXplorer.API.service.impl;

import com.eventxplorer.EventXplorer.API.model.Event;
import com.eventxplorer.EventXplorer.API.model.Payment;
import com.eventxplorer.EventXplorer.API.model.User;
import com.eventxplorer.EventXplorer.API.repository.EventRepository;
import com.eventxplorer.EventXplorer.API.repository.PaymentRepository;
import com.eventxplorer.EventXplorer.API.repository.UserRepository;
import com.eventxplorer.EventXplorer.API.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).get();
    }

    @Override
    public boolean isPaymentExist(Long id) {
        return paymentRepository.existsById(id);
    }

}
