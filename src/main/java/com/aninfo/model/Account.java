package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cbu;

    private Double balance;

    @Column(name = "promo_applied")
    private Double promoApplied;

    public Account(){
    }

    public Account(Double balance) {
        this.balance = balance;
    }

 
    public Double getPromoApplied() {
        return promoApplied;
    }

    public void setPromoApplied(Double promoApplied) {
        this.promoApplied = promoApplied;
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
