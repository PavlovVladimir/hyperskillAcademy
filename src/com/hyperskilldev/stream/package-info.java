package com.hyperskilldev.stream;
/**
 *  Theory: Input streams
 * 34 minutes
 * 0 / 5 problems solved
 *
 * As a rule, every program consumes some data. It is the usual way to communicate with the outer world. It can be a user's input from a console, configuration file or something else. Java has a common mechanism for consuming data called input streams. We have already provided some text as data for our programs, and now it is time to dive deeper and learn the mechanism of input streams in Java.
 * Sources
 *
 * Data can be obtained from many points considered as providers. Besides console or file, they can be network connections, in-memory buffers or even objects and more. All these points are called sources for input streams. In fact, a source is any data that can be consumed and processed by a program.
 *
 * Since the implementation of a particular source consuming is quite specific, each source needs a special class dedicated to this source.
 * Character streams
 *
 * Earlier we've used Scanner for reading text from standard input or file. There are also other classes with a similar purpose. They are called character input streams and allow reading text data: char or String. All such classes extend java.io.Reader class. Let's look at its methods. The most interesting methods for us are those that allow reading data:
 *
 *     int read() reads a single character
 *     int read(char[] cbuf) reads characters into array
 *     int read(char[] cbuf, int off, int len) reads characters into a portion of array
 *     int read(CharBuffer target) reads characters into CharBuffer
 *
 * Each method returns a number characters that were actually read. These methods block program running until some input is available, the end of stream is reached or something bad like an exception happened. This is a reason why returned value can differ from expected.
 *
 * Another important method is void close() that should be invoked after a stream was used. To work with resources in a proper way, wrap it by try-with-resources construction. We will learn about streams and exceptions in other topics, so don't worry if you don't completely understand the last part.
 *
 * There are several popular classes-successors of Reader: FileReader, CharArrayReader or StringReader. The class name indicates what type of source it uses as an input. Let's consider FileReader as an example.
 *
 * FileReader has a set of constructors. Here's some of them:
 *
 *     new FileReader(String fileName)
 *     new FileReader(String fileName, Charset charset)
 *     new FileReader(File file)
 *     new FileReader(File file, Charset charset)
 *
 * A charset is a class that declares encoding from sequences of bytes to characters. By default, java uses UTF-16 encoding and usually, it's what you need. However, sometimes the file may have another encoding and you'll have to use a different charset to read the content of the file properly.
 *
 * Suppose we have a file.txt with the following content: input stream.
 *
 * Reader reader = new FileReader("file.txt");
 *
 * char first = (char) reader.read(); // i
 * char second = (char) reader.read(); // n
 *
 * char[] others = new char[12];
 * int number = reader.read(others); // 11
 *
 * Now others == ['p', 'u', 't', ' ', 's', 't', 'r', 'e', 'a', 'm', '', '']. Let's explain the result.
 *
 * The first 10 characters are filled as expected, starting from the third letter. Then stream reached the end of the file and stopped reading, leaving the last two characters empty.
 * Byte streams
 *
 * We already interacted with input stream indirectly, when we were using Scanner. As you remember to read something from standard input we create Scanner instance in such a way:
 *
 * Scanner scanner = new Scanner(System.in);
 *
 * System.in is an example of the byte input stream and has InputStream type. Let's consider the class in more detail.
 *
 * java.io.InputStream is an abstract class that plays a superclass role for other byte input stream classes from the standard library. The class contains several methods for reading:
 *
 *     abstract int read() reads a single byte
 *     int read(byte[] b) reads some number of bytes and stores them in byte array
 *     int read(byte[] b, int off, int len) reads up to len bytes and stores them in byte array
 *     byte[] readAllBytes() reads all bytes
 *     int readNBytes(byte[] b, int off, int len) reads the requested number of bytes and stores them in byte array
 *     byte[] readNBytes(int len) reads the requested number of bytes
 *
 * As you may notice, read and readNBytes methods look quite similar. The main difference is in their behavior when blocking running program. Blocking means that the program is hanging out on both read statements and waiting for an input completion. Completion of input can be detected by the end of file or end of stream events. read method waits until both end of file or end of stream events are detected. readNBytes method waits only for end of stream event. Also thrown exception can be a reason to finish waiting for both methods. Again, if that seems too complicated, skip this part for now.
 *
 * Some methods return int value. It is the number of bytes that were actually read from the source. If -1 value is returned it is a sign that no bytes were read. off argument is a start offset in the byte array where data is written.
 *
 * Each input stream class has also void close() method to release system resources.
 *
 * InputStream has several direct subclasses from the standard library: ByteArrayInputStream is used for reading from byte[], FileInputStream is dedicated for files,  AudioInputStream is a way of consuming audio input and there's more.
 *
 * Let's look at FileInputStream class. It can be created by using several constructors. Among them are:
 *
 *     new FileInputStream(String pathToFile)
 *     new FileInputStream(File file)
 *
 * Suppose we have file.txt that contains text: input stream. We are going to read the first five bytes:
 *
 * byte[] bytes = new byte[5];
 * try (InputStream inputStream = new FileInputStream("file.txt")) {
 *     int numberOfBytes = inputStream.read(bytes);
 *     System.out.println(numberOfBytes); // 5
 * }
 *
 * Now bytes = ['i', 'n', 'p', 'u', 't'];
 *
 * Here we use try-with-resources construction that handles invoking close() method in a proper way.
 *
 * The main difference between byte and character streams is that byte ones read input data as bytes while character
 * ones work with characters.
 * What type of stream should I use?
 *
 * Generally speaking, a computer understands only sequences of bytes. As long as any data is just a set of bytes, the byte input stream is a common way for reading any kind of data. On the contrary, human beings (that's us) get used to deal with sequences of characters. For computers, characters are still combinations of bytes defined by charset specification. Character input streams are aimed to read data which consists of characters. Under the hood, they still read bytes, but immediately encode bytes to characters. So if you need to read a text, use character input streams. Otherwise, for example, while reading audio, video, zip and etc., use byte input streams.
 * Buffered streams
 *
 * Input streams have two classes from the standard library that do buffering.
 *
 * For byte input streams:
 *
 *     BufferedInputStream(InputStream in)
 *     BufferedInputStream(InputStream in, int size)
 *
 * For character input stream:
 *
 *     BufferedReader(Reader in)
 *     BufferedReader(Reader in, int size)
 *
 * They take another stream as an input and do buffering. An additional parameter size is the size of the buffer.
 * Conclusion
 *
 * Input streams provide a way to read data from a source. The source is a data provider like a console or standard input, file, string or even network connection. There are two types of sources: byte and character ones. Character input streams are intended for reading text only. Byte input streams allow reading sequences of raw bytes. Character input stream classes usually end with Reader, because as a rule, they extend one abstract java.io.Reader class. Similarly, byte input streams end with InputStream.
 */