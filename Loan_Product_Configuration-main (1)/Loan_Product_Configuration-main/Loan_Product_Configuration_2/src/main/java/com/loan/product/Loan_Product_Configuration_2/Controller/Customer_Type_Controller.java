package com.loan.product.Loan_Product_Configuration_2.Controller;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Category;
import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;
import com.loan.product.Loan_Product_Configuration_2.Service.Customer_Category_Service;
import com.loan.product.Loan_Product_Configuration_2.Service.Customer_Type_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Customer_Type_Controller {

    @Autowired
    private Customer_Type_Service customerTypeService;

    @PostMapping("/saveCustomerType")
    public Customer_Type saveCustomerType(@RequestBody Customer_Type customerType){
        return customerTypeService.saveCustomerType(customerType);
    }

    @GetMapping("/getCustomerType")
    public List<Customer_Type> getCustomerType(){
        return customerTypeService.getCustomerType();
    }

}
