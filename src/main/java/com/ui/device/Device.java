package com.ui.device;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Device {
    private String name;
    private String mac;
    private String uplinkMac;
    // TODO: Add type property

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getUplinkMac() {
        return uplinkMac;
    }

    public void setUplinkMac(String uplinkMac) {
        this.uplinkMac = uplinkMac;
    }
}
