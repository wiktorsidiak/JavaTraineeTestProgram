package com.intelliarts.JavaTraineeTestProgram.repository;

import com.intelliarts.JavaTraineeTestProgram.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Modifying
    List<Expense> expensesDate(@Param("date") Date date);

    float amountAll(float amount);
}
