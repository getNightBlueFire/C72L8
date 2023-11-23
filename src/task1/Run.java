package task1;

import java.lang.reflect.Field;

public class Run {
    public static void main(String[] args) throws IllegalAccessException {
        Garage garage = new Garage();
        House house = new House();

        System.out.println(garage.getType());
        System.out.println(house.getType());

        Build build =new Build("11111");

        Field[] fields = Build.class.getDeclaredFields();

        for (Field f: fields){
            System.out.println(f.getName());
            System.out.println(f.getType());


        }

        fields[0].set(build, "test");

    }
}
