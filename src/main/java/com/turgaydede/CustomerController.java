package com.turgaydede;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/hello-world")
    public String sayHello(){
        return "Hello world.";
    }

    @GetMapping("/customers")
    public List<Customer> getAll() {
        List<Customer> customers = customerRepository.findAll();
        StringBuilder stringBuilder = new StringBuilder();
        customers.forEach(x->stringBuilder.append(x.getName()+ '-'));
//        return stringBuilder.toString();
        return customers;
    }
}
