package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Expense;

import java.util.Date;
import java.util.List;

public interface ExpenseService {
    Expense save(Expense expense);
    List<Expense> findAll(Date date);
    void delete(Date date);

 //   BigDecimal getTotal() throws CurrencyConverterException;

}
