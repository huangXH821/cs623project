package com.example.cs623project.entity;

public class Product {
    private String prodId;
    private String pname;
    private int price;

    public String getProdId() {
        return prodId;
    }

    public void setProd_id(String prodId) {
        this.prodId = prodId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
