package com.prudential.assignment.CarRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CarRentalApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(CarRentalApp.class, args);
    }
    

   
}
