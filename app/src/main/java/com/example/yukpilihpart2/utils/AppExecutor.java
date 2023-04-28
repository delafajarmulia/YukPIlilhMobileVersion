package com.example.yukpilihpart2.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class AppExecutor {
    private static AppExecutor instance;
    private static AppExecutor getInstance(){
        if(instance == null){
            instance = new AppExecutor();
        }
        return instance;
    }

    private final ScheduledExecutorService mNetwork10 = Executors.newScheduledThreadPool(3);
}
