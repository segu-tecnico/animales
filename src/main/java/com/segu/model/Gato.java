package com.segu.model;

public class Gato extends Animal{
   
   private String pelaje;

   public String getPelaje() {
      return pelaje;
   }
   public void setPelaje(String pelaje) {
      this.pelaje = pelaje;
   }

   public Gato() {
      super();
      this.pelaje = "";
   }

   public Gato(String nombre, Integer edad, String pelaje) {
      super(nombre, edad);
      this.pelaje = pelaje;
   }

   public String ronronear(){
      return "Prrrrrr";
   }

   @Override
   public String comer() {
      return "Comiendo pescado";
   }

   @Override
   public String dormir() {
      return "Durmiendo en cama de mi dueño";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1 * super.hashCode();
      result = prime * result + ((pelaje == null) ? 0 : pelaje.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if(!super.equals(obj))
         return false;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Gato other = (Gato) obj;
      if (pelaje == null) {
         if (other.pelaje != null)
            return false;
      } else if (!pelaje.equals(other.pelaje))
         return false;
      return true;
   }

}
