package oopIntroduction.Singletonclasses;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.print("wow this is singleton class");

    }
}
