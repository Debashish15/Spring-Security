package com.springrest.security;

import com.springrest.security.Controllers.mvcController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(SecurityApplication.class, args);

        mvcController controller = context.getBean(mvcController.class);
        controller.web();

        System.out.println("Spring Security Application Started....");

    }

}
