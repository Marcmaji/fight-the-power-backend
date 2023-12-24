package com.marmaji.fightThePowerBackend.infrastructure.http.adapters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusAdapter {

    @GetMapping(path = "/")
    public String statusCheck(){
        return "Fight The Power Backend is alive";
    }
}
