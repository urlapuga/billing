package billing.shaper.Service;

import billing.shaper.model.Company;
import billing.shaper.model.Employee;
import billing.shaper.model.Task;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskService {

    List<Task> getAll();
    List<Task> getNew();
    List<Task> getByAll();
    List<Task> getByCreator(Employee employee);
    List<Task> getByAdmin(Employee employee);
    List<Task> getByDate(LocalDateTime localDateTime);
    List<Task> byCompany(Company company);

    boolean add(Task task);
    boolean makeDone(Task task);
    boolean setAdmin(Task task , Employee employee);
}
