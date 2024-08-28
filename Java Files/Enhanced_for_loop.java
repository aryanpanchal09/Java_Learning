class Student
{
    int rollno;
    String name;
    int marks;
}

public class Enhanced_for_loop 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Aryan";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Umang";
        s2.marks = 89;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Jay";
        s3.marks = 90;

        Student students[] = new Student[3]; // We are creating an array which can hold student refrences
        // It can't create object by itself
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //Advanced loop which only works for Array & Array types of data

        //Loop Iterate between all the value and give me 1 value at a time

        for(Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
    
}
