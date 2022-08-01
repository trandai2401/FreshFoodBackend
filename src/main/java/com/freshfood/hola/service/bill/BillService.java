package com.freshfood.hola.service.bill;

import com.freshfood.hola.model.commerce.Bill;
import com.freshfood.hola.repository.IBillReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BillService implements IBillService{
    @Autowired
    private IBillReponsitory billReponsitory;
    @Override
    public Iterable<Bill> findAll() {
        return billReponsitory.findAll();
    }

    @Override
    public Optional<Bill> findById(Long id) {
        return billReponsitory.findById(id);
    }

    @Override
    public Bill save(Bill bill) {
        return billReponsitory.save(bill);
    }

    @Override
    public void remove(Long id) {
        billReponsitory.deleteById(id);
    }
}
