package model;

/**
 *
 * @author Munezero
 */
public class Staff {
    private int id;
    private String fullNames;
    private String email;
    private String password;
    private int role;

    public Staff() {
    }

    public Staff(int id, String fullNames, String email, String password, int role) {
        this.id = id;
        this.fullNames = fullNames;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
 }
