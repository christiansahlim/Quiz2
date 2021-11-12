/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.User;

/**
 *
 * @author Chris
 */
public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    //INSERT
    public static boolean RegisterUser(User user) {
        conn.connect();
        String query = "INSERT INTO user VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());
            stmt.setInt(5, user.getIdCategory());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // SELECT WHERE
    public static User getUser(String email, String password) {
        conn.connect();
        String query = "SELECT * FROM User WHERE email='" + email + "' AND password='" + password +"'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            User user = new User();

            while (result.next()) {
                user.setId(result.getInt("id"));
                user.setName(result.getString("name"));
                user.setEmail(result.getString("email"));
                user.setPassword(result.getString("Password"));
                user.setIdCategory(result.getInt("idCategory"));
            }
            return user;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
