package com.loan.product.Loan_Product_Configuration_2.Controller;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;
import com.loan.product.Loan_Product_Configuration_2.Entity.Loan_Type;
import com.loan.product.Loan_Product_Configuration_2.Service.Customer_Type_Service;
import com.loan.product.Loan_Product_Configuration_2.Service.Loan_Type_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Loan_Type_Controller {

    @Autowired
    private Loan_Type_Service loanTypeService;

    @PostMapping("/saveLoanType")
    public Loan_Type saveLoanType(@RequestBody Loan_Type loanType){
        return loanTypeService.saveLoanType(loanType);
    }

    @GetMapping("/getLoanType")
    public List<Loan_Type> getLoanType(){

        return loanTypeService.getLoanType();
    }


    @DeleteMapping("/deleteLoanType/{id}")
    public String deleteLoanType(@PathVariable("id") int id){
        loanTypeService.deleteLoanType(id);
        return "id got deleted";
    }
}
