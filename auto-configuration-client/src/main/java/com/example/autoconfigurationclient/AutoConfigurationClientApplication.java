package com.example.autoconfigurationclient;

import com.demo.config.filestore.FileStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoConfigurationClientApplication implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private FileStore fileStore;


    public static void main(String[] args) {
        SpringApplication.run(AutoConfigurationClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.printEmails();
        fileStore.printFileStoreInfo();
    }
}
