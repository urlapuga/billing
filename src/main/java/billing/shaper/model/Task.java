package billing.shaper.model;

import billing.shaper.enums.TaskStatus;

import java.time.LocalDateTime;

public class Task {
    private String text;
    private Employee employee;
    private LocalDateTime dateAdded;
    private LocalDateTime dateDone;
    private Employee employeeTaskTo;
    private TaskStatus status;

    public Task(String text) {
        this.text = text;
        this.employee = null;
        this.dateAdded = LocalDateTime.now();
        this.status = TaskStatus.NEW;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        if(employee==null)this.status = TaskStatus.NEW;
        else this.status = TaskStatus.INPROGRESS;
        this.employee = employee;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public LocalDateTime getDateDone() {
        return dateDone;
    }

    public void setDateDone(LocalDateTime dateDone) {
        this.dateDone = dateDone;
    }

    public Employee getEmployeeTaskTo() {
        return employeeTaskTo;
    }

    public void setEmployeeTaskTo(Employee employeeTaskTo) {
        this.employeeTaskTo = employeeTaskTo;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "text='" + text + '\'' +
                ", employee=" + employee +
                ", dateAdded=" + dateAdded +
                ", dateDone=" + dateDone +
                ", employeeTaskTo=" + employeeTaskTo +
                ", status=" + status +
                '}';
    }


}
