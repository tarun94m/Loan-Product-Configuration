package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Product_ID;
import com.loan.product.Loan_Product_Configuration_2.Repository.Loan_Type_Repository;
import com.loan.product.Loan_Product_Configuration_2.Repository.Product_ID_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_ID_Service_Impl implements Product_ID_Service{

    @Autowired
    private Product_ID_Repository productIdRepository;
    @Override
    public Product_ID saveProductID(Product_ID productId) {
        return productIdRepository.save(productId);
    }

    @Override
    public List<Product_ID> getProductID() {
        return productIdRepository.findAll();
    }
}
