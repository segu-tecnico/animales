package com.segu;

import com.segu.model.Animal;
import com.segu.model.Gato;
import com.segu.model.Perro;

public class Application {

    public static void main(String[] args) {

        Perro fido = new Perro("Fido", 3, "Caniche");
        Gato firulais = new Gato("Firulais", 1, "pelado");
        Perro pedro = new Perro("Pedro", 5, "Dogo argentino");
        Gato michu = new Gato("Firulais", 1, "pelado");
        
        Animal[] listaAnimal = {fido, firulais, pedro, michu};

        extracted(listaAnimal);
    }

    private static void extracted(Animal[] listaAnimal) {
        for (Animal animal : listaAnimal) {
            if(animal instanceof Perro p){
                System.out.println(p.ladrar());
            }
            if(animal instanceof Gato g){
                System.out.println(g.ronronear());
            }
            
        }
    }
}
