package com.loan.product.Loan_Product_Configuration_2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer_Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String customerCategory;
    @OneToOne(cascade =  CascadeType.ALL)
    private Customer_Type customerType;

}
