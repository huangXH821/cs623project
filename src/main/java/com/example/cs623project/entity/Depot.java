package com.example.cs623project.entity;

public class Depot {
    private String depId;
    private String addr;
    private int volume;

    public String getDepId() {
        return depId;
    }

    public void setDep_id(String depId) {
        this.depId = depId;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
