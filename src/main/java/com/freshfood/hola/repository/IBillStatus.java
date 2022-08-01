package com.freshfood.hola.repository;

import com.freshfood.hola.model.commerce.BillStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBillStatus extends JpaRepository<BillStatus,Long> {
}
