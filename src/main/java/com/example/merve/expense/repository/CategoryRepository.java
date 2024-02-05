package com.example.merve.expense.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.merve.expense.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}