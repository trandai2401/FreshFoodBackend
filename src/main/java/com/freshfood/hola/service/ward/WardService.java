package com.freshfood.hola.service.ward;

import com.freshfood.hola.model.address.Ward;
import com.freshfood.hola.repository.IWradReponsitory;

import java.util.Optional;

public class WardService implements IWradService{
    private IWradReponsitory wradReponsitory;

    @Override
    public Iterable<Ward> findAll() {
        return wradReponsitory.findAll();
    }

    @Override
    public Optional<Ward> findById(Long id) {
        return wradReponsitory.findById(id);
    }

    @Override
    public Ward save(Ward ward) {
        return wradReponsitory.save(ward);
    }

    @Override
    public void remove(Long id) {
        wradReponsitory.deleteById(id);
    }
}
