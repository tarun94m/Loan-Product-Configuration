package com.loan.product.Loan_Product_Configuration_2.Controller;

import com.loan.product.Loan_Product_Configuration_2.Entity.Loan_Type;
import com.loan.product.Loan_Product_Configuration_2.Entity.Product_ID;
import com.loan.product.Loan_Product_Configuration_2.Service.Loan_Type_Service;
import com.loan.product.Loan_Product_Configuration_2.Service.Product_ID_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Product_ID_Controller {
    @Autowired
    private Product_ID_Service productIdService;

    @PostMapping("/saveProductID")
    public Product_ID saveProductID(@RequestBody Product_ID productId){
        return productIdService.saveProductID(productId);
    }

    @GetMapping("/getProductID")
    public List<Product_ID> getProductID(){

        return productIdService.getProductID();
    }
}
