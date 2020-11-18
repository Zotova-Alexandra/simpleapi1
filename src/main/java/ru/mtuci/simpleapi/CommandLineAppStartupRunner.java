package ru.mtuci.simpleapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleapi.dao.ProductRepository;
import ru.mtuci.simpleapi.model.employees;


@Component
public class CommandLineAppStartupRunner implements CommandLineRunner{

    private final ProductRepository productRepository;

    @Autowired
    public CommandLineAppStartupRunner(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public void run(String...args) throws Exception {
        System.out.println(productRepository.findById(3L).get());
        System.out.println("HelloHello");
    }

}
