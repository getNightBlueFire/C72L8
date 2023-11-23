package test;

//public final class test.Animal {
public class Animal {
    private String name;
    protected int age;
    public int weight;
    boolean canFly;
    @Override
    public String toString(){
        return "test.Animal";
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //public final void doSomething(){
    public void doSomething(Animal animal){
        //animal.name

        //this.name
        System.out.println("Test");
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("");
            return;
        }
        this.age = age;
    }
}
