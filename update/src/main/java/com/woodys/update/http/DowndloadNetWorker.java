package com.woodys.update.http;


import com.woodys.update.callback.DownloadCallback;

import java.io.File;

/**
 * Created by woodys on 2017/8/3.
 */

public class DowndloadNetWorker implements DownloadCallback {
    @Override
    public void onDownloadSuccess(File file) {

    }

    @Override
    public void onProgress(long currentProgress, long totalProgress) {

    }

    @Override
    public void onDownloadFailure(String failureMessage, int errorCode) {

    }
}
