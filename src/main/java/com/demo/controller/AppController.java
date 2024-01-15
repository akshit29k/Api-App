package com.demo.controller;

import com.demo.entity.App;
import com.demo.service.AppService;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public ResponseEntity<App> getData(@RequestParam Integer id){
        App savedApp = appService.getData(id);
        return new ResponseEntity<>(savedApp, HttpStatus.OK);
    }
}
