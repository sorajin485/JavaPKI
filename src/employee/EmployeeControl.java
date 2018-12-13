package employee;
import javax.xml.transform.Result;

import employee.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeControl {

    private DBConnection dbConnection = null;

    public EmployeeControl() {
        dbConnection = new DBConnection();
    }
    
    public void setConnection(String dbName, String user, String passwd) {
        dbConnection.init(dbName, user, passwd);
    }


    // insert
    public boolean insert(Employee employee) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        boolean flag = false;
        try {
            connection = dbConnection.getConn();
            String strQuery = "insert into employee(id,name,phoneNum,entry) values(?,?,?,?)";
            pstmt = connection.prepareStatement(strQuery);
           
            pstmt.setInt(1, employee.getID());
            pstmt.setString(2, employee.getName());
            pstmt.setString(3, employee.getPhoneNum());
            pstmt.setDate(4, employee.getEntry());
            int count = pstmt.executeUpdate();

            if (count == 1) {
                flag = true;
            }

        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), pstmt, null, null);
        }
        return flag;
    }

    public ArrayList<Employee> getMembers() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            conn = dbConnection.getConn();
            String strQuery = "select * from employee";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(strQuery);

            while (rs.next()) {
            	Employee employee = new Employee();
            	employee.setID(rs.getInt("id"));
            	employee.setName(rs.getString("name"));
            	employee.setPhoneNum(rs.getString("phoneNum"));
            	employee.setEntry(rs.getDate("entry"));
            	employees.add(employee);
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), null, rs, stmt);
        }
        return employees;
    }
    public Employee getMember(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null ;
        ResultSet rs = null;
        Employee employee = null;

        try {
            conn = dbConnection.getConn();
            String strQuery = "select * from employee where id=?";
            pstmt = conn.prepareStatement(strQuery);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
            	employee = new Employee();
            	employee.setID(rs.getInt("member_ID"));
            	employee.setName(rs.getString("name"));
            	employee.setPhoneNum(rs.getString("phoneNum"));
            	employee.setEntry(rs.getDate("entry"));
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), pstmt, rs, null);
        }
        return employee;
    }

    public boolean update(Employee employee) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean flag = false;
        try {
            conn = dbConnection.getConn();
            String strQuery = "update employee set name=?,phoneNum=?,entry=? where id=? ";

            pstmt = conn.prepareStatement(strQuery);
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getPhoneNum());
            pstmt.setDate(3, employee.getEntry());
            pstmt.setInt(4, employee.getID());
            int count = pstmt.executeUpdate();

            if (count == 1) {
                flag = true;
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), pstmt, null, null);
        }
        return flag;
    }

    public boolean delete(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean result = false;
        try {
            conn = dbConnection.getConn();
            String query = "delete from employee where id = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            int count = pstmt.executeUpdate();
            if (count == 1) result = true;
        } catch (Exception e) {
            System.out.println("Exception :" + e);
        } finally {
            DBConnection.release(dbConnection.getConn(), pstmt, null, null);
        }
        return result;
    }
}
