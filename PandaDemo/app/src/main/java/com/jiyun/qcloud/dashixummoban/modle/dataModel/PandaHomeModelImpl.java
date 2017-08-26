package com.jiyun.qcloud.dashixummoban.modle.dataModel;


import com.jiyun.qcloud.dashixummoban.config.Urls;
import com.jiyun.qcloud.dashixummoban.entity.PandaHome;
import com.jiyun.qcloud.dashixummoban.entity.homeentily.BillowingBean;
import com.jiyun.qcloud.dashixummoban.entity.homeentily.WonderfulBean;
import com.jiyun.qcloud.dashixummoban.modle.net.callback.NetWorkCallBack;

/**
 * Created by xingge on 2017/7/26.
 */

public class  PandaHomeModelImpl implements IPandaHomeModel {
    @Override
    public void loadHomeList(NetWorkCallBack<PandaHome> callback) {
        iHttp.get(Urls.HOMELUN,null,callback);
    }

    @Override
    public void loadJingCaiList(NetWorkCallBack<WonderfulBean> callback) {
        iHttp.get(Urls.WONDERFUL,null,callback);
    }

    @Override
    public void loadGunGunList(NetWorkCallBack<BillowingBean> callback) {
        iHttp.get(Urls.BILLOWING,null,callback);
    }
}
