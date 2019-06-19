package com.hjh.dao.pojo;

import java.util.Date;

public class Merquery {
    private String merId;
    private String carNum;
    private Date inTime;
    private Date outTime;
    private double charge;

    public Merquery(String merId, String carNum, Date inTime, Date outTime, double charge) {
        this.merId = merId;
        this.carNum = carNum;
        this.inTime = inTime;
        this.outTime = outTime;
        this.charge = charge;
    }


    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }


}
