## Notes

### 1. Understanding the File class

- The File class in Java is used to create and manipulate files and directories. It is a part of the java.io package.
- The File class is an abstract representation of file and directory pathname.
- The File class is used to create objects that provide access to the files and directories of a local file system.
- It is not used to read or write data to files.
#### 1.1. Java as an Object-Oriented language
- Since Java is a very Object-Oriented language (to its detriment), many of the classes resemble the real-world objects they represent.
- The File class is no exception. It is used to represent a file or directory in the file system.
- Other than that, we have the Path class, which is used to represent a path in the file system.
- Even networking is represented by the URL class.
- HTTP requests are represented by the HttpRequest class.
- HTTP responses are represented by the HttpResponse class.
- To send and receive HTTP requests and responses, we have the HttpClient class.
- The list goes on and on.
- *Just use C# instead.*
### 2. Scanner class for files

- The Scanner class can be used to read files in Java.
- Other than system input, a Scanner object can be used to read the contents of a file.
- The Scanner class provides constructors that can be used to read a file in different ways.

### 3. Writing to a file with PrintWriter

- The PrintWriter class can be used to write data to files.
- The Constructor of the PrintWriter class can be used to write data to a file.

### 4. Scanner.hasNextLine() and Scanner.nextLine()

- The hasNextLine() method of the Scanner class returns true if there is another line in the input of this scanner.
- It can be used to check if there is another line in the input of the scanner.
- For example, if the input of the scanner is a file, the hasNextLine() method can be used to check if there is another line in the file.
  - if true, the nextLine() method can be used to read the next line in the file.