package com.josamtechie.api.controller;

import com.josamtechie.api.entity.Employee;
import com.josamtechie.api.service.EmployeeService;
import com.josamtechie.api.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @Autowired
    private ReportService reportService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {

        return service.findAll();
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return reportService.exportReport(format);
    }

}
