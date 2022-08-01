package com.freshfood.hola.service.province;

import com.freshfood.hola.model.address.Province;
import com.freshfood.hola.repository.IProvinceRepository;

import java.util.Optional;

public class ProvinceService implements IProvinceService {
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }
}
