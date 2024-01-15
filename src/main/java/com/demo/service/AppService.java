package com.demo.service;

import com.demo.entity.App;

public interface AppService {
    public App saveAppData(App app);

    App getData(Integer id);
}
