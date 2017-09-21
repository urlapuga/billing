package billing.shaper.Service;

import billing.shaper.model.Device;
import billing.shaper.model.Subscriber;

import java.util.Map;

public interface DeviceService {
    boolean shape(Device device , String macAdress);
    boolean setIp(Device device , String ip);
    boolean configure(Device device , Map<String,String> config);
    boolean reboot(Device device);
    String getInfo(Device device);
}
