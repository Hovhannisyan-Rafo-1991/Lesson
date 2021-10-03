package lesson1;

public class User {

    private String name = "Rafo";
    private String password = "Rafo";
    private int age = 35;
    String role = "MODERATOR";

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        if(age < 30) {
            return age;
        }else if(age >= 35) {
            return 100;
        } else {
            return -1;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }
}
