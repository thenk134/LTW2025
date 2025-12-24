package model;

public class User {
    private int id;
    private String username;
    private String password;
    private int role; // 1: Admin, 0: User

    public User() {}

    public User(int id, String username, String password, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Các hàm Getter/Setter (Bắt buộc)
    public int getRole() { return role; }
    public void setRole(int role) { this.role = role; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    // ... getter setter cho id
}