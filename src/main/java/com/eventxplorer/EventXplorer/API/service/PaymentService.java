package com.eventxplorer.EventXplorer.API.service;

import com.eventxplorer.EventXplorer.API.model.Event;
import com.eventxplorer.EventXplorer.API.model.Payment;
import com.eventxplorer.EventXplorer.API.model.User;

import java.util.List;

public interface PaymentService {

    public abstract Payment createPayment(Payment payment);
    public abstract Payment getPaymentById(Long id);
    public abstract boolean isPaymentExist(Long id);

}
