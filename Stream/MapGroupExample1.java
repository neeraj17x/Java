import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



class Student {
    private String name;
    private int age;
    private String city;
    private String email;

    public Student(String name, int age, String city, String email) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", city=" + city + ", email=" + email + ", name=" + name + "]";
    }

}

public class MapGroupExample1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "New York", "alice@example.com"));
        students.add(new Student("Bob", 22, "Los Angeles", "bob@example.com"));
        students.add(new Student("Charlie", 21, "Chicago", "charlie@example.com"));
        students.add(new Student("David", 20, "New York", "david@example.com"));
        students.add(new Student("Eve", 23, "Los Angeles", "eve@example.com"));
        students.add(new Student("Frank", 22, "Chicago", "frank@example.com"));
        students.add(new Student("Grace", 21, "New York", "grace@example.com"));
        students.add(new Student("Hank", 20, "Los Angeles", "hank@example.com"));
        students.add(new Student("Ivy", 22, "Chicago", "ivy@example.com"));
        students.add(new Student("Jack", 21, "New York", "jack@example.com"));
        students.add(new Student("Kelly", 20, "Los Angeles", "kelly@example.com"));
        students.add(new Student("Liam", 23, "Chicago", "liam@example.com"));
        students.add(new Student("Mia", 22, "New York", "mia@example.com"));
        students.add(new Student("Noah", 21, "Los Angeles", "noah@example.com"));
        students.add(new Student("Olivia", 20, "Chicago", "olivia@example.com"));
        students.add(new Student("Peter", 22, "New York", "peter@example.com"));

        // Group by city
        Map<String, List<Student>> groupedStudents = students.stream().collect(Collectors.groupingBy(Student::getCity));
        groupedStudents.forEach((city, studentsInCity) -> {
            System.out.println(city + "  Students ----------------:");
            studentsInCity.forEach(student -> {
                System.out.println("  " + student.getName());
            });
        });
        System.out.println("------------------------------------------");
        // Group by age
        Map<Integer, List<Student>> groupedStudentsByAge = students.stream().collect(Collectors.groupingBy(Student::getAge));
        groupedStudentsByAge.forEach((age, studentsOfAge) -> {
            System.out.println("Students of age " + age + " : ----------------");
            studentsOfAge.forEach(student -> {
                System.out.println(" " + student.getName());
            });
        });
        System.out.println("------------------------------------------");

        // Get students with max age
        Student oldestStudent = students.stream().max((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge())).get();
        System.out.println("Oldest Student: " + oldestStudent);

        List<Student> oldestStudents = students.stream().filter(s -> s.getAge() == oldestStudent.getAge()).collect(Collectors.toList());
        System.out.println("Oldest Students: " + oldestStudents);

    }

}
