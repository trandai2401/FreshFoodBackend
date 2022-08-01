package com.freshfood.hola.service.district;

import com.freshfood.hola.model.address.District;
import com.freshfood.hola.repository.IDistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DistrictService implements IDistrictService{
    @Autowired
    private IDistrictRepository districtRepository;
    @Override
    public Iterable<District> findAll() {
        return districtRepository.findAll();
    }

    @Override
    public Optional<District> findById(Long id) {
        return districtRepository.findById(id);
    }

    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    @Override
    public void remove(Long id) {
        districtRepository.deleteById(id);
    }
}
