package com.demo.service;

import com.demo.entity.App;
import com.demo.repository.AppRepository;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService{
    AppRepository appRepository;

    AppServiceImpl(AppRepository appRepository){
        this.appRepository = appRepository;
    }
    @Override
    public App saveAppData(App app) {
       return appRepository.save(app);
    }
}
