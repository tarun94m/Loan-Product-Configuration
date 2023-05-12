package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;

import java.util.List;

public interface Customer_Type_Service {

    public Customer_Type saveCustomerType(Customer_Type customerType);

   public List<Customer_Type> getCustomerType();
}
