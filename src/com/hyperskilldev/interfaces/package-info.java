package com.hyperskilldev.interfaces;
/**
 *  Theory: Interface
 * 50 minutes
 * 0 / 5 problems solved
 * Declaring interfaces
 *
 * An interface is a special kind of a class that is even more abstract than an abstract class. Often (but not always) it contains only abstract methods that you can implement in the subclasses.
 *
 * Like the abstract class, an interface can't be instantiated. To declare an interface you should write the keyword interface instead of class before the name of the interface:
 *
 * public interface Interface { }
 *
 * An interface can contain:
 *
 *     public constants;
 *     abstract methods without an implementation (the keyword abstract is not required here);
 *     default methods with implementation since Java 8 (the keyword default is required);
 *     static methods with implementation (the keyword static is required).
 *
 * If the modifiers are not specified once the method is declared, its parameters will be public abstract by default.
 *
 * An interface can't contain fields (only constants), constructors and non-public abstract methods. Since Java 9 private default methods are allowed as well.
 *
 * Let's declare an interface containing all possible members:
 *
 * interface Interface {
 *
 *     int INT_CONSTANT = 0; // it's a constant, the same as public static final INT_FIELD = 0
 *
 *     void instanceMethod1();
 *
 *     void instanceMethod2();
 *
 *     static void staticMethod() {
 *         System.out.println("Interface: static method");
 *     }
 *
 *     default void defaultMethod() {
 *         System.out.println("Interface: default method. It can be overridden");
 *     }
 * }
 *
 * Static and default methods should have an implementation in the interface!
 *
 * Let's take a closer look at this interface. The variable INT_CONSTANT is not a field here, it's a static final constant. Two methods instanceMethod1() and instanceMethod2() are abstract methods. The staticMethod() is just a regular static method. The default method defaultMethod() has an implementation but it can be overridden in subclasses.
 * Marker interfaces
 *
 * In some situations, an interface can have no members at all. Such interfaces are called marker or tagged interfaces. For example, a well-known interface Serializable is a marker interface:
 *
 * public interface Serializable{
 * }
 *
 * Other examples of marker interfaces are Cloneable, Remote, etc. They are used to provide essential information to the JVM.
 * Implementing interfaces
 *
 * A class (even an abstract one) can inherit an interface using the keyword implements. If a class is not abstract we should provide implementations for all abstract methods of the interface.
 *
 * Let's implement the interface we've considered earlier:
 *
 * class Class implements Interface {
 *
 *     @Override
 *     public void instanceMethod1() {
 *         System.out.println("Class: instance method1");
 *     }
 *
 *     @Override
 *     public void instanceMethod2() {
 *         System.out.println("Class: instance method2");
 *     }
 * }
 *
 * Now we can create an instance of the class and call its methods:
 *
 * Interface instance = new Class();
 *
 * instance.instanceMethod1(); // it prints "Class: instance method1"
 * instance.instanceMethod2(); // it prints "Class: instance method2"
 * instance.defaultMethod();   // it prints "Interface: default method. It can be overridden"
 *
 * Implementing and extending multiple interfaces
 *
 * One of the main differences between abstract classes and interfaces is that interfaces support multiple inheritance.
 *
 * A class can implement multiple interfaces:
 *
 * interface A { }
 *
 * interface B { }
 *
 * interface C { }
 *
 * class D implements A, B, C { }
 *
 * An interface can extend one or more other interfaces using the keyword extends:
 *
 * interface A { }
 *
 * interface B { }
 *
 * interface C { }
 *
 * interface E extends A, B, C { }
 *
 * A class can also extend another class and implement multiple interfaces:
 *
 * abstract class A { }
 *
 * interface B { }
 *
 * interface C { }
 *
 * class D extends A implements B, C { }
 *
 * All the examples above do not pose any problems.
 *
 * Multiple inheritance of interfaces is often used in the Java standard class library. The class String, for example, implements three interfaces at once:
 *
 * public final class String
 *     implements java.io.Serializable, Comparable<String>, CharSequence {
 * // ...
 * }
 */