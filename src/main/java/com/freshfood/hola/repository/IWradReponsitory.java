package com.freshfood.hola.repository;

import com.freshfood.hola.model.address.Ward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWradReponsitory extends JpaRepository<Ward,Long> {
}
