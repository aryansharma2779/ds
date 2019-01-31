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

public Student remove(int rollNo)
{Student temp=null;
    if(bottom !=-1)
    {
        for(int i=0;i<= bottom;i++)
        {
            if(sectionG[i].getRollno()==rollNo)
            {
              temp =sectionG[i];
                sectionG[i]=null;
                int j;
                for ( j = i; j < sectionG.length-1; j++) {
                  sectionG[j]=sectionG[j+1];

                }
                sectionG[j]=null;
                bottom--;
            }
        }
    }
return temp;
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
        System.out.println(student);
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
        student1.setName("guddu"+i+1);

            list.insert(student1);

    }

        list.display();
        System.out.println("Removed element="+list.remove(5));
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


