package com.woodys.update.bean;

/**
 * Created by woodys on 2017/7/25.
 * 服务端返回的更新信息实体类
 */

public class UpdateInfo {
    private String appName;//app名称
    private float appSize;//新app大小
    private int appVersionCode;//新app版本号
    private String appVersionName;//新app版本名
    private String appUpdateDesc;//新app更新描述
    private String appReleaseTime;//新app发布时间
    private String updateUrl;//新app下载地址
    private int isForceUpdate;//是否强制更新(可自行与服务端商议,比如0表示强制更新,1表示非强制更新)

    public UpdateInfo() {}

    public UpdateInfo(String appName, float appSize, int appVersionCode,
                      String appVersionName, String appUpdateDesc, String appReleaseTime,
                      String updateUrl, int isForceUpdate) {
        this.appName = appName;
        this.appSize = appSize;
        this.appVersionCode = appVersionCode;
        this.appVersionName = appVersionName;
        this.appUpdateDesc = appUpdateDesc;
        this.appReleaseTime = appReleaseTime;
        this.updateUrl = updateUrl;
        this.isForceUpdate = isForceUpdate;
    }

    public String getAppName() {
        return appName;
    }

    public UpdateInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public float getAppSize() {
        return appSize;
    }

    public UpdateInfo setAppSize(float appSize) {
        this.appSize = appSize;
        return this;
    }

    public int getAppVersionCode() {
        return appVersionCode;
    }

    public UpdateInfo setAppVersionCode(int appVersionCode) {
        this.appVersionCode = appVersionCode;
        return this;
    }

    public String getAppUpdateDesc() {
        return appUpdateDesc;
    }

    public UpdateInfo setAppUpdateDesc(String appUpdateDesc) {
        this.appUpdateDesc = appUpdateDesc;
        return this;
    }

    public String getAppVersionName() {
        return appVersionName;
    }

    public UpdateInfo setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }

    public String getAppReleaseTime() {
        return appReleaseTime;
    }

    public UpdateInfo setAppReleaseTime(String appReleaseTime) {
        this.appReleaseTime = appReleaseTime;
        return this;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public UpdateInfo setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
        return this;
    }

    public int getIsForceUpdate() {
        return isForceUpdate;
    }

    public UpdateInfo setIsForceUpdate(int isForceUpdate) {
        this.isForceUpdate = isForceUpdate;
        return this;
    }
}
