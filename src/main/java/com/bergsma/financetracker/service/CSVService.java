package com.bergsma.financetracker.service;

import com.bergsma.financetracker.helper.CSVHelper;
import com.bergsma.financetracker.model.Finance;
import com.bergsma.financetracker.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVService {
    @Autowired
    FinanceRepository repository;

    public void save(MultipartFile file) {
        try {
            List<Finance> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<Finance> getAllTutorials() {
        return repository.findAll();
    }


}
