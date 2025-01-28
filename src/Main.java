public class Main {
    public static void main(String[] args) {
        Singleton mySingleton1 = Singleton.getInstance();
        Singleton mySingleton2 = Singleton.getInstance();
        mySingleton1.setCounter(2);
        System.out.println(mySingleton1.getCounter());
        System.out.println(mySingleton2.getCounter());
        mySingleton2.setCounter(7);
        System.out.println(mySingleton1.getCounter());
        System.out.println(mySingleton2.getCounter());

    }
}