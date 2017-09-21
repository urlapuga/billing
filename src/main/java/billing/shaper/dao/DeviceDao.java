package billing.shaper.dao;
import billing.shaper.model.Device;
import java.util.List;

public interface DeviceDao {
    List<Device> getAll();
    boolean add(Device device);
    boolean edit(Device device);
    boolean remove(Device device);
}
