package com.example.cs623project.entity;

public class Stock {
    private String prodId;
    private String depId;
    private int quantity;

    public String getProdId() {
        return prodId;
    }

    public void setProd_id(String prodId) {
        this.prodId = prodId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDep_id(String depId) {
        this.depId = depId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
