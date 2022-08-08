import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Khoi tao doi tuong
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");


        // Tạo hashMap
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        // Sử dụng for each để in ra danh sách student
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...........Set");

        // Tạo hashSet
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
//KẾT LUẬN
//       HASHSET                                       HAShMAP
// Lưu trữ dữ liệu dưới dạng object             Lưu trư dữ liệu dưới dạng cặp đôi key - value
// Ko cho phép phàn tử trùng lặp                ko cho phép các key trùng lặp nhưng cho phép value trùng lặp
// Nên sử dụng khi cần duy nhất dữ liệu         Nên sử dụng khi cần duy nhất khóa (key)