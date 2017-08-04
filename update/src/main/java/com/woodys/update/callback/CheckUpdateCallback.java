package com.woodys.update.callback;

/**
 * Created by woodys on 2017/7/25.
 * 检查更新回调
 */

public interface CheckUpdateCallback {
    /**
     * 检查更新成功
     *
     * @param result    服务端返回的json信息
     */
    void onCheckUpdateSuccess(String result);

    /**
     * 检查更新失败
     *
     * @param failureMessage 失败信息
     * @param errorCode      错误码
     */
    void onCheckUpdateFailure(String failureMessage, int errorCode);

    /**
     * 是否有更新
     * @param result
     * @return
     */
    boolean isUpdate(String result);
}
