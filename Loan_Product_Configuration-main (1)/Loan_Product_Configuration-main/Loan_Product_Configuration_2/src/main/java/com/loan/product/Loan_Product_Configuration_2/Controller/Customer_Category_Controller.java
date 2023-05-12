package com.loan.product.Loan_Product_Configuration_2.Controller;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Category;
import com.loan.product.Loan_Product_Configuration_2.Service.Customer_Category_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Customer_Category_Controller {
    @Autowired
    private Customer_Category_Service customerCategoryService;

    @PostMapping("/saveCustomerCategory")
    public Customer_Category saveCustomerCategory(@RequestBody Customer_Category customerCategory){
        return customerCategoryService.saveCustomerCategory(customerCategory);
    }

    @GetMapping("/getCustomerCategory")
    public List<Customer_Category> getCustomerCategory(){

        return customerCategoryService.getCustomerCategory();
    }

    @DeleteMapping("/deleteCustomerCategory/{id}")
    public String deleteCustomerCategory(@PathVariable("id") int id){
        customerCategoryService.deleteCustomerCategory(id);
        return "id got deleted";
    }
}
