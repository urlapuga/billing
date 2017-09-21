package billing.shaper.dao;

import billing.shaper.enums.Position;
import billing.shaper.model.Company;
import billing.shaper.model.Employee;
import billing.shaper.model.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//TODO:write logic , add SQL
public class TaskCrud implements CrudDao<Task>, TaskDao {
    private List<Task> tasks = new ArrayList<>();

    public TaskCrud() {
        Company company = new Company("company");
        Employee emp = new Employee("Андрей", "Пономаренко", "063033333333", "email@e.com", company, Position.DIRECTOR, "login", "pass");
        Employee emp2 = new Employee("Кирил", "Малиев", "0630222222", "email2@e.com", company, Position.DIRECTOR, "login2", "pass2");

        Task task = new Task("Тестовое задание 1");
        task.setEmployee(emp);
        tasks.add(task);
        task = new Task("Тестовое задание 2");
        tasks.add(task);
    }

    @Override
    public boolean create(Task t) {
        return tasks.add(t);
    }


    @Override
    public List getAll() {
        return tasks;
    }

    @Override
    public List<Task> getNew() {
        return null;
    }

    @Override
    public List<Task> getByAll() {
        return null;
    }

    @Override
    public List<Task> getByCreator(Employee employee) {
        return null;
    }

    @Override
    public List<Task> getByAdmin(Employee employee) {
        return null;
    }

    @Override
    public List<Task> getByDate(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public List<Task> byCompany(Company company) {
        return null;
    }

    @Override
    public boolean makeDone(Task task) {
        return false;
    }

    @Override
    public boolean setAdmin(Task task, Employee employee) {
        return false;
    }


    @Override
    public Task read(int id) {
        return tasks.get(id);
    }

    @Override
    public Task update(int id, Task t) {
        return tasks.set(id, t);
    }

    @Override
    public boolean delete(Task t) {
        return tasks.remove(t);
    }
}
