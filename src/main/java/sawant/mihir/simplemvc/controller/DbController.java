package sawant.mihir.simplemvc.controller;

import sawant.mihir.simplemvc.model.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbController {

    private Connection connection;

    private static final String USER_NAME = "root";
    private static final String PASSWORD = "toor";

    public DbController(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", USER_NAME, PASSWORD);
       }catch (Exception e){
           System.out.println("Db connection failed: "+e.getMessage());
       }
    }

    public int addProduct(Product product){
       try{
           PreparedStatement insert = connection.prepareStatement("INSERT INTO product(name, qty, price, type) VALUES(?, ?, ?, ?)");
           insert.setString(1, product.getName());
           insert.setFloat(2, product.getQty());
           insert.setDouble(3, product.getCost());
            insert.setString(4, product.getType());
           return insert.executeUpdate();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       return -1;
    }
}
