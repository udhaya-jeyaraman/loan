package com.example.loan.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentDto {

    private Long loanId;
    private BigDecimal paymentAmount;
}
