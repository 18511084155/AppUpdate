package com.woodys.update;

import com.woodys.update.callback.UpdateChecker;

/**
 * Created by woodys on 2017/7/23.
 * 更新逻辑控制器
 */

public class UpdateManager {
    private UpdateChecker updateChecker;

    /**
     * 检测是否有新版本
     * @return
     */
    public void checkUpdate(){
        /**
        根据全局配置和网络返回控制信息，来判定是：
        1.强制升级

        2.默认升级

        **/

        //发送网络请求，获取到更新数据体

        //获取到返回的结果

        boolean isCheck = updateChecker.check(null);
        if (isCheck){

        }


    }

    /**
     *
     * @return
     */
    public UpdateManager update(){
        return this;
    }



}
