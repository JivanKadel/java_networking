import InternetAddress.PrintIPAddress;

public class Main {
    public static void main(String[] args) {
        PrintIPAddress p = new PrintIPAddress("www.oreilly.com");
        p.printHostIP();
        p.printHostName("23.54.246.174");
    }
}