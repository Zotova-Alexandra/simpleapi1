package ru.mtuci.simpleapi.service;

import ru.mtuci.simpleapi.model.employees;

import java.util.List;

public interface EmployeesService {
    employees get(Long id);
    List<employees> getAll();
    employees save(employees employees);
    void delete(Long id);
}
