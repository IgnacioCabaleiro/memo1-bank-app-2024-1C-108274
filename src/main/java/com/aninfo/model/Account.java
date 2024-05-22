package com.aninfo.model;

import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Account {

    @Id
    @ApiModelProperty(hidden = true) 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cbu;

    private Double balance;

    public Account(){

    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}