package com.example.merve.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.merve.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}