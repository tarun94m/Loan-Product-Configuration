package com.loan.product.Loan_Product_Configuration_2.Repository;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_Type_Repository extends JpaRepository<Customer_Type, Integer> {
}
