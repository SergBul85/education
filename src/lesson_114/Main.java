package lesson_114;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal[] arrayOfAnimals = {dog, cat};

        try{
            Cat cat2 = (Cat) arrayOfAnimals[0];
            Dog dog2 = (Dog) arrayOfAnimals[1];
        }catch (ClassCastException e){
            System.out.println("Mi poluchili exception");
        }

    }


}

class Animal {
}

class Cat extends Animal {
}

class Dog extends Animal {
}

