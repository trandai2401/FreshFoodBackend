package com.freshfood.hola.service.billitem;

import com.freshfood.hola.model.commerce.BillItem;
import com.freshfood.hola.repository.IBillItemReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BillItemService implements IBillItemService{
    @Autowired
    private IBillItemReponsitory billItemReponsitory;

    @Override
    public Iterable<BillItem> findAll() {
        return billItemReponsitory.findAll();
    }

    @Override
    public Optional<BillItem> findById(Long id) {
        return billItemReponsitory.findById(id);
    }

    @Override
    public BillItem save(BillItem billItem) {
        return billItemReponsitory.save(billItem);
    }

    @Override
    public void remove(Long id) {
        billItemReponsitory.deleteById(id);
    }
}
