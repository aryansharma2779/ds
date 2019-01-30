import java.util.Arrays;
class Student
{
    private String name;
    private long rollNumber;

    public String getName()
    {
        return name;
    }

//    public void setName(String name)
//    {
//        this.name = name;
//    }

    public long getRollNumber()
    {
        return rollNumber;
    }

//    public void setRollNumber(long rollNumber)
//    {
//        this.rollNumber = rollNumber;
//    }

    public Student(String name, long rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString()
    {
        return "(" + this.getName() + ", "
                + this.getRollNumber() + ")";
    }
}

class classListADT {
    Student[] class1 = new Student[37];
    int listBottom = -1;
    int size = 0;

    void insert(Student student)
    {
        if (!isFull())
        {
            listBottom++;
            class1[listBottom] = student;
            size++;
        }
    }

    Student remove(long roll)
    {
        Student removedStudent = null;
        for (int i = 0; i < class1.length; i++)
        {
            if (roll == class1[i].getRollNumber())
            {
                removedStudent = class1[i];
                class1[i] = null;
                size--;
                int i1;
                for (i1 = i; i1 < class1.length - 1; i1++)
                {
                    class1[i1] = class1[i1 + 1];
                }
                class1[i1] = null;
                listBottom = i1 - 1;
            }
        }
        return removedStudent;
    }

    boolean isFull()
    {
        boolean response = false;

        if (listBottom == class1.length - 1)
        {
            response = true;
        }

        return response;
    }

    public static void main(String[] args)
    {
        classListADT sectionG = new classListADT();
        sectionG.insert(new Student("Guddu", 1));
        System.out.println(Arrays.toString(sectionG.class1));
        //sectionG.remove(1);
        //System.out.println(Arrays.toString(sectionG.class1));
    }
}
