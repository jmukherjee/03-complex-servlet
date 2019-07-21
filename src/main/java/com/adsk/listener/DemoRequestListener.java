package com.adsk.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class DemoRequestListener implements ServletRequestListener {

    public void requestInitialized(ServletRequestEvent event) {
        System.out.println("request initialized: " + event.getServletRequest().getRemoteAddr());
    }

    public void requestDestroyed(ServletRequestEvent event) {
        System.out.println("request destroyed: " + event.getServletRequest().getRemoteAddr());
    }
}