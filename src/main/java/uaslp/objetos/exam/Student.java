package uaslp.objetos.exam;

public class Student {
    private Integer scores[];
    private String name;
    private int code;

    public Student(String name, int code){
        scores = new Integer[3];
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int partial, int score) throws InvalidPartialException{
        if(partial < 1 || partial > 3){
            throw new InvalidPartialException();
        }
        this.scores[partial-1] = score;
    }
    public double getAverage(){
        double average = 0;
        for (int i = 0; i < scores.length; i ++){
            if(scores[i]== null){
                throw new MissingScoreException("Missing partial " + (i+1));
            }
            average += scores[i];
        }
        return (average /= scores.length);
    }
}
