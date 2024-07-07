/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author kudol
 */
public class User {
    private int UserId;
    private String UserName;
    private String Passwword;
    private String Name;
    private String Img;
    private String Email;
    private String Phone;
    private int RoleId;

    public User() {
    }

    public User(int UserId, String UserName, String Passwword, String Name, String Img, String Email, String Phone, int RoleId) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.Passwword = Passwword;
        this.Name = Name;
        this.Img = Img;
        this.Email = Email;
        this.Phone = Phone;
        this.RoleId = RoleId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPasswword() {
        return Passwword;
    }

    public void setPasswword(String Passwword) {
        this.Passwword = Passwword;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }
    
}
