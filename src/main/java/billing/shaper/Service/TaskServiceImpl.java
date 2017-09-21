package billing.shaper.Service;

import billing.shaper.dao.CrudDao;
import billing.shaper.dao.TaskCrud;
import billing.shaper.enums.TaskStatus;
import billing.shaper.model.Company;
import billing.shaper.model.Employee;
import billing.shaper.model.Task;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TaskServiceImpl implements TaskService {

    CrudDao<Task> dao = new TaskCrud();

    @Override
    public boolean add(Task task) {
        return dao.create(task);
    }

    @Override
    public List<Task> getAll() {
        return dao.getAll();
    }

    @Override
    public List<Task> getNew() {
        return dao.getAll().stream().filter(t->t.getStatus()== TaskStatus.NEW).collect(Collectors.toList());
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
}
