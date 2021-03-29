import java.io.*;
import java.util.*;

class Pro3b
{
    static  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static  Scanner sc = new Scanner(System.in);

    static int i, j, newEmpAdd = 0, newTotal = 0, size, ID, choice, salary, choice1, delID, searchID;
    static String name, gender, jobTitle, org, delName, compName1, compName2, searchName;

    static Vector<String> EmpName = new Vector<>();
    static Vector<Integer> EmpID = new Vector<>();
    static Vector<String> EmpGender = new Vector<>();
    static Vector<String> EmpTitle = new Vector<>();
    static Vector<String> EmpOrg = new Vector<>();
    static Vector<Integer> EmpSalary = new Vector<>();

    static void display()
    {
        System.out.println("Employee Name : "+EmpName);
        System.out.println("Employee ID : "+EmpID);
        System.out.println("Employee Gender : "+EmpGender);
        System.out.println("Employee Title : "+EmpTitle);
        System.out.println("Employee Organization : "+EmpOrg);
        System.out.println("Employee ID : "+EmpSalary);
    }


    static void create()throws IOException
    {
        System.out.print("\n\nEnter the numbers of employees you wanna add : ");
        size = sc.nextInt();

        for(i = 0; i < size; i++)
        {
            System.out.println("\nEnter Employee Name : ");
            name = in.readLine();
            EmpName.add(name);

            System.out.println("Enter Employee ID : ");
            ID = sc.nextInt();
            EmpID.add(ID);

            System.out.println("Enter Employee Gender : ");
            gender = in.readLine();
            EmpGender.add(gender);

            System.out.println("Enter Employee Job Title : ");
            jobTitle = in.readLine();
            EmpTitle.add(jobTitle);

            System.out.println("Enter Employee Organization : ");
            org = in.readLine();
            EmpOrg.add(org);

            System.out.println("Enter Employee Salary : ");
            salary = sc.nextInt();
            EmpSalary.addElement(salary);
        }
    }


    static void insert(int n)throws IOException
    {
        for(i = 0; i < n; i++)
        {
            System.out.println("\nEnter Employee Name : ");
            name = in.readLine();
            EmpName.addElement(name);

            System.out.println("Enter Employee ID : ");
            ID = sc.nextInt();
            EmpID.addElement(ID);

            System.out.println("Enter Employee Gender : ");
            gender = in.readLine();
            EmpGender.addElement(gender);

            System.out.println("Enter Employee Job Title : ");
            jobTitle = in.readLine();
            EmpTitle.addElement(jobTitle);

            System.out.println("Enter Employee Organization : ");
            org = in.readLine();
            EmpOrg.addElement(org);

            System.out.println("Enter Employee Salary : ");
            salary = sc.nextInt();
            EmpSalary.addElement(salary);
        }

        newEmpAdd = n + newEmpAdd;
        newTotal = newTotal + 1;
    }


    static void delete(int n)
    {
        EmpName.removeElementAt(n);
        EmpID.removeElementAt(n);
        EmpGender.removeElementAt(n);
        EmpTitle.removeElementAt(n);
        EmpOrg.removeElementAt(n);
        EmpSalary.removeElementAt(n);
    }


    public static void main(String[] args)throws IOException
    {
        try
        {

            while(true)
            {
                System.out.println("\n\n\tHere are your options : ");
                System.out.println("1)Add employees.");
                System.out.println("2)Add more employees.");
                System.out.println("3)Delete employees.");
                System.out.println("4)Compare 2 employee (by salary).");
                System.out.println("5)Search an employees.");
                System.out.println("6)Sort (by names).");
                System.out.println("7)Display");
                System.out.println("8)Exit.");
                System.out.print("\t\tEnter your choice : ");
                choice = sc.nextInt();

                switch(choice)
                {
                    case 1 :
                    {
                        create();
                        break;
                    }
                    case 2 :
                    {
                        System.out.print("\nHow many more employees you wanna add : ");
                        j = sc.nextInt();
                        insert(j);
                        break;
                    }

                    case 3:
                    {
                        System.out.println("\n\tHere are your options : ");
                        System.out.println("1)Delete by Name.");
                        System.out.println("2)Delete by ID.");
                        System.out.print("\t\tEnter your choice : ");
                        choice1 = sc.nextInt();

                        switch(choice1)
                        {
                            case 1 :
                            {
                                System.out.println("\nEnter the Name of the employee you wanna delete : ");
                                delName = in.readLine();

                                int index = EmpName.indexOf(delName);

                                delete(index);
                                break;
                            }

                            case 2 :
                            {
                                System.out.println("\nEnter the ID of the employee you wanna delete : ");
                                delID = sc.nextInt();

                                int index = EmpID.indexOf(delID);

                                delete(index);
                                break;
                            }

                            default :
                                System.out.print("\nPlease enter a valid choice.");
                        }
                        break;
                    }

                    case 4 :
                    {
                        System.out.println("\nEnter the name of 1st employee : ");
                        compName1 = in.readLine();

                        System.out.println("\nEnter the name of 2nd employee : ");
                        compName2 = in.readLine();

                        int index1 = EmpName.indexOf(compName1);
                        int index2 = EmpName.indexOf(compName2);

                        System.out.print("\nTesting equality of salary of "+compName1+" and "+compName2+ " "+EmpSalary.elementAt(index1).equals(EmpSalary.elementAt(index2)));
                        break;
                    }

                    case 5 :
                    {
                        System.out.println("\n\tHere are your options : ");
                        System.out.println("1)Search by Name.");
                        System.out.println("2)Search by ID.");
                        System.out.print("\t\tEnter your choice : ");
                        choice1 = sc.nextInt();

                        switch(choice1)
                        {
                            case 1 :
                            {
                                System.out.println("\nEnter the Name of the employee you wanna search : ");
                                searchName = in.readLine();

                                int index = EmpName.indexOf(searchName);

                                System.out.print("\nFound "+searchName+" : "+(index != -1)+" at position : "+index);
                                break;
                            }

                            case 2 :
                            {
                                System.out.println("\nEnter the ID of the employee you wanna search : ");
                                searchID = sc.nextInt();

                                int index = EmpID.indexOf(searchID);

                                System.out.print("\nFound "+searchID+" : "+(index != -1)+" at position : "+index);
                                break;
                            }

                            default :
                                System.out.print("\nPlease enter a valid choice.");
                        }
                        break;
                    }

                    case 6 :
                    {
                        System.out.print("\nBefore sorting : "+EmpName);

                        Collections.sort(EmpName);

                        System.out.print("\nSorted Names : "+EmpName);
                        break;
                    }

                    case 7 :
                    {
                        display();
                        break;
                    }

                    case 8 :
                    {
                        System.out.print("\n\nThank You!!");
                        System.exit(0);
                    }

                    default :
                        System.out.print("\nPlease enter a valid choice!");
                }
            }
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}