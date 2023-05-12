package com.loan.product.Loan_Product_Configuration_2.Service;

import com.loan.product.Loan_Product_Configuration_2.Entity.Customer_Type;
import com.loan.product.Loan_Product_Configuration_2.Entity.Loan_Type;
import com.loan.product.Loan_Product_Configuration_2.Repository.Customer_Type_Repository;
import com.loan.product.Loan_Product_Configuration_2.Repository.Loan_Type_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Loan_Type_Service_Impl implements Loan_Type_Service{

    @Autowired
    private Loan_Type_Repository loanTypeRepository;
    @Override
    public Loan_Type saveLoanType(Loan_Type loanType) {
        return loanTypeRepository.save(loanType);
    }

    @Override
    public void deleteLoanType(int id) {
        loanTypeRepository.deleteById(id);
    }

    @Override
    public List<Loan_Type> getLoanType() {
        return loanTypeRepository.findAll();
    }
}
