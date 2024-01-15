package com.demo.service;

import com.demo.entity.App;
import com.demo.exception.ResourceNotFoundException;
import com.demo.repository.AppRepository;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
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

    @Override
    public App getData(Integer id) {
        App app = appRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Resource Not Found With Id: "+id)
        );
        return app;
    }
}
