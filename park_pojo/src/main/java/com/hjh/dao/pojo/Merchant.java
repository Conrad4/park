package com.hjh.dao.pojo;

public class Merchant {

        private String merId; // 主键
        private String merName; // 商家名称
        private String parkLocation; //停车场位置
        private int parkTotal;
        private double charge;

        public String getMerId() {
            return merId;
        }

        public void setMerId(String merId) {
            this.merId = merId;
        }

        public String getMerName() {
            return merName;
        }

        public void setMerName(String merName) {
            this.merName = merName;
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

        public Merchant(String merId, String merName, String parkLocation, int parkTotal, double charge) {
            this.merId = merId;
            this.merName = merName;
            this.parkLocation = parkLocation;
            this.parkTotal = parkTotal;
            this.charge = charge;
        }

    public Merchant(String merName, String parkLocation, int parkTotal, double charge) {
        this.merName = merName;
        this.parkLocation = parkLocation;
        this.parkTotal = parkTotal;
        this.charge = charge;
    }

    public Merchant() {
    }
}
