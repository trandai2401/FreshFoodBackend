package com.freshfood.hola.repository;

import com.freshfood.hola.model.commerce.BillItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBillItemReponsitory extends JpaRepository<BillItem,Long> {
}
