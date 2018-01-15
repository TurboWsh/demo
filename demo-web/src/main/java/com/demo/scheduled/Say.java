package com.demo.scheduled;

import java.util.Date;

/**
 * @author Turbo
 * @date 17/5/26.
 */
public class Say implements Runnable {
    @Override
    public void run() {
        System.out.println("" + new Date() + " hello");
    }
}
