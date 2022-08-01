package com.freshfood.hola.repository;

import com.freshfood.hola.model.commerce.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBillReponsitory extends JpaRepository<Bill,Long> {
}
