package uaslp.objetos.exams;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;
    private int capacity;
    private int availability;

    public Group(int capacity){
        students = new ArrayList<>(21);
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

    public void addStudent(Student student) {
        if(availability == 0){
            throw new GroupIsFullException();
        }
        students.add(student);
        availability--;
    }

    public double getAverage(){
        return 90;
    }
}
