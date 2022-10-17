package oopIntroduction.staticExample;

public class Human {
    int age;
    String name;
    boolean isMarried;
    static int population = 100;
    public Human(int age, String name, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
    }
    public static void print(String msg){
        System.out.println(msg);
    }
}
