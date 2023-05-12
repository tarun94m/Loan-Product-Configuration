package com.loan.product.Loan_Product_Configuration_2.Controller;

import com.loan.product.Loan_Product_Configuration_2.Entity.Consider_Business_or_Calender_Days;
import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Category;
import com.loan.product.Loan_Product_Configuration_2.Service.Consider_Business_or_Calender_Days_Service;
import com.loan.product.Loan_Product_Configuration_2.Service.Customer_Category_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Consider_Business_or_Calender_Days_Controller {

    @Autowired
    private Consider_Business_or_Calender_Days_Service considerBusinessOrCalenderDaysService;

    @PostMapping("/saveConsiderBusinessOrCalenderDays")
    public Consider_Business_or_Calender_Days saveConsiderBusinessOrCalenderDays(@RequestBody Consider_Business_or_Calender_Days considerBusinessOrCalenderDays) {
        return considerBusinessOrCalenderDaysService.saveConsiderBusinessOrCalenderDays(considerBusinessOrCalenderDays);
    }

    @GetMapping("/getConsiderBusinessOrCalenderDays")
    public List<Consider_Business_or_Calender_Days> getConsiderBusinessOrCalenderDays(){
        return considerBusinessOrCalenderDaysService.getCustomerCategory();
    }

}
