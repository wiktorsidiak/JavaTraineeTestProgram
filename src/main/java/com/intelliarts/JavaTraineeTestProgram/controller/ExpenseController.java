package com.intelliarts.JavaTraineeTestProgram.controller;

import com.intelliarts.JavaTraineeTestProgram.model.Expense;
import com.intelliarts.JavaTraineeTestProgram.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @PostMapping(value = "expenses/save")
    public Expense saveExpense(@RequestBody Expense expense){
        return expenseService.save(expense);

    }

    @Autowired
    ExpenseService expenseService;

    @GetMapping(value = "expenses/{date}")
    @ResponseBody
    public List<Expense> getOrdersByDate(@PathVariable Date date){
        return expenseService.findAll(date);
    }
    @DeleteMapping(value = "expenses?{date}")
    public void deleteExpence(@PathVariable Date date){
        expenseService.delete(date);
    }

}