package ru.mtuci.simpleapi.service;

import org.springframework.stereotype.Service;
import ru.mtuci.simpleapi.dao.ProductRepository;
import ru.mtuci.simpleapi.model.employees;

import java.util.List;
@Service
public class EmployeesServiceImpl implements EmployeesService {

    private final ProductRepository productRepository;

    public EmployeesServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public employees get(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<employees> getAll() {
        return productRepository.findAll();
    }

    @Override
    public employees save(employees employees) {
        return productRepository.save(employees);
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);

    }
}
