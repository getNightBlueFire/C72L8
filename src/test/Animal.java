package test;

//public final class test.Animal {
public class Animal {
    private String name;
    int age;
    int weight;
    boolean canFly;
    @Override
    public String toString(){
        return "test.Animal";
    }

    //public final void doSomething(){
    public void doSomething(){
        System.out.println("Test");
    }
}
