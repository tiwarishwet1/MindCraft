package question24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    String url = "jdbc:mysql://localhost:3306/Students";
    String username = "root";
    String password = "root";

    Connection getConnection() throws Exception {

        return DriverManager.getConnection(url, username, password);
    }

    void insert(Student s) throws Exception {

        Connection con = getConnection();

        String sql = "insert into student values (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, s.getRollno());
        ps.setString(2, s.getName());
        ps.setDouble(3, s.getPercentage());

        ps.executeUpdate();

        System.out.println("Record inserted");

        con.close();
    }

    void update(Student s) throws Exception {

        Connection con = getConnection();

        String sql = "update student set name = ?, percentage = ? where rollno = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, s.getName());
        ps.setDouble(2, s.getPercentage());
        ps.setInt(3, s.getRollno());

        ps.executeUpdate();

        System.out.println("Record updated");

        con.close();
    }

    void delete(int rollno) throws Exception {

        Connection con = getConnection();

        String sql = "delete from student where rollno = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, rollno);

        ps.executeUpdate();

        System.out.println("Record deleted");

        con.close();
    }

    void display(int rollno) throws Exception {

        Connection con = getConnection();

        String sql = "select * from student where rollno = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, rollno);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println("Roll No: " + rs.getInt("rollno"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Percentage: " + rs.getDouble("percentage"));

        } else {

            System.out.println("Record not found");
        }

        con.close();
    }

    void displayAll() throws Exception {

        Connection con = getConnection();

        String sql = "select * from student";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println("Roll No: " + rs.getInt("rollno"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Percentage: " + rs.getDouble("percentage"));
            System.out.println();
        }

        con.close();
    }
}