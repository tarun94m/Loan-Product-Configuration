package com.loan.product.Loan_Product_Configuration_2.Repository;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_Category_Repository extends JpaRepository<Customer_Category, Integer> {

}
