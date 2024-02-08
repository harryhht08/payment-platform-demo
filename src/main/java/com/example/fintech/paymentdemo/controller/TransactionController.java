package com.example.fintech.paymentdemo.controller;

import com.example.fintech.paymentdemo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transactions")
    public String postTransaction(@RequestBody String transaction) {
        transactionService.sendTransaction(transaction);
        return "Published transaction";
    }
}
