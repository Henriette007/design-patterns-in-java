public class Singleton {
    private int counter;
    private static Singleton singletonInstance = null;

    private Singleton(){
        System.out.println("I am a new Singleton.");
        this.counter =0;
    }

    public static Singleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
