package br.edu.infnet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import br.edu.infnet.service.BookServiceApi;

@SpringBootApplication
@EnableFeignClients(basePackages = {"br.edu.infnet.service"})
public class GoogleBooksApiConsumerApplication implements CommandLineRunner {

    @Autowired
    private BookServiceApi bookService;

    public static void main(String[] args) {
        SpringApplication.run(GoogleBooksApiConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("API - Google Books");
        System.out.println("Buscando por: Harry Potter");
        System.out.println(bookService.searchBooks("harry%20potter"));
        System.out.println("--------------------------");       
    }
}
