package com.sandra.expense.tracker.Repository;
import com.sandra.expense.tracker.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    Optional<Expense> findById(long id);
    Optional<Expense> findByUserIdAndExpenseId(long userId, long expenseId);
    Optional<Expense> findExpenseByExpenseDate(Date expenseDate);
    Optional<Expense> findExpenseByExpenseAmount(Double expenseAmount);
    Optional<Expense> findTotalExpenseByUserId(long userId);



}
