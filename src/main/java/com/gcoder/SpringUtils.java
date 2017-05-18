package com.gcoder;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/18.
 */
@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public static <T> T getBean(Class<T> t){
        return ctx.getBean(t);
    }

    public static Object getBean(String clazz) {
        return ctx.getBean(clazz);
    }

    public static ApplicationContext getApplicationContex() {
        return ctx;
    }

}
