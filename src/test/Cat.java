package test;

public class Cat extends Animal {

    @Override
    public void doSomething(Animal animal) {
        //-animal.name
        //-super.name

        System.out.println(animal.age);

        System.out.println(super.age);

        System.out.println(animal.canFly);

        System.out.println(super.canFly);


        System.out.println("test");
    }
}
