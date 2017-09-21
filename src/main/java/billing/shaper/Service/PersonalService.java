package billing.shaper.Service;

import billing.shaper.model.Company;
import billing.shaper.model.Employee;

import java.util.List;

public interface PersonalService {
    List<Employee> getAll();
    List<Employee> getAllActive();
    List<Employee> getAllFired();
    List<Employee> getAllWithOpenTasks();
    List<Employee> getByCompany(Company company);
    List<Employee> getAvailableTo(Employee employee);

}
