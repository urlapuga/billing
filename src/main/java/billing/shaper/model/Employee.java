package billing.shaper.model;

import billing.shaper.enums.Position;

public class Employee {

    private int id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Company company;
    private Position position;
    private String login;
    private String password;

    public Employee(String name, String lastName, String phoneNumber, String email ,Company company, Position position, String login, String password) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.position = position;
        this.login = login;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", company=" + company +
                ", position=" + position +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
