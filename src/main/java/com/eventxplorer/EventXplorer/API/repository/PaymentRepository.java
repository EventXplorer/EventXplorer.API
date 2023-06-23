package com.eventxplorer.EventXplorer.API.repository;

import com.eventxplorer.EventXplorer.API.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
