package com.example.loan.controller;


import com.example.loan.dto.LoanRequestDto;
import com.example.loan.dto.LoanResponseDto;
import com.example.loan.dto.PaymentRequestDto;
import com.example.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<LoanResponseDto> applyForLoan(@RequestBody LoanRequestDto loanRequestDto) {
        LoanResponseDto response = loanService.applyForLoan(loanRequestDto);
        // Implement the logic to handle loan application
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{loan-Id}")
    public ResponseEntity<LoanResponseDto> getLoanDetails(@PathVariable Long loanId) {
        LoanResponseDto response = loanService.getLoanDetails(loanId);
        // Implement the logic to retrieve loan details
        return ResponseEntity.ok(response);
    }

    @PostMapping("/payment")
    public ResponseEntity<LoanResponseDto> makePayment(@RequestBody PaymentRequestDto paymentRequestDto) {
        LoanResponseDto response = loanService.makePayment(paymentRequestDto);
        // Implement the logic to handle loan payment
        return ResponseEntity.ok(response);

    }

}