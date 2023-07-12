package com.segu.model;

public class Perro extends Animal{
   
   private String raza;

   public String getRaza() {
      return raza;
   }
   public void setRaza(String raza) {
      this.raza = raza;
   }


   public Perro() {
      super();
      this.raza = "";
   }

   public Perro(String nombre, Integer edad, String raza) {
      super(nombre, edad);
      this.raza = raza;
   }
   
   public String ladrar(){
      return "Guau Guau!";
   }

   @Override
   public String comer() {
      return "Comiendo croquetas";
   }

   @Override
   public String dormir() {
      return "Arruinando el sofa";
   }

   

}
