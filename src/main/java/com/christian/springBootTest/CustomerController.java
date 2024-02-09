package com.christian.springBootTest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/customers")
public class CustomerController
{
   private static final List<Customer> CUSTOMERS = List.of(
         new Customer(1L, "john", "doe", "john@christian.com"),
         new Customer(2L, "mary", "public", "public@christian.com"),
         new Customer(3L, "elon", "musk", "elon@christian.com"),
         new Customer(4L, "dunny", "duncan", "dunny@christian.com")
   );

   @GetMapping
   public List<Customer> findAllCustomers() {
      return CUSTOMERS;
   }
}
