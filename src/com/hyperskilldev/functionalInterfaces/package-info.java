package com.hyperskilldev.functionalInterfaces;

/**
 *  Theory: Functional interfaces and lambda expressions
 * 16 minutes
 * 0 / 5 problems solved
 * Functional interface
 *
 * The functional interface is an interface (not a class or enum) with a single abstract method (SAM type). Static and default methods are allowed here.
 *
 * There is a special annotation @FunctionalInterface in The Java Class Library. It marks functional interfaces and indicates if the interface doesn't satisfy the requirements of a functional interface (compile-time error). The annotation is not mandatory but it's recommended to mark functional interfaces.
 *
 * Let's declare our own generic functional interface for representing a simple function with one argument. See code below.
 *
 * @FunctionalInterface
 * interface Func<T, R> {
 *
 *     R apply(T val);
 *
 *     static void doNothingStatic() {
 *
 *     }
 *
 *     default void doNothingByDefault() {
 *
 *     }
 * }
 *
 * This functional interface has the @FunctionalInterface annotation (optional) and only one instance method apply. The interface represents a function (in the math sense). The function has an instance method apply which takes a value of type T and returns a result of type R.
 *
 * The functional interface is another way to model functions using object-oriented programming instead of methods.
 * Implementing functional interfaces
 *
 * We can't create an instance of the functional interface Func<T, R> because it's an interface. First, we should implement it and then create an instance of the concrete class. The main thing is to implement the apply method to get a concrete behavior.
 *
 * Like any interface, a functional interface can be implemented using regular inheritance or anonymous classes.
 *
 * 1) Anonymous class. To implement a functional interface let's create an anonymous class and override the method apply. The overridden method calculates the square of a given value.
 *
 * Func<Long, Long> square = new Func<Long, Long>() {
 *     @Override
 *     public Long apply(Long val) {
 *         return val * val;
 *     }
 * };
 *
 * long val = square.apply(10L); // the result is 100L
 *
 * In this example, we model a math function which squares a given value. This code works perfectly but it is a little unclear.
 *
 * 2) Lambda expression. Besides, the functional interfaces can be implemented and instantiated using a lambda expression.
 *
 * Here is a lambda expression which has the same behavior as the anonymous class above.
 *
 * Func<Long, Long> square = val -> val * val; // the lambda expression
 *
 * long val = square.apply(10L); // the result is 100L
 *
 * As you can see, the type of the functional interface (left) and the type of the lambda (right) has the same semantic meaning.
 *
 * In general case, a functional interface can be instanced using a lambda expression because the interface has a single abstract method (non-default and non-static). Parameters and a returned value of a lambda expression correspond to parameters and a returned value of SAM in a functional interface.
 *
 * Writing lambda expressions is the most convenient way to implement and instantiate functional interfaces appeared in Java 8.
 *
 * Understanding lambda expressions
 *
 * So, by lambda expression, we mean an anonymous function that allows to use code as data and pass it as an argument to a method. Before the Java 8, many developers used anonymous classes for these purposes.
 *
 * Any lambda expression has two parts: the part before the arrow operator "->" are the parameters and the part following the "->" is its body.
 *
 * There are a lot of ways to write lambda expressions in Java 8. Let's consider some examples of lambda expressions using standard functional interfaces (included in the Java 8 Class Library).
 *
 * // a simple way to write a lambda expression with two parameters
 * BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
 *
 * // if it has only one argument "()" are optional
 * Function<Integer, Integer> identity1 = x -> x;
 *
 * // it's valid too
 * Function<Integer, Integer> identity2 = (x) -> x;
 *
 * // without type inference
 * Function<Integer, Integer> mult = (Integer x) -> x * 2;
 *
 * // with multiple statements
 * Function<Integer, Integer> adder = (x) -> {
 *     x += 5;
 *     x += 10;
 *     return x;
 * };
 *
 * Standard functional interfaces will be studied in another topic, but here are some explanations:
 *
 *     BiFunction<T, U, R> is a standard functional interface representing a function with two arguments of types T and U. It returns a value of type R.
 *     Function<T, R> is also a standard functional interface but it has only one argument of type T and returns a value of type R.
 *
 * Sometimes, lambda expressions don't have parameters or return values. They will be studied later.
 * Passing lambda expressions to methods
 *
 * It's possible to pass a lambda expression to a method if the method takes an object of type a suitable functional interface.
 *
 * Here is an example. The method acceptFunctionalInterface takes an object of the standard type Function<Integer, Integer>.
 *
 * public static void acceptFunctionalInterface(Function<Integer, Integer> f) {
 *    System.out.println(f.apply(10));
 * }
 *
 * Let's pass some functions in the method:
 *
 * // it returns the next value
 * Function<Integer, Integer> f = (x) -> x + 1;
 *
 * acceptFunctionalInterface(f); // it prints 11
 *
 * // or even without a reference
 * acceptFunctionalInterface(x -> x + 1); // the result is the same: 11
 *
 * Inside the method acceptFunctionalInterface, the given function will be invoked. In enterprise programming, it is often called the callback.
 *
 * According to Wikipedia: "a callback is a piece of executable code that is passed as an argument to other code, which is expected to call back (execute) the argument at some convenient time."
 *
 * In other words, in Java, we can pass our functions (presented by objects) in a method/function as its arguments.
 *
 * Note. In functional programming, a function (including methods in Java) that accepts or returns another function is called a higher-order function. A lot of features such as function composition, currying, monads and some others based on this idea.
 * Usage of closures
 *
 * In the body of a lambda expression, it's possible to capture values from a context where the lambda is defined. This technique is called closure.
 *
 * Let's see an example.
 *
 * final String hello = "Hello, ";
 * Function<String, String> helloFunction = (name) -> hello + name;
 *
 * System.out.println(helloFunction.apply("John"));
 * System.out.println(helloFunction.apply("Anastasia"));
 *
 * The lambda expression captured the final variable hello.
 *
 * The result of this code.
 *
 * Hello, John
 * Hello, Anastasia
 *
 * It's possible only if a context variable has a keyword final or it's effectively final, i.e. variable can't be changed. Otherwise, an error happens.
 *
 * Let's consider the example with an effectively final variable.
 *
 * int constant = 100;
 * Function<Integer, Integer> adder = x -> x + constant;
 *
 * System.out.println(adder.apply(200));
 * System.out.println(adder.apply(300));
 *
 * The variable constant is effectively final and being captured by the lambda expression.
 *
 * Note. If we use anonymous classes instead of lambdas, we can do the same tricks.
 */