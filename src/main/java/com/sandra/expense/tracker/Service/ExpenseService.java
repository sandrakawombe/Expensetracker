package com.sandra.expense.tracker.Service;

import com.sandra.expense.tracker.Entity.Expense;
import com.sandra.expense.tracker.Repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExpenseService {

    Expense createExpense(Expense expense);

    Expense updateExpense(Long id, Expense expense);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    void deleteExpenseById(Long id);

}
