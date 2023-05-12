package com.loan.product.Loan_Product_Configuration_2.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Loan_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String loanType;
}
