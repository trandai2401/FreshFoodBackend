package com.freshfood.hola.repository;

import com.freshfood.hola.model.address.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDistrictRepository extends JpaRepository<District, Long> {
}
