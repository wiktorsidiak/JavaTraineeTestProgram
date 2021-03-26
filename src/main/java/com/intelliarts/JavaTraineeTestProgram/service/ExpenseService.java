package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Expense;
import com.intelliarts.JavaTraineeTestProgram.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private RestTemplate restTemplate;
    private final ExpenseRepository expenseRepository;
    
    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> findByDate(Date date) {
        return expenseRepository.expensesDate(date);
    }

    public void deleteByDate(Date date){
        expenseRepository.expensesDate(date).forEach(expenseRepository::delete);
    }
}