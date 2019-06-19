package com.hjh.dao.pojo;

public class Parking {
    private String parkId;
    private String parkLocation;
    private int parkTotal;
    private double charge;

    public Parking(String parkId, String parkLocation, int parkTotal, double charge) {
        this.parkId = parkId;
        this.parkLocation = parkLocation;
        this.parkTotal = parkTotal;
        this.charge = charge;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getParkLocation() {
        return parkLocation;
    }

    public void setParkLocation(String parkLocation) {
        this.parkLocation = parkLocation;
    }

    public int getParkTotal() {
        return parkTotal;
    }

    public void setParkTotal(int parkTotal) {
        this.parkTotal = parkTotal;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
