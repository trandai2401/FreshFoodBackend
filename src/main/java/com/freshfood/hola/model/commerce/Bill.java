package com.freshfood.hola.model.commerce;

import com.freshfood.hola.model.EntityAbstract;
import com.freshfood.hola.model.User;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigInteger;

@Data
@Entity
public class Bill extends EntityAbstract {

    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(nullable = false)
    private BillStatus billStatus;

    private BigInteger total;

    private BigInteger transportFee;


    private String address;

    private String phone;

    private String receiver;






}
