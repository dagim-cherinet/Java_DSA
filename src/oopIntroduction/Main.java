package oopIntroduction;
import static oopIntroduction.differentPackage.Console.consoleLog;
public class Main {
    public static void main(String[] args) {
    Student dagim = new Student(11, "dagim", 99.80f);

        //System.out.println(dagim.name);
        consoleLog(dagim.name);
    }
}

