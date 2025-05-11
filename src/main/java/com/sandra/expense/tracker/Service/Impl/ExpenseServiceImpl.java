package com.sandra.expense.tracker.Service.Impl;

import com.sandra.expense.tracker.Entity.Expense;
import com.sandra.expense.tracker.Repository.ExpenseRepository;
import com.sandra.expense.tracker.Service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Override
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    //update the expense
    @Override
    public Expense updateExpense(Long id, Expense updatedExpense) {
        Expense existingExpense = expenseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));

        existingExpense.setExpenseName(updatedExpense.getExpenseName());
        existingExpense.setExpenseCategory(updatedExpense.getExpenseCategory());
        existingExpense.setExpenseDate(updatedExpense.getExpenseDate());
        existingExpense.setExpenseAmount(updatedExpense.getExpenseAmount());

        return expenseRepository.save(existingExpense);
    }

    @Override
    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
