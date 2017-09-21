package billing.shaper.pinger;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {

        System.out.println(Pinger.ping("172.217.20.174"));
    }
}
