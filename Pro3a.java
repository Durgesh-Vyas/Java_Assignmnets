import java.io.*;
import java.util.*;

class DateOfBirth
{
    String DoB;

    DateOfBirth()
    {
        DoB = "";
    }
}


class Student extends DateOfBirth implements Comparable<Student>
{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); Scanner sc = new Scanner(System.in);

    static int count = 0; double grade;
    String name;
    int i, size, rollNo, total, newTotal, newRollNo, searchRollNo, flag = 0;
    String newName, newDoB, searchName;

    Student()
    {

        name = ""; rollNo = -1;
        total = -1;
    }

    void getData() throws IOException
    {
        System.out.print("\nEnter Name : ");
        name = in.readLine();

        System.out.print("Enter Date of Birth (Like 26th February 2002) : ");
        DoB = in.readLine();

        System.out.print("Enter Roll No : ");
        rollNo = sc.nextInt();

        System.out.print("Enter the total marks (out of 500) : ");
        total = sc.nextInt();

        System.out.print("\n");
    }

    void display()
    {
        System.out.print("\n\tStudent Name : "+name);
        System.out.print("\n\tStudent Date of Birth : "+DoB);
        System.out.print("\n\tStudent Roll No. : "+rollNo);
        System.out.print("\n\tStudent Total marks : "+total);

        grade = (float)(total / 5);

        if(grade > 100)
            System.out.print("\n\tYou have entered wrong marks.");
        if(grade >= 90 && grade <= 100)
            System.out.print("\n\tStudents grade is 'A'.");
        if(grade >= 70 && grade < 90)
            System.out.print("\n\tStudents grade is 'B+'.");
        if(grade >= 50 && grade < 70)
            System.out.print("\n\tStudents grade is 'B'.");
        if(grade >= 40 && grade < 50)
            System.out.print("\n\tStudents grade is 'C'.");
        if(grade < 40)
            System.out.print("\n\tStudents has Failed.");
        if(grade < 0)
            System.out.print("\n\tYou have entered wrong marks.");

        System.out.print("\n");
    }

    @Override
    public int compareTo(Student student1)
    {
        return(this.total - student1.total);
    }

    @Override
    public String toString()
    {
        return "\nName : " +name+ ";\tDate of Birth : " +DoB+ ";\tRoll No. : " +rollNo+ ";\tTotal : " +total+ "\n";
    }
}


class Stud extends Student
{
    static Student[] s = new Student[100];

    List<Student> student = new ArrayList<>();

    void Create()throws IOException
    {
        System.out.print("\nEnter how many students data you wanna enter : ");
        size = sc.nextInt();

        for(i = 0; i < size; i++)
        {
            s[i] = new Student();

            System.out.println("\nEnter data of student "+(i + 1)+" : ");
            s[i].getData();
        }
        count = size + count;
    }

    void Insert()throws IOException
    {
        System.out.print("\nEnter how many more students data you wanna enter : ");
        size = sc.nextInt();

        for(i = count; i < (size + count); i++)
        {
            s[i] = new Student();

            System.out.println("\nEnter data of student "+(i + 1)+" : ");
            s[i].getData();
        }
        count = size + count;
    }


    void EditName()throws IOException
    {
        System.out.print("\nEnter the Name you wanna edit : ");
        searchName = in.readLine();

        for(i = 0; i < count; i++)
        {
            if(searchName.equals(s[i].name))
            {
                System.out.print("\nEnter new name : ");
                newName = in.readLine();

                s[i].name = newName;

                flag = flag + 1;
            }
        }
        if(flag == 1)
            System.out.print("\nName has been changed.");
        else
            System.out.print("\n\t\tNo name found!");
    }

    void EditRollNo()
    {
        System.out.print("\nEnter the Roll No. you wanna edit : ");
        searchRollNo = sc.nextInt();

        for(i = 0; i < count; i++)
        {
            if(s[i].rollNo == searchRollNo)
            {
                System.out.print("\nEnter new Roll No. : ");
                newRollNo = sc.nextInt();

                s[i].rollNo = newRollNo;

                flag = flag + 1;
            }
        }
        if(flag == 1)
            System.out.print("\nRoll No. has been changed.");
        else
            System.out.print("\n\t\tNo Roll No. found!");
    }

    void EditTotal()throws IOException
    {
        System.out.print("\nEnter the Name you wanna edit : ");
        searchName = in.readLine();

        for(i = 0; i < count; i++)
        {
            if(searchName.equals(s[i].name))
            {
                System.out.print("\nEnter new total : ");

                newTotal = sc.nextInt();

                s[i].total = newTotal;

                flag = flag + 1;
            }
        }
        if(flag == 1)
            System.out.print("\nTotal has been changed.");
        else
            System.out.print("\n\t\tNo student with this Total found!");
    }

    void EditDOB()throws IOException
    {
        System.out.print("\nEnter the Name you wanna edit : ");
        searchName = in.readLine();

        for(i = 0; i < count; i++)
        {
            if(searchName.equals(s[i].name))
            {
                System.out.print("\nEnter new Date of Birth : ");
                newDoB = in.readLine();

                s[i].DoB = newDoB;

                flag = flag + 1;
            }
        }
        if(flag == 1)
            System.out.print("\nDate of Birth has been changed.");
        else
            System.out.print("\n\t\tNo student with this date of birth found!");
    }

    void DeleteByName()throws IOException
    {
        System.out.print("\nEnter the Name you wanna delete : ");
        searchName = in.readLine();

        for(i = 0; i < count; i++)
        {
            if(searchName.equals(s[i].name))
            {
                if(i == 0)
                {
                    s[i] = s[i+1];

                    flag = flag + 1;
                    count = count - 1;
                }

                if(i != 0)
                {
                    s[i] = s[i-1];

                    flag = flag + 1;
                    count = count - 1;
                }
            }
        }
        if(flag == 1)
            System.out.print("\nRecord has been deleted.");
        else
            System.out.print("\n\t\tNo Name found!");
    }

    void DeleteByRollNo()
    {
        System.out.print("\nEnter the Roll No. you wanna delete : ");
        searchRollNo = sc.nextInt();

        for(i = 0; i < count; i++)
        {
            if (searchRollNo == s[i].rollNo)
            {
                if(i == 0)
                {
                    s[i] = s[i+1];

                    flag = flag + 1;
                    count = count - 1;
                }
                if(i != 0)
                {
                    s[i] = s[i-1];

                    flag = flag + 1;
                    count = count - 1;
                }
            }
        }
        if(flag == 1)
            System.out.print("\nRecord has been deleted.");
        else
            System.out.print("\n\t\tNo Roll No. found!");
    }

    void Sort()
    {
        for(i = 0; i < count; i++)
            student.add(s[i]);

        System.out.print("\n\nUnsorted database : "+student);

        Collections.sort(student);

        System.out.print("\n\nSorted database : "+student);
    }

    void display1()
    {
        if(count != 0)
        {
            for(i = 0; i < count; i++)
            {
                System.out.print("\nDetails of student "+(i + 1)+" : ");
                s[i].display();
            }
        }
        else
            System.out.print("\nEnter data first!");
    }
}


public class Pro3a
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Stud s1 = new Stud();

        int choice1, choice;

        try
        {
            while(true)
            {
                System.out.println("\n\n\tHere are your choices : ");
                System.out.println("1)Create database of student.");
                System.out.println("2)Insert data of new student in database.");
                System.out.println("3)Edit student database.");
                System.out.println("4)Delete a student in the database.");
                System.out.println("5)Display student database.");
                System.out.println("6)Sort student database(by Total).");
                System.out.println("7)Exit");
                System.out.print("\t\tPlease enter your choice : ");
                choice = scan.nextInt();

                switch (choice)
                {
                    case 1:
                    {
                        s1.Create();

                        break;
                    }

                    case 2:
                    {
                        s1.Insert();
                        break;
                    }

                    case 3:
                    {
                        if(Student.count != 0)
                        {
                            System.out.println("\n\tHere are your options : ");
                            System.out.println("1)Edit Name.");
                            System.out.println("2)Edit Roll No.");
                            System.out.println("3)Edit Total.");
                            System.out.println("4)Edit Date of Birth.");
                            System.out.print("\t\tEnter your choice : ");
                            choice1 = scan.nextInt();

                            switch(choice1)
                            {
                                case 1 :
                                {
                                    s1.EditName();
                                    break;
                                }

                                case 2 :
                                {
                                    s1.EditRollNo();
                                    break;
                                }

                                case 3 :
                                {
                                    s1.EditTotal();
                                    break;
                                }

                                case 4 :
                                {
                                    s1.EditDOB();
                                    break;
                                }
                            }
                        }
                        else
                            System.out.print("\nEnter data first!");

                        break;

                    }

                    case 4:
                    {
                        if(Student.count != 0)
                        {
                            System.out.println("\n\tHere are your options : ");
                            System.out.println("1)Delete by Name.");
                            System.out.println("2)Delete by Roll No.");
                            System.out.print("\t\tEnter your choice : ");
                            choice1 = scan.nextInt();

                            switch(choice1)
                            {
                                case 1:
                                {
                                    s1.DeleteByName();
                                    break;
                                }

                                case 2:
                                {
                                    s1.DeleteByRollNo();
                                    break;
                                }
                            }
                        }
                        else
                            System.out.print("\nEnter data first!");

                        break;
                    }

                    case 5:
                    {
                        s1.display1();
                        break;
                    }

                    case 6:
                    {
                        s1.Sort();
                        break;
                    }

                    case 7:
                    {
                        System.out.print("\n\nThank You!!"); System.exit(0);
                    }

                    default:
                        System.out.print("\nPlease enter a valid choice.");
                }
            }
        }

        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}