package com.wenchao.login;

import android.app.Application;

import com.wenchao.componentlib.IAppComponent;
import com.wenchao.componentlib.ServiceFactory;

/**
 * @author wenchao
 * @date 2019/7/8.
 * @time 13:23
 * description：
 */
public class LoginApplication extends Application implements IAppComponent {

    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void initialize(Application application) {
        ServiceFactory.getInstance().setILoginService(new LoginServiceImpl());
    }
}
