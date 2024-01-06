package com.demo.controller;

import com.demo.entity.App;
import com.demo.service.AppService;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/app")
public class AppController {
    AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @PostMapping
    public ResponseEntity<App> saveData(@RequestBody App app){
        App savedApp = appService.saveAppData(app);
        return new ResponseEntity<>(savedApp, HttpStatus.CREATED);
    }
}
