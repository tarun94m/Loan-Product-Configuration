package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Category;
import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;
import com.loan.product.Loan_Product_Configuration_2.Repository.Customer_Category_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Customer_Category_Service_Impl implements Customer_Category_Service{
    @Autowired
    private Customer_Category_Repository customerCategoryRepository;
    @Override
    public Customer_Category saveCustomerCategory(Customer_Category customerCategory) {
        return customerCategoryRepository.save(customerCategory);
    }

    @Override
    public List<Customer_Category> getCustomerCategory() {

        return customerCategoryRepository.findAll();
    }

    public void deleteCustomerCategory(int id) {
        customerCategoryRepository.deleteById(id);
    }


}
