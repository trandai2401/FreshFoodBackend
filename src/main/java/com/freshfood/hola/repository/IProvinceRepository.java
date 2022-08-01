package com.freshfood.hola.repository;

import com.freshfood.hola.model.address.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProvinceRepository extends JpaRepository<Province, Long> {
}
