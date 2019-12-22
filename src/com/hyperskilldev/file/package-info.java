package com.hyperskilldev.file;

/**
 * Let's create a file object and then a scanner to read data from the file.
 *
 * File file = new File(pathToFile);
 * Scanner scanner = new Scanner(file); // it throws FileNotFoundException (checked)
 *
 * When you create an instance of Scanner passing a file, you must handle the checked exception FileNotFoundException.
 * You can also declare the method as throwing this exception.
 *
 * Now, we can use methods of Scanner to read data as strings, integers and so on.
 *
 * Let's read all integers from the file:
 *
 * while (scanner.hasNextInt()) {
 *     System.out.print(scanner.nextInt() + " ");
 * }
 *
 *
 *After using a scanner, we should close the object to avoid leaks. A convenient way to close scanners and handle
 *  exceptions is to use the try-with-resources statement as below.
 *
 * File file = new File(pathToFile);
 *
 * try (Scanner scanner = new Scanner(file)) {
 *     while (scanner.hasNextInt()) {
 *         System.out.print(scanner.nextInt() + " ");
 *     }
 * } catch (FileNotFoundException e) {
 *     System.out.println("No file found: " + pathToFile);
 * }
 *
 * The scanner also allows you to read strings, lines, boolean, doubles, and other types. Instead of displaying
 * the read data to the standard output, you can store them in an array or a string.
 *
 *
 * The following method returns all text from a specified file.
 *
 * public static String readFileAsString(String fileName) throws IOException {
 *     return new String(Files.readAllBytes(Paths.get(fileName)));
 * }
 *
 *
 * Let's try to use the method readFileAsString to read the source code from the file HelloWorld.java and print it
 * to the standard output.
 *
 * import java.io.IOException;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 *
 * public class ReadingFileDemo {
 *     public static String readFileAsString(String fileName) throws IOException {
 *         return new String(Files.readAllBytes(Paths.get(fileName)));
 *     }
 *
 *     public static void main(String[] args) {
 *         String pathToHelloWorldJava = "/home/username/Projects/hello-world/HelloWorld.java";
 *         try {
 *             System.out.println(readFileAsString(pathToHelloWorldJava));
 *         } catch (IOException e) {
 *             System.out.println("Cannot read file: " + e.getMessage());
 *         }
 *     }
 * }
 */