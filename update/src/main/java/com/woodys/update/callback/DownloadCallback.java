package com.woodys.update.callback;

import java.io.File;

/**
 * Created by woodys on 2017/7/25.
 * 下载状态回调
 */

public interface DownloadCallback {
    /**
     * 下载成功
     *
     * @param file 返回的文件
     */
    void onDownloadSuccess(File file);

    /**
     * 实时下载进度
     *
     * @param currentProgress 当前下载进度(单位:字节)
     * @param totalProgress   文件总大小(单位:字节)
     */
    void onProgress(long currentProgress, long totalProgress);

    /**
     * 下载失败
     *
     * @param failureMessage 失败信息(捕获的异常信息)
     */
    void onDownloadFailure(String failureMessage, int errorCode);
}
