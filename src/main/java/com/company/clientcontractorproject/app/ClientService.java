package com.company.clientcontractorproject.app;

import com.company.clientcontractorproject.entity.Client;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClientService {

    @Autowired
    private DataManager dataManager;

    public boolean isCorrectEmail(String email){
        return email.matches("[0-9]*[A-Za-z]+\\.*\\@[A-Za-z]+\\.[A-Za-z]+");
    }


}