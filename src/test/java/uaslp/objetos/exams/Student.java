package uaslp.objetos.exams;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int code;
    private List<Integer> scores;
    private  double average;

    public Student(String name, int code){
        scores = new ArrayList<>();
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int parcial, int score){
        if(parcial > 3 || parcial < 1){
            throw new InvalidPartialException();
        }else{
            scores.set(parcial, score);
        }
    }
    public double getAverage(){
        if(scores.size()<3){
            throw new MissingScoreException();
        }
        for (int i = 0; i < scores.size(); i ++){
            average += scores.get(i);
        }
        return (average /= scores.size());
    }
}
