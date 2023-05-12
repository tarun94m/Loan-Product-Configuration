package com.loan.product.Loan_Product_Configuration_2.Repository;

import com.loan.product.Loan_Product_Configuration_2.Entity.Product_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_ID_Repository extends JpaRepository<Product_ID, Integer> {
}
