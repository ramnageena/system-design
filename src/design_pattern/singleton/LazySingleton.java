package design_pattern.singleton;

/**
 * LazySingleton demonstrates the "lazy initialization" singleton pattern.
 *
 * <p>Intent:
 * Ensure a class has only one instance and provide a global point of access to it.
 * In the lazy initialization variant, the single instance is created when it is first
 * requested (rather than at class load time).</p>
 *
 * <p>When to use:
 * - When a single shared instance is required across the application.
 * - When creating the instance is expensive, and you want to defer its creation
 * until it is actually necessary.</p>
 *
 *
 * <p>Simple usage example:</p>
 * <pre>
 * {@code
 * LazySingleton lazySingleton = LazySingleton.getInstance();
 * }</pre>
 * @see design_pattern.singleton.ThreadSafeSingleton
 * @see design_pattern.singleton.DoubleCheckedSingleton
 */
public class LazySingleton {
    // The single instance of the class; created lazily on first access.
    private static LazySingleton instance;

    // Private constructor prevents instantiation from other classes.
    private LazySingleton() {
        // initialization logic here (if any)
    }

    public static LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("Singleton " + lazySingleton);
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println("Singleton 1" + lazySingleton1);
    }

}
