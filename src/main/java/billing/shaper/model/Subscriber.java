package billing.shaper.model;

import billing.shaper.enums.IpaddressType;
import billing.shaper.enums.ShapeClass;
import billing.shaper.enums.SubscriberStatus;

import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Subscriber {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    private Device device;
    private int port;
    private InetAddress ipAddress;
    private IpaddressType ipaddressType;
    private String macAdress;

    private Date dateRegistered;
    private Date datePayedTo;

    private SubscriberStatus subscriberStatus;
    private ShapeClass shapeClass;

    private Date getDate(String stringDate) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormatter.parse(stringDate);
    }


    public Subscriber(int id, String name, String email, String phoneNumber, Device device, int port, InetAddress ipAddress,
                      IpaddressType ipaddressType, String macAdress, String dateRegistered, String datePayedTo, SubscriberStatus subscriberStatus, ShapeClass shapeClass) throws ParseException {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.device = device;
        this.port = port;
        this.ipAddress = ipAddress;
        this.ipaddressType = ipaddressType;
        this.macAdress = macAdress;
        this.dateRegistered = getDate(dateRegistered);
        this.datePayedTo = getDate(datePayedTo);
        this.subscriberStatus = subscriberStatus;
        this.shapeClass = shapeClass;
    }


}
