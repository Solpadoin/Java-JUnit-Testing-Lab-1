package package1.controller;

public class EasyMessage {
    public static void Output(String x) {
        if (x.length() > 1)
            System.out.println(x);
        else
            System.out.println("[WARNING] Message length is invalid!");
    }

    public static void ProjectNameOutput(String x) {
        System.out.println("[INFO] JUnit testing lab 1!");
    }
}
