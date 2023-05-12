package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;
import com.loan.product.Loan_Product_Configuration_2.Entity.Loan_Type;

import java.util.List;

public interface Loan_Type_Service {
    public Loan_Type saveLoanType(Loan_Type loanType);

   public void deleteLoanType(int id);

    public List<Loan_Type> getLoanType();
}
