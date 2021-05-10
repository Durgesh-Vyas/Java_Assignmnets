package net.codejava;

import java.sql.*;
import java.util.Scanner;

public class pro1 {

    public static void main(String[] args) {

        try {

            Statement st;
            PreparedStatement pst;
            ResultSet rs;
            @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
            int ch;
            int conti=0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbStud", "root", "Createme159!#");
            System.out.println("Successful!");


            if (con != null) {

                do {
                    System.out.println("1. View Records");
                    System.out.println("2. Insert Records");
                    System.out.println("3. Modify Records");
                    System.out.println("4. Search Records");
                    System.out.println("5. Delete Records");
                    System.out.println("6. Exit");

                    System.out.println("Enter your choice?");
                    ch = in.nextInt();

                    int id, age;
                    String name;
                    switch (ch) {
                        case 1:
                            st = con.createStatement();
                            rs = st.executeQuery("select * from records");

                            while (rs.next()) {
                                System.out.println(rs.getInt("Id") + "\t" + rs.getString("Name") + "\t" + rs.getInt("Age"));
                            }
                            st.close();
                            break;
                        case 2:
                            System.out.println("Please enter Id:");
                            id = in.nextInt();

                            System.out.println("Please enter Name:");
                            name = in.next();

                            System.out.println("Please enter Age:");
                            age = in.nextInt();

                            pst = con.prepareStatement("insert into records(Id,Name,Age) values(?,?,?)");
                            pst.setInt(1, id);
                            pst.setString(2, name);
                            pst.setInt(3, age);
                            pst.executeUpdate();
                            pst.close();
                            break;
                        case 3:
                            System.out.println("Please enter Id:");
                            id = in.nextInt();

                            System.out.println("Please enter Age that you wants to change:");
                            age = in.nextInt();

                            pst = con.prepareStatement("update records set Age=? where Id=?");
                            pst.setInt(1, age);
                            pst.setInt(2, id);
                            pst.executeUpdate();
                            pst.close();
                            break;
                        case 4:
                            System.out.println("Please enter Id to Search:");
                            id = in.nextInt();

                            st = con.createStatement();
                            rs = st.executeQuery("select * from records where Id=" + id);
                            while (rs.next()) {
                                System.out.println(rs.getInt("Id") + "\t" + rs.getString("Name") + "\t" + rs.getInt("Age"));
                            }
                            st.close();
                            break;
                        case 5:
                            System.out.println("Please enter Id to Delete:");
                            id = in.nextInt();
                            pst = con.prepareStatement("delete from records where Id=?");
                            pst.setInt(1, id);
                            pst.executeUpdate();
                            pst.close();
                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid Choice Entered!");

                    }

                    System.out.println("Do you wants to continue?");
                    conti = in.nextInt();
                }
                while (conti==1);
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

