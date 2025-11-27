package singletonPattern;

public class Singleton {

    private Singleton() {

    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void appLogger() {
        System.out.println("App Logger ::::::::::::::");
    }

}
