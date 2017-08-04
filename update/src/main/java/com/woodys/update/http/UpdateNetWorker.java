package com.woodys.update.http;

import com.woodys.update.callback.CheckUpdateCallback;

/**
 * Created by woodys on 2017/8/3.
 */

public class UpdateNetWorker implements CheckUpdateCallback {

    public void checkUpdate() {

        //HttpRequest.get();

    }


    @Override
    public void onCheckUpdateSuccess(String result) {

    }

    @Override
    public void onCheckUpdateFailure(String failureMessage, int errorCode) {

    }

    @Override
    public boolean isUpdate(String result) {
        return false;
    }
}
