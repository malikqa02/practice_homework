package practice6.userMonitor;

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();
        userMonitor.addNewSession("123");
        userMonitor.addNewSession("111");
        userMonitor.addNewSession("333");
        userMonitor.addNewSession("222");
        userMonitor.addNewSession("123");
        userMonitor.addNewSession("123");
        userMonitor.addNewSession("123");
        userMonitor.printSessions();
    }
}
