import java.util.Scanner;

interface Exam
{
    public void percentageCal();
}

class Students
{
    String name;
    long rollNo;
    double marks1, marks2, marks3, marks4;

    Students(String name, long rollNo, double marks1, double marks2, double marks3, double marks4)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }
}

class Result extends Students implements Exam
{
    double average, percentage;

    Result(String name, long rollNo, double marks1, double marks2, double marks3, double marks4)
    {
        super(name, rollNo, marks1, marks2, marks3, marks4);
        average = 0;
        percentage = 0;
    }

    public void percentageCal()
    {
        average = (marks1 + marks2 + marks3 + marks4);
        percentage = (average / (float) 400) * 100;

        System.out.print("\nPercentage : "+percentage+"%");
    }

    void display()
    {
        System.out.print("\n\nName of the student : "+name+"\n");
        System.out.print("Roll number of the student : "+rollNo);
    }
}

public class Pro6a
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name;
        long rollNo;
        double marks1, marks2, marks3, marks4;

        System.out.print("\nEnter name : ");
        name = scanner.next();

        System.out.print("Enter Roll number : ");
        rollNo = scanner.nextLong();

        System.out.print("Enter marks1 : ");
        marks1 = scanner.nextDouble();

        System.out.print("Enter marks2 : ");
        marks2 = scanner.nextDouble();

        System.out.print("Enter marks3 : ");
        marks3 = scanner.nextDouble();

        System.out.print("Enter marks4 : ");
        marks4 = scanner.nextDouble();

        Result result = new Result(name, rollNo, marks1, marks2, marks3, marks4);

        result.display();
        result.percentageCal();

    }
}