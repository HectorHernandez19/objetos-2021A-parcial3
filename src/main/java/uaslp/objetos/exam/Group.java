package uaslp.objetos.exam;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;
    private int capacity;
    private int availability;

    public Group(int capacity){
        students = new ArrayList<>(capacity);
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
        Student student;
        double average = 0;
        for(int i = 0; i < students.size(); i++){
            student = students.get(i);
            average += student.getAverage();
        }
        return (average/students.size());
    }
}
