package InternetAddress;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintIPAddress {
    private String hostname;

    public PrintIPAddress() {

    }

    public PrintIPAddress(String hostname) {
        this.hostname = hostname;
    }

    public void printHostIP() {
        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println(address);
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printHostName(String ip) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName(ip);
            System.out.println(address.getHostName());
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }
}
