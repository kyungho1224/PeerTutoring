package entity;

/**
 * Created by KimKyungHo on 2024-02-05(005)
 */
public class Student {

    private Integer id;
    private String name;
    private Double score;
    private String grade;   // A, B, C, D, F

    public Student(Integer id, String name, Double score, String grade) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }

/* 피드백 사항 - > grade 매개변수를 받아오지 않았지만, score 값에 따라 자동 초기화 가능
    public Student(Integer id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F"
        }
*/
    }
