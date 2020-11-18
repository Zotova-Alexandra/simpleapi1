package ru.mtuci.simpleapi.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;
import ru.mtuci.simpleapi.model.employees;
import ru.mtuci.simpleapi.service.EmployeesService;

import java.util.List;
@Slf4j
@RestController
@RequestMapping(value= EmployeesController.REST_URL,produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeesController {
    public static final String REST_URL = "/api/v1/employees";

    private EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService){
        this.employeesService = employeesService;
    }

    @GetMapping(value="/{id}")
    public employees get(@PathVariable("id") Long id){
        log.info("get"+id);
        return employeesService.get(id);
    }

    @GetMapping
    public List<employees> gelAll(){
        log.info("getAll");
        return employeesService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public employees save(@RequestBody employees employees){
        log.info("save"+employees);
        return employeesService.save(employees);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id")Long id){
        log.info("delete"+id);
        employeesService.delete(id);
    }
}
