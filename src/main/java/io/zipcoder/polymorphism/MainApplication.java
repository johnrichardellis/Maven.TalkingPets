package io.zipcoder.polymorphism;
//import io.zipcoder.pets.Pet;
//import io.zipcoder.pets.Cat;
//import io.zipcoder.pets.Dog;
//import io.zipcoder.pets.Mouse;
import pets.Cat;
import pets.Dog;
import pets.Mouse;
import pets.Pet;
//import pets.Cat;
//import pets.Dog;
//import pets.Mouse;
//import pets.Pet;


import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many pets do you own?");
        Integer numberOfPets = input.nextInt();

        ArrayList<Pet> listOfPets = new ArrayList<Pet>();

        for (int i = 0; i < numberOfPets; i++) {
            String petType = getTypeOfPet().toLowerCase();
            String petName = getPetName();

            if (petType.equals("cat")) {
                Cat cat = new Cat(petName);
                listOfPets.add(cat);
            }

            if (petType.equals("dog")) {
                Dog dog = new Dog(petName);
                listOfPets.add(dog);
            }

            if (petType.equals("mouse")) {
                Mouse mouse = new Mouse(petName);
                listOfPets.add(mouse);
            }

            if (petType.equals("pet")) {
                Pet pet = new Pet(petName);
                listOfPets.add(pet);
            }
        }

        for (int i = 1; i <= listOfPets.size(); i++) {
            System.out.println(listOfPets.get(i - 1).getName() + " says " + listOfPets.get(i - 1).speak());

        }


    }

    public static String getTypeOfPet() {
        System.out.println("What type of pet do you have?");
        String petType = input.next();
        return petType;
    }


    public static String getPetName() {
        System.out.println("What's your pets name?");
        String petName = input.next();
        return petName;
    }

}
