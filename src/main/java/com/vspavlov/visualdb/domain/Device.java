package com.vspavlov.visualdb.domain;

import javax.persistence.*;

/**
 * Created by Vasiliy on 13.07.2015.
 */
@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Basic
    private String devicetype;
    private String deviceseries;
    private String devicename;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getDeviceseries() {
        return deviceseries;
    }

    public void setDeviceseries(String deviceseries) {
        this.deviceseries = deviceseries;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }
}
