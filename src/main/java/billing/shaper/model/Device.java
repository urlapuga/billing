package billing.shaper.model;

import billing.shaper.enums.DeviceModel;
import billing.shaper.enums.DeviceType;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Device {
    private int id;
    private String name;
    private DeviceType type;
    private DeviceModel model;
    private InetAddress ipAddress;
    private String login;
    private String password;

    public Device(int id, String name,DeviceType type, DeviceModel model, String ipAddress, String login, String password) throws UnknownHostException {
        this.name = name;
        this.id = id;
        this.type = type;
        this.model = model;
        this.ipAddress  = InetAddress.getByName(ipAddress);
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public DeviceModel getModel() {
        return model;
    }

    public void setModel(DeviceModel model) {
        this.model = model;
    }

    public InetAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(InetAddress ipAddress) {
        this.ipAddress = ipAddress;
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
        return "Device{" +
                "id=" + id +
                ", type=" + type +
                ", model=" + model +
                ", ipAddress=" + ipAddress +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
