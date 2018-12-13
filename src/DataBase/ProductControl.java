package DataBase;
import javax.xml.transform.Result;

import DataBase.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class ProductControl {

    private DBConnection dbConnection = null;

    public ProductControl() {
        dbConnection = new DBConnection();
    }
    
    public void setConnection(String dbName, String user, String passwd) {
        dbConnection.init(dbName, user, passwd);
    }


    // insert
    public boolean insert(Product product) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        boolean flag = false;
        try {
            connection = dbConnection.getConn();
            String strQuery2 = "insert into product_category(Category_ID,name) values(?,?)";
            pstmt2 = connection.prepareStatement(strQuery2);
            pstmt2.setInt(1, product.getCategory_ID());
            pstmt2.setString(2, product.getName());
            int count2 = pstmt.executeUpdate();
            
            String strQuery = "insert into product(Product_ID,Category_ID,name,price,count) values(?,?,?,?,?)";
            pstmt = connection.prepareStatement(strQuery);
            pstmt.setInt(1, product.getProduct_ID());
            pstmt.setInt(2, product.getCategory_ID());
            pstmt.setString(3, product.getName());
            pstmt.setInt(4, product.getPrice());
            pstmt.setInt(5, product.getCount());
            int count = pstmt.executeUpdate();

            if (count == 1 && count2 == 1) {
                flag = true;
            }

        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), pstmt, null, null);
        }
        return flag;
    }

    public ArrayList<Product> getProducts() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Product> products = new ArrayList<>();

        try {
            conn = dbConnection.getConn();
            String strQuery = "select * from product";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(strQuery);

            while (rs.next()) {
            	Product product = new Product();
            	product.setProduct_ID(rs.getInt("Product_ID"));
            	product.setCategory_ID(rs.getInt("Category_ID"));
            	product.setName(rs.getString("name"));
            	product.setPrice(rs.getInt("price"));
            	product.setCount(rs.getInt("count"));
            	products.add(product);
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), null, rs, stmt);
        }
        return products;
    }
    public Product getProduct(int product_ID,int catagory_ID) {
        Connection conn = null;
        PreparedStatement pstmt = null ;
        ResultSet rs = null;
        Product product = null;

        try {
            conn = dbConnection.getConn();
            String strQuery = "select * from product where id=?,?";
            pstmt = conn.prepareStatement(strQuery);
            pstmt.setInt(1,product_ID);
            pstmt.setInt(2,catagory_ID);
            rs = pstmt.executeQuery();

            if (rs.next()) {
            	product = new Product();
            	product.setProduct_ID(rs.getInt("Product_ID"));
            	product.setCategory_ID(rs.getInt("Category_ID"));
            	product.setName(rs.getString("name"));
            	product.setPrice(rs.getInt("price"));
            	product.setCount(rs.getInt("count"));
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
            DBConnection.release(dbConnection.getConn(), pstmt, rs, null);
        }
        return product;
    }

    public boolean update(Product product) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean flag = false;
        try {
            conn = dbConnection.getConn();
            String strQuery = "update product set Product_ID=?,Category_ID=?,name=?,price=?,count=? where id=? ";

            pstmt = conn.prepareStatement(strQuery);
            pstmt.setInt(1, product.getProduct_ID());
            pstmt.setInt(2, product.getCategory_ID());
            pstmt.setString(3, product.getName());
            pstmt.setInt(4, product.getPrice());
            pstmt.setInt(5, product.getCount());
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

    public boolean delete(int product_ID,int catagory_ID) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean result = false;
        try {
            conn = dbConnection.getConn();
            String query = "delete from product where id = ?,?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, product_ID);
            pstmt.setInt(2, catagory_ID);
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
