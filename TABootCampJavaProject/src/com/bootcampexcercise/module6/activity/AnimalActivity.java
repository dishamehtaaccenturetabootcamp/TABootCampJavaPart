package com.bootcampexcercise.module6.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        //TODO: Use interfaces to declare identifiers instead of the actual classes
        Animal cat = new Cat();
        //TODO: Create Dog using interface Animal



        Mammal mammal = new Mammal("Flexy");

        //TODO: For mammal set animal to cat
        mammal.setAnimal(cat);
        //TODO: execute for mammal animalIsSleeping()

        //TODO: execute for mammal animalIsSpeaking()

        //TODO: For mammal set animal to dog

        //TODO: execute for mammal animalIsSleeping()

        //TODO: execute for mammal animalIsSpeaking()
    }
}
