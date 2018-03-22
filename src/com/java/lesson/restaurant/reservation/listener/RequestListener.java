package com.java.lesson.restaurant.reservation.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by UserDto on 09.03.2018.
 * @author Igor Iv.
 */
public class RequestListener implements ServletRequestListener {
    public RequestListener() {
        System.out.println(">> RequestListener - NEW");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println(">> ServletRequest - created, contextPath= " + servletRequestEvent.getServletRequest());
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println(">> ServletRequest - destroyed, contextPath= " + servletRequestEvent.getServletRequest());
    }
}