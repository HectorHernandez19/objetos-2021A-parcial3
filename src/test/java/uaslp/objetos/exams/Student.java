package uaslp.objetos.exams;

public class Student {
    private String name;
    private int code;

    public Student(String name, int code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
