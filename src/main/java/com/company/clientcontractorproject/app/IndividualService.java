package com.company.clientcontractorproject.app;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class IndividualService {

    public boolean isCorrectEmail(String email){
        return email.matches("[0-9]*[A-Za-z]+\\.*\\@[A-Za-z]+\\.[A-Za-z]+");
    }
}