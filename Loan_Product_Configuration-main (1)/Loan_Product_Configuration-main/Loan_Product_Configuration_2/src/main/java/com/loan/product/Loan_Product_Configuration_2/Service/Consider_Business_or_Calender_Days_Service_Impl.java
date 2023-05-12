package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Consider_Business_or_Calender_Days;
import com.loan.product.Loan_Product_Configuration_2.Repository.Consider_Business_or_Calender_Days_Repository;
import com.loan.product.Loan_Product_Configuration_2.Repository.Customer_Category_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Consider_Business_or_Calender_Days_Service_Impl implements Consider_Business_or_Calender_Days_Service{
    @Autowired
    private Consider_Business_or_Calender_Days_Repository considerBusinessOrCalenderDaysRepository;
    @Override
    public Consider_Business_or_Calender_Days saveConsiderBusinessOrCalenderDays(Consider_Business_or_Calender_Days considerBusinessOrCalenderDays) {
        return considerBusinessOrCalenderDaysRepository.save(considerBusinessOrCalenderDays);
    }

    @Override
    public List<Consider_Business_or_Calender_Days> getCustomerCategory() {
        return considerBusinessOrCalenderDaysRepository.findAll();
    }
}
