package design_pattern.singleton;

import java.util.Objects;

/**
 * Thread-safe implementation of the Singleton pattern using synchronized method.
 * This ensures that only one instance of the class is created even in a multithreaded environment.
 * <br>
 * Note: While this implementation is thread-safe, the use of 'synchronized' on the entire method
 * can lead to performance overhead since only the first call actually needs synchronization.
 * <br>
 * For better performance, consider using Double-Checked Locking or other thread-safe patterns.
 *  @see design_pattern.singleton.DoubleCheckedSingleton
 */

public class ThreadSafeSingleton {

    // private static instance of the class
    private static ThreadSafeSingleton instance;

    // private constructor for prevents instantiation from other classes
    private ThreadSafeSingleton(){
    }

    public  static synchronized ThreadSafeSingleton getInstance(){
        if (Objects.isNull(instance)){
            instance=new ThreadSafeSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton1=ThreadSafeSingleton.getInstance();
        System.out.println("Thread Safe Singleton : "+ threadSafeSingleton);
        System.out.println("Thread Safe Singleton 1 : "+ threadSafeSingleton1);
    }
}
