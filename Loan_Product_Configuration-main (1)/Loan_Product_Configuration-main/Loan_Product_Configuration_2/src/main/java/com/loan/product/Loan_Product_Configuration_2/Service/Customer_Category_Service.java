package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Category;
import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;

import java.util.List;

public interface Customer_Category_Service {
   public Customer_Category saveCustomerCategory(Customer_Category customerCategory);

  public List<Customer_Category> getCustomerCategory();


    public void deleteCustomerCategory(int id);
}
