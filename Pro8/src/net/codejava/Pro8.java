package net.codejava;

import java.sql.*;
import java.util.*;

public class Pro8
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Createme159!#";
		String name, department, job;

		long id;

		float salary;

		int choice, choice1;

		Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resultSet;

		try
		{
			Connection connection = DriverManager.getConnection(url, username, password);

			System.out.print("Connected");

			while(true)
			{
				System.out.print("\n\t\tMain Menu"+
						"\n1. View Records."+
						"\n2. Insert Records."+
						"\n3. Modify Records"+
						"\n4. Search Records."+
						"\n5. Delete Records."+
						"\n6. Exit");
				System.out.print("\n\tEnter your choice : ");
				choice = scanner.nextInt();

				switch(choice)
				{
					case 1:
					{
						statement = connection.createStatement();
						resultSet = statement.executeQuery("SELECT * FROM emp");

						while(resultSet.next())
						{
							id = resultSet.getInt("empid");
							name = resultSet.getString("emp_name");
							department = resultSet.getString("department");
							job = resultSet.getString("job");
							salary = resultSet.getFloat("salary");

							System.out.print("\nEmp : ");
							System.out.print("\n\t\tEmployee ID : "+id);
							System.out.print("\n\t\tName : "+name);
							System.out.print("\n\t\tDepartment : "+department);
							System.out.print("\n\t\tJob : "+job);
							System.out.print("\n\t\tSalary : "+salary);
						}
						System.out.print("\n\n");

						break;
					}

					case 2:
					{
						System.out.print("\nEnter Employee ID : ");
						id = scanner.nextLong();

						System.out.print("Enter Employee Name : ");
						name = scanner.next();

						System.out.print("Enter Employee Department : ");
						department = scanner.next();

						System.out.print("Enter Employee Job : ");
						job = scanner.next();

						System.out.print("Enter Employee Salary : ");
						salary = scanner.nextFloat();

						preparedStatement = connection.prepareStatement("INSERT INTO emp (empid, emp_name, department, job, salary) VALUES (?, ?, ?, ?, ?)");

						preparedStatement.setLong(1, id);
						preparedStatement.setString(2, name);
						preparedStatement.setString(3, department);
						preparedStatement.setString(4, job);
						preparedStatement.setFloat(5, salary);

						preparedStatement.executeUpdate();
						preparedStatement.close();

						break;
					}

					case 3:
					{
						System.out.print("\n\n\t\tYour choices : "+
								"\n\t1. Employee ID."+
								"\n\t2. Employee Name."+
								"\n\t3. Employee Department."+
								"\n\t4. Employee Job."+
								"\n\t5. Employee Salary.");
						System.out.print("\n\tEnter your choice : ");
						choice1 = scanner.nextInt();

						switch(choice1)
						{
							case 1 :
							{
								System.out.print("\nEnter the Employee ID whose data you wanna modify : ");
								id = scanner.nextLong();

								System.out.print("Enter Employee ID : ");
								long new_id = scanner.nextLong();

								preparedStatement = connection.prepareStatement("UPDATE emp SET empid=? WHERE empid=?");

								preparedStatement.setLong(1, new_id);
								preparedStatement.setLong(2, id);

								preparedStatement.executeUpdate();
								preparedStatement.close();
								break;
							}

							case 2 :
							{
								System.out.print("\nEnter the Employee ID whose data you wanna modify : ");
								id = scanner.nextLong();

								System.out.print("Enter New Employee Name : ");
								name = scanner.next();

								preparedStatement = connection.prepareStatement("UPDATE emp SET emp_name=? WHERE empid=?");

								preparedStatement.setString(1, name);
								preparedStatement.setLong(2, id);

								preparedStatement.executeUpdate();  
								preparedStatement.close();
								break;
							}

							case 3 :
							{
								System.out.print("\nEnter the Employee ID whose data you wanna modify : ");
								id = scanner.nextLong();

								System.out.print("Enter New Employee Department : ");
								department = scanner.next();

								preparedStatement = connection.prepareStatement("UPDATE emp SET department=? WHERE empid=?");

								preparedStatement.setString(1, department);
								preparedStatement.setLong(2, id);

								preparedStatement.executeUpdate();
								preparedStatement.close();
								break;
							}

							case 4 :
							{
								System.out.print("\nEnter the Employee ID whose data you wanna modify : ");
								id = scanner.nextLong();

								System.out.print("Enter New Employee Job : ");
								job = scanner.next();

								preparedStatement = connection.prepareStatement("UPDATE emp SET job=? WHERE empid=?");

								preparedStatement.setString(1, job);
								preparedStatement.setLong(2, id);

								preparedStatement.executeUpdate();
								preparedStatement.close();
								break;
							}

							case 5 :
							{
								System.out.print("\nEnter the Employee ID whose data you wanna modify : ");
								id = scanner.nextLong();

								System.out.print("Enter New Employee Salary : ");
								salary = scanner.nextFloat();

								preparedStatement = connection.prepareStatement("UPDATE emp SET salary=? WHERE empid=?");

								preparedStatement.setFloat(1, salary);
								preparedStatement.setLong(2, id);

								preparedStatement.executeUpdate();
								preparedStatement.close();
								break;
							}
						}

						break;
					}

					case 4 :
					{
						System.out.print("\nEnter the name you wanna search for : ");
						name = scanner.next();

						statement = connection.createStatement();
						resultSet = statement.executeQuery("SELECT * FROM emp WHERE emp_name=" + name);

						while(resultSet.next())
						{
							System.out.print("ID : "+resultSet.getLong("empid")+
									"\nName : "+resultSet.getString("emp_name")+
									"\nDepartment : "+resultSet.getString("department")+
									"\nJob : "+resultSet.getString("job")+
									"\nSalary : "+resultSet.getFloat("salary"));
						}
						break;
					}

					case 5 :
					{
						System.out.print("\nEnter the Employee ID you wanna delete : ");
						id = scanner.nextLong();

						preparedStatement = connection.prepareStatement("DELETE FROM emp WHERE empid=?");

						preparedStatement.setLong(1, id);

						preparedStatement.executeUpdate();
						preparedStatement.close();

						break;
					}

					case 6:
						System.out.print("\n\nThank you!!");
						System.exit(0);

					default:
						System.out.print("\n\nWrong choice entered!\n");
				}
			}
		}

		catch(Exception e)
		{
			System.out.print("Opps, Sorry!\n");
			System.out.print(e.getMessage());
			System.out.print("\nGoing back to main menu.....\n\n\n");
			main(null);
		}
		
		scanner.close();
	}
}