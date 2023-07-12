package com.segu.model;

public class Animal {
   //Properties
   protected String nombre;
   protected  Integer edad;
   
   //Getters & Setters
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public Integer getEdad() {
      return edad;
   }
   public void setEdad(Integer edad) {
      this.edad = edad;
   }
   
   
   //Constructor
   public Animal() {
      this.nombre = "";
      this.edad = 0;
   }

   public Animal(String nombre, Integer edad) {
      this.nombre = nombre;
      this.edad = edad;
   }
   
   //Methods
   public String comer(){
      return "Comiendo";
   }

   public String dormir(){
      return "Durmiendo";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
      result = prime * result + ((edad == null) ? 0 : edad.hashCode());
      return result;
   }
   
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Animal other = (Animal) obj;
      if (nombre == null) {
         if (other.nombre != null)
            return false;
      } else if (!nombre.equals(other.nombre))
         return false;
      if (edad == null) {
         if (other.edad != null)
            return false;
      } else if (!edad.equals(other.edad))
         return false;
      return true;
   }
   

   
}
