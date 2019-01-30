package release;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

    static Student[] sectionG;
    static int bottom;

static void insert(Student student)
{
    if(bottom !=sectionG.length-1)
    {
        bottom++;
        sectionG[bottom]=student;
    }
}

public Arrays1(int numberOfStudent)
{
    sectionG  = new Student[numberOfStudent];
    bottom=-1;
}

public void display()
{
    for(Student student: sectionG)
    {
        System.out.println(student.getName());
    }
}

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Arrays1 list = new Arrays1(37);
    for(int i=0;i<37;i++) {
        Student student1 = new Student();
        //System.out.println("enter roll");
        student1.setRollno(i +1);
        //scan.nextLine();
        //System.out.println("enter name");
        student1.setName("guddu"+i);

            list.insert(student1);

    }
//        for(Student student: sectionG)
//        {
//            if(student!=null)
//        {
//            System.out.println(student);
//        }
//        }
        list.display();
    }

}

class Student
{
    private int rollno;
    private String name;
    //getters and setters

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Override
    public String toString()
    {
        return (rollno + " " +name);
    }
}


