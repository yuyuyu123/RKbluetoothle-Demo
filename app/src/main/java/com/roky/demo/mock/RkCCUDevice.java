package com.roky.demo.mock;

/**
 * 中控设备
 * Created by apple on 16/5/24.
 */
public class RkCCUDevice {

    private String sn;

    private String macAddress;

    private String authCode;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}
