package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        System.out.println(single.getDescription());
    }
}
