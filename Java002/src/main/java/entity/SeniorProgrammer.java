package entity;

/**
 * Created by KimKyungHo on 2024-02-07(007)
 */
public class SeniorProgrammer extends Programmer implements Actionable {
    private String grade;

    public SeniorProgrammer(){

    }

    public SeniorProgrammer(String grade) {
        this.grade = grade;
    }

    @Override
    public void display() {
        super.display();
    }

    public void display(String grade) {
        this.grade = grade;
        System.out.println(grade + " 개발자입니다.");
    }

    @Override
    public void doJava() {
        System.out.println("자바 활용 능력은 '마스터'입니다.");
    }

    @Override
    public void doKotlin() {
        System.out.println("코틀린 활용 능력은 '하'입니다.");
    }

    @Override
    public void doPython() {
        System.out.println("파이썬 활용 능력은 '마스터'입니다.");
    }

    @Override
    public void doAndroid() {
        System.out.println("안드로이드 활용 능력은 '중'입니다.");
    }
}
