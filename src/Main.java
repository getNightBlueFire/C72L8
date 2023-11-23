import task2.Person;
import test.Animal;
import test.Cat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();


        System.out.println("Hello world!");
        Animal animal = new Animal();

        //animal. = "Test";
        //animal.age = 1;
        animal.weight= 10;


        animal.isCanFly();
        animal.setName("Test");




        //animal.canFly = true;



        System.out.println(animal.toString());

        Cat cat = new Cat();
        cat.doSomething(animal);

        //Object

    }
}