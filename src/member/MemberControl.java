package member;
import javax.xml.transform.Result;

import member.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class MemberControl {

    private DBConnection dbConnection = null;

    public MemberControl() {
        dbConnection = new DBConnection();
    }
    
    public void setConnection(String dbName, String user, String passwd) {
        dbConnection.init(dbName, user, passwd);
    }


    // insert
    public boolean insert(Member mem) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        boolean flag = false;
        try {
            connection = dbConnection.getConn();
            String strQuery = "insert into member(member_ID,name,birth,point) values(?,?,?,?)";
            pstmt = connection.prepareStatement(strQuery);
           
            pstmt.setInt(1, mem.getMember_ID());
            pstmt.setString(2, mem.getName());
            pstmt.setDate(3, mem.getBirth());
            pstmt.setInt(4, mem.getPoint());
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

    public ArrayList<Member> getMembers() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Member> members = new ArrayList<>();

        try {
            conn = dbConnection.getConn();
            String strQuery = "select * from member";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(strQuery);

            while (rs.next()) {
            	Member mem = new Member();
            	mem.setMember_ID(rs.getInt("member_ID"));
            	mem.setName(rs.getString("name"));
            	mem.setBirth(rs.getDate("birth"));
            	mem.setPoint(rs.getInt("point"));
            	members.add(mem);
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), null, rs, stmt);
        }
        return members;
    }
    public Member getMember(int member_ID) {
        Connection conn = null;
        PreparedStatement pstmt = null ;
        ResultSet rs = null;
        Member mem = null;

        try {
            conn = dbConnection.getConn();
            String strQuery = "select * from member where member_ID=?";
            pstmt = conn.prepareStatement(strQuery);
            pstmt.setInt(1, member_ID);
            rs = pstmt.executeQuery();

            if (rs.next()) {
            	mem = new Member();
            	mem.setMember_ID(rs.getInt("member_ID"));
            	mem.setName(rs.getString("name"));
            	mem.setBirth(rs.getDate("birth"));
            	mem.setPoint(rs.getInt("point"));
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), pstmt, rs, null);
        }
        return mem;
    }

    public boolean update(Member mem) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean flag = false;
        try {
            conn = dbConnection.getConn();
            String strQuery = "update member set name=?,birth=?,point=? where member_ID=? ";

            pstmt = conn.prepareStatement(strQuery);
            pstmt.setString(1, mem.getName());
            pstmt.setDate(2, mem.getBirth());
            pstmt.setInt(3, mem.getPoint());
            pstmt.setInt(4, mem.getMember_ID());
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

    public boolean delete(int member_ID) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean result = false;
        try {
            conn = dbConnection.getConn();
            String query = "delete from member where member_ID = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, member_ID);
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
