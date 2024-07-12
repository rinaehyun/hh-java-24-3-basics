package grouptasks.streams;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class StudentCSV {
    public static void main(String[] args) throws IOException {
        // Read the csv file
        String filePath = System.getProperty("user.dir") + "/src/main/java/grouptasks/streams/data/students.csv";
        Stream<String> file = Files.lines(Path.of(filePath));


        List<Student> students = file
                // Remove header
                .skip(1)
                // Remove invalid line (empty row)
                .filter(line -> !line.trim().isEmpty())
                // Remove duplicates
                .distinct()
                // Convert each line in csv file to the class Student
                .map(line -> {
                    String[] fields = line.split(",");

                    int id = Integer.parseInt(fields[0]);
                    String name = fields[1];
                    String postalCode = fields[2];
                    int age = Integer.parseInt(fields[3]);
                    return new Student(id, name, postalCode, age);
                })
                .toList();

        students.forEach(System.out::println);
    }
}
