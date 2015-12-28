package com.shinemo.mpush.api;

import com.google.common.base.Strings;

/**
 * Created by ohun on 2015/12/22.
 */
public final class SessionContext {
    public String osName;
    public String osVersion;
    public String clientVersion;
    public String deviceId;
    public Cipher cipher;

    public void changeCipher(Cipher cipher) {
        this.cipher = cipher;
    }

    public SessionContext setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public SessionContext setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public SessionContext setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }

    public SessionContext setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public boolean handshakeOk() {
        return !Strings.isNullOrEmpty(deviceId);
    }


    @Override
    public String toString() {
        return "SessionContext{" +
                "osName='" + osName + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", clientVersion='" + clientVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }
}
