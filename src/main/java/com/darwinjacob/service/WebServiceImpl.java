package com.darwinjacob.service;

import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo Application";
    }
}
