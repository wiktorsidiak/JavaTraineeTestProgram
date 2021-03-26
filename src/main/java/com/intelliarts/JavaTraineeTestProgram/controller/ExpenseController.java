package com.intelliarts.JavaTraineeTestProgram.controller;

import com.intelliarts.JavaTraineeTestProgram.model.Expense;
import com.intelliarts.JavaTraineeTestProgram.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping(value = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Expense saveExpense(@RequestBody Expense expense){
            return expenseService.save(expense);
    }

    @GetMapping(value = "/{date}")
    @ResponseStatus(HttpStatus.OK)
    public List<Expense> getOrdersByDate(@PathVariable Timestamp date){
        return expenseService.findByDate(date);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteExpense(@RequestParam Timestamp date){
        expenseService.deleteByDate(date);
    }

}