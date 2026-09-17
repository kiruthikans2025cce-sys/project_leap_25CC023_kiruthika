package com.example.project_leap_25cc023_kiruthika.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository {
    String writeData(String data);
    String readData();
}
