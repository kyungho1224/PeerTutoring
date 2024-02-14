package entity;

/**
 * Created by KimKyungHo on 2024-02-07(007)
 */
public class JuniorProgrammer extends Programmer implements Actionable {
    @Override
    public void display() {
        System.out.println("주니어 개발자입니다.");
    }

    @Override
    public void doJava() {
        System.out.println("자바 활용 능력은 '하'입니다.");
    }

    @Override
    public void doKotlin() {
        System.out.println("코틀린은 모릅니다.");
    }

    @Override
    public void doPython() {
        System.out.println("파이썬 활용 능력은 '하'입니다.");
    }

    @Override
    public void doAndroid() {
        System.out.println("안드로이드 활용 능력은 '마스터'입니다.");
    }

    public void leave(){
        System.out.println("먼저 퇴근하겠습니다.");
    }
}
