package com.example.beaconscanner;

/**
 * Created by burha on 6/21/2017.
 */

public class BeaconData {
    String uuid;
    String minor;
    String major;
    String tx;
    String distance;
    String rssi;
    String address;


    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    public String getUuid() {

        return uuid;
    }

    public String getMinor() {
        return minor;
    }

    public String getMajor() {
        return major;
    }

    public String getTx() {
        return tx;
    }

    public String getDistance() {
        return distance;
    }

    public String getRssi() {
        return rssi;
    }

    public BeaconData(String uuid, String minor, String major, String tx, String distance, String rssi, String address) {

        this.uuid = uuid;
        this.minor = minor;
        this.major = major;
        this.tx = tx;
        this.distance = distance;
        this.rssi = rssi;
        this.address = address;
    }
}
