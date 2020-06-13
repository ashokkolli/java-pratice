package JavaConcepts.Singleton;

public class SingletonClass {
    private static final SingletonClass singletonClass = new SingletonClass();

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private SingletonClass() {
    }


    /* Static instance method */
    public static SingletonClass getInstance() {
        return singletonClass;
    }

    /*
     * other methods protected by singleton-ness
     * */
    protected static void demoMethod() {
        System.out.println("demo method for singleton");
    }

}
