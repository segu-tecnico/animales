package com.segu.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PerroTest {
   @Test
   void testComer() {
      Perro p = new Perro();
      assertEquals("Comiendo croquetas", p.comer());
   }

   @Test
   void testDormir() {

   }

   @Test
   void testLadrar() {

   }
}
