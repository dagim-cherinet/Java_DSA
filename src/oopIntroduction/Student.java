package oopIntroduction;

public class Student {

        int rno;
        String name;
        float marks;
        Student (int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
        void greeting (){
            System.out.println("welcome " + this.name);
        }


}
