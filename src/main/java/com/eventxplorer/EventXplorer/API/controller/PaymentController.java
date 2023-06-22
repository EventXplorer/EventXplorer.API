package com.eventxplorer.EventXplorer.API.controller;

import com.eventxplorer.EventXplorer.API.model.Payment;
import com.eventxplorer.EventXplorer.API.service.PaymentService;
import com.eventxplorer.EventXplorer.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin(origins = "https://eventxplorer-firebase-au-647bc.web.app")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private UserService userService;

    //EndPoint:https://eventxplorer-backend.azurewebsites.net/user/{userId}/payment
    //Method: POST
    @RequestMapping(value = "/user/{userId}/payment",method = RequestMethod.POST)
    public ResponseEntity<Object> createPayment(@RequestBody Payment payment,@PathVariable("userId") String userId){
        validatePayment(payment);
        payment.setDate(LocalDate.now());
        paymentService.createPayment(payment);
        payment.setStatus_payment(true);
        return new ResponseEntity<>("Payment is created successfully with id = " + payment.getId() + " by the user with id= " + userId, HttpStatus.CREATED);
    }


    //EndPoint:https://eventxplorer-backend.azurewebsites.net/payment/{id}
    //Method: GET
    @RequestMapping(value = "/payment/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getPaymentById(@PathVariable("id") Long id){
        boolean  isExist = paymentService.isPaymentExist(id);
        if (!isExist){
            return new ResponseEntity<>("Payment is not exist", HttpStatus.NOT_FOUND);
        }else{
            Payment payment = paymentService.getPaymentById(id);
            return new ResponseEntity<>(payment, HttpStatus.OK);
        }
    }

    private void validatePayment (Payment payment) {
        if(payment.getUser()==null || payment.getUser().getId()==null){
            throw new RuntimeException("User is not exist");
        }
    }


}
