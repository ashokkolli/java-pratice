package core.designpatterns;

public class SingletonLazyInitialization {

    private static SingletonLazyInitialization singletonLazyInitialization;

    private SingletonLazyInitialization() {
    }

    public SingletonLazyInitialization getSingletonLazyInitialization() {
        if (singletonLazyInitialization == null) {
            singletonLazyInitialization = new SingletonLazyInitialization();
        }
        return singletonLazyInitialization;
    }
}
