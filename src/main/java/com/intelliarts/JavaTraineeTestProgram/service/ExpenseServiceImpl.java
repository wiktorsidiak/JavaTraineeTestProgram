package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Expense;
import com.intelliarts.JavaTraineeTestProgram.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExpenseServiceImpl implements  ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;
    Expense expense;
 //   @Autowired
//   private CurrencyConverter currencyConverter;

    @Override
    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> findAll(Date date) {
        return expenseRepository.findAll();
    }
    @Override
    public void delete(Date date) {
        expenseRepository.delete(expense);
    }

//    @Override
//    public BigDecimal getTotal() throws CurrencyConverterException {
//        currencyConverter.convertCurrency(order.getAmount(), order.getCurrency(), order.setCurrency());
//        return null;
//    }
}