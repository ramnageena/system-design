package design_pattern.singleton;

import java.util.Objects;

/**
 * Thread-safe implementation of the Singleton pattern using the double-checked locking idiom.
 * This implementation provides lazy initialization while minimizing the performance cost of synchronization.
 *
 * <p><b>Key Features:</b>
 * <ul>
 *   <li>Lazy initialization - instance is created only when first requested</li>
 *   <li>Thread-safe - ensures only one instance is created even in multi-threaded environments</li>
 *   <li>Efficient - synchronization is only used during the first creation of the instance</li>
 *   <li>Volatile keyword ensures proper visibility of the instance across threads in Java 5+</li>
 * </ul>
 *
 * <p><b>When to use:</b>
 * <ul>
 *   <li>When you need exactly one instance of a class</li>
 *   <li>When the instance creation is resource-intensive</li>
 *   <li>When you need thread safety with minimal performance overhead</li>
 * </ul>
 *
 * <p><b>Usage Example:</b>
 * <pre>
 * {@code
 * DoubleCheckedSingleton instance = DoubleCheckedSingleton.getInstance();
 * }
 * </pre>
 *
 * @see LazySingleton
 * @see ThreadSafeSingleton
 */
public class DoubleCheckedSingleton {

    /**
     * The single instance of the class, marked as volatile to ensure thread safety.
     * The volatile keyword ensures that multiple threads handle the instance variable correctly.
     */
    private static volatile DoubleCheckedSingleton instance;

    /**
     * Private constructor to prevent instantiation from other classes.
     * This ensures that the class cannot be instantiated using the 'new' keyword.
     */
    private DoubleCheckedSingleton() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Use getInstance() method to get the single instance of this class.");
        }
    }
    
    /**
     * Returns the single instance of this class, creating it if necessary.
     * This method uses double-checked locking to ensure thread safety while
     * minimizing the performance cost of synchronization.
     *
     * @return the single instance of DoubleCheckedSingleton
     */
    public static DoubleCheckedSingleton getInstance() {
        // First check (without synchronization) for better performance
        if (instance == null) {
            // Synchronize on the class object to ensure thread safety during instance creation
            synchronized (DoubleCheckedSingleton.class) {
                // Second check within synchronized block to handle race conditions
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

    // below part can be ignored
    /**
     * Prevents cloning of the singleton instance.
     *
     * @return never returns normally
     * @throws CloneNotSupportedException if cloning is attempted
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of singleton class is not supported");
    }



    public static void main(String[] args) {
        DoubleCheckedSingleton doubleCheckedSingleton= DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton doubleCheckedSingleton1= DoubleCheckedSingleton.getInstance();
        System.out.println("Double checked singleton : "+ doubleCheckedSingleton);
        System.out.println("Double checked singleton 1 : "+ doubleCheckedSingleton1);
    }
}
