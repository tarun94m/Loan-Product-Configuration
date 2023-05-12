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
public class Consider_Business_or_Calender_Days {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String consider_Business_or_Calender_Days;
}
