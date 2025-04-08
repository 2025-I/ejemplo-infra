package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class EjercicioTest {

  private Ejercicio ejercicio = new Ejercicio();

	@Test
	void suma() {
    assertEquals(3, ejercicio.suma(1, 2));

	}



}
