package billing.shaper.dao;

import billing.shaper.model.Device;

import java.util.ArrayList;
import java.util.List;

public class DeviceDaoImpl implements DeviceDao {

    private List<Device> devices = new ArrayList<Device>();

    public List<Device> getAll() {
        return devices;
    }

    public boolean add(Device device) {
        return devices.add(device);
    }

    public boolean edit(Device device) {
        return devices.add(device);
    }

    public boolean remove(Device device) {
        return devices.remove(device);
    }
}
