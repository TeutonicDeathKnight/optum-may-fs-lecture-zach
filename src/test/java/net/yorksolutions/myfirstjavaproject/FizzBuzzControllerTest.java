package net.yorksolutions.myfirstjavaproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FizzBuzzControllerTest {
    @Autowired
    FizzBuzzController controller;

    @Test
    void fizzbuzz() {
        final RestTemplate rest = new RestTemplate();
        final ResponseEntity<String> actual = rest.getForEntity("http://localhost:8080/fizzbuzz?input=4", String.class);
        assertEquals(HttpStatus.OK, actual.getStatusCode());
        assertEquals("4", actual.getBody());
    }
}