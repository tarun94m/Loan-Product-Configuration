package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Category;
import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;
import com.loan.product.Loan_Product_Configuration_2.Repository.Customer_Category_Repository;
import com.loan.product.Loan_Product_Configuration_2.Repository.Customer_Type_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Customer_Type_Service_Impl implements Customer_Type_Service{
    @Autowired
    private Customer_Type_Repository customerTypeRepository;
    @Override
    public Customer_Type saveCustomerType(Customer_Type customerType) {
        return customerTypeRepository.save(customerType);
    }

    @Override
    public List<Customer_Type> getCustomerType() {
        return customerTypeRepository.findAll();
    }
}
