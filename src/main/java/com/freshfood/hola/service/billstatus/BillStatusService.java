package com.freshfood.hola.service.billstatus;

import com.freshfood.hola.model.commerce.BillStatus;
import com.freshfood.hola.repository.IBillStatusReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BillStatusService implements  IBillStatusService{
    @Autowired
    private IBillStatusReponsitory billStatusReponsitory;
    @Override
    public Iterable<BillStatus> findAll() {
        return billStatusReponsitory.findAll();
    }

    @Override
    public Optional<BillStatus> findById(Long id) {
        return billStatusReponsitory.findById(id);
    }

    @Override
    public BillStatus save(BillStatus billStatus) {
        return billStatusReponsitory.save(billStatus);
    }

    @Override
    public void remove(Long id) {
        billStatusReponsitory.deleteById(id);
    }
}
