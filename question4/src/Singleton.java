public class Singleton {

    // static variable to hold the single instance
    private static Singleton singleInstance;

    // private constructor so it can't be instantiated from outside
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // public static method to get the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // get Singleton instances
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        // Check if both references point to the same object
        System.out.println(s1 == s2);  // Output: true
    }
}
