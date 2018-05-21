package com.jackrutorial.model;
 
import javax.validation.constraints.Size;
 
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
 
/**
 *
 * @author www.codejava.net
 *
 */
public class User {
    @NotEmpty
    @Email
    private String email;
     
    @NotEmpty
    @Size
    private String password;
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}