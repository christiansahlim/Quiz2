/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Chris
 */
public class User {
    private int id ;
    private String name;
    private String email;
    private String password;
    private int IdCategory;


    public User(int id, String name, String email, String password, int IdCategory) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.IdCategory = IdCategory;
    }

    public User() {
        
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdCategory() {
        return this.IdCategory;
    }

    public void setIdCategory(int IdCategory) {
        this.IdCategory = IdCategory;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", IdCategory='" + getIdCategory() + "'" +
            "}";
    }

}
