package uaslp.objetos.exams;

import java.util.List;

public class Group {
    private List<Student> students;
    private int capacity;
    private int availability;

    public Group(int capacity){
        this.capacity = capacity;
        availability = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailability() {
        return availability;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(List<Student> student) {
        students.add((Student) student);
    }
}
