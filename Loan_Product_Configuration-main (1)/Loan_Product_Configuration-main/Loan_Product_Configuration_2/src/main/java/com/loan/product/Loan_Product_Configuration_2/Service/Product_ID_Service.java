package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Product_ID;

import java.util.List;

public interface Product_ID_Service {
   public Product_ID saveProductID(Product_ID productId);

  public List<Product_ID> getProductID();
}
