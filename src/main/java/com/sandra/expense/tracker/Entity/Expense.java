package com.sandra.expense.tracker.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Expense {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long expenseId;

    @Column(nullable = false)
    private String expenseName;

    @Column(nullable = false)
    private String expenseCategory;

    @Column(nullable = false)
    private LocalDate expenseDate;

    @Column(nullable = false)
    private Double expenseAmount;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;


}
