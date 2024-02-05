import entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KimKyungHo on 2024-02-05(005)
 */
public class Main {

    /*
    1. 4명의 Student 모델을 students 배열에 추가하세요.
    - 하나의 Student = id(학번), name(이름), score(점수)에 모두 다른 임의의 값을 넣어줍니다.
    - People, Student 모델을 완성해야 합니다. (extends, constructor, getter, setter)
     */



    public static void main(String[] args) {
        //Student[] students = new Student[4];
        List<Student> students = new ArrayList<>();
        /*students[0] = new Student(1,"찬희",80.5,"B");
        students[1] = new Student(2,"재현",94.1,"A");
        students[2] = new Student(3,"경호",59.4,"D");
        students[3] = new Student(4,"지안",72.8,"C");
         */

        // 4명의 학생을 생성하고 하나씩 넣어준다.
//        Book book1 = new Book(1, "홍길동", "자바", 20000, 500);
//        Book book2 = new Book(2, "홍길동", "자바", 20000, 500);
//        Book book3 = new Book(3, "홍길동", "자바", 20000, 500);

        // 각각의 학생을 생성하면서 넣어준다.
        Student student1 = new Student(1,"찬희",80.5,"B");
        students.add(student1);
        Student student2 = new Student(2,"재현",94.1,"A");
        students.add(student2);
        Student student3 = new Student(3,"경호",59.4,"D");
        students.add(student3);
        Student student4 = new Student(4,"지안",72.8,"C");
        students.add(student4);

        
        /* 피드백 사항 -> Student에 Student(Integer id, String name, Double score)생성자 안에 score를 통해 grade이 자동 초기화 되는 경우
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1 "김경호", 99.8));
        studentList.add(new Student(2 "황찬희", 47.6));
        studentList.add(new Student(3 "김지안", 77.2));
        studentList.add(new Student(4 "권재현", 88.5));

        System.out.println("studentList = " + studentList);
        */

        /* * 피드백 사항 -> for문과 향상된 for문 비교, score 등급 if문은 미작성 후 Student 생성자 오버로딩 형식으로 초기화도 가능함
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.println("student = " + student);
            Double score = student.getScore();
            String grade = "";
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
        }

        for (Student student : students) {
            System.out.println("student = " + student);
        }
        */


        
        /*
        2. 4명의 점수를 확인하여 grade 값을 채워줍니다.
        >= 90 : A
        >= 80 : B
        >= 70 : C
        >= 60 : D
        그 외 : F
         */

        for (int i = 0; i < 4; i++) {
            //Double score=students.get(i).getScore();

            // 1개의 학생을 가져온다
            Student student = students.get(i);
            // 그 학생의 점수를 가져온다
            Double score = student.getScore();

            // 그 점수를 각각 비교한다
            // 비교하면서 Grade를 셋팅한다
            //참고만 Student student 선언 X인 경우 students.get(i).setGrade("A");

            if (score>=90){
                student.setGrade("A");
            } else if (score>=80) {
                student.setGrade("B");
            } else if (score>=70) {
                student.setGrade("C");
            } else if (score>=60){
                student.setGrade("D");
            } else {
                student.setGrade("F");
            }
        }


        /*
        4. 점수가 가장 낮은 학생의 학번과 이름을 출력합니다.
        */
        Student basestudent = students.get(0);
        for (int i = 1; i < students.size() ; i++) {
            if (basestudent.getScore() > students.get(i).getScore()){

                basestudent = students.get(i);
            }
        }
        System.out.println(basestudent);


        /*
        5. 전체 학생의 평균 점수를 출력하는 메서드를 생성하고 호출하여 출력합니다.
         */
        // 점수가 필요하다
        // 점수를 더해서 평균을 저장할 메서드가 필요하다 sum
        // students의 길이로 접근을해서 점수 값을 가져온다
        // 평균을 저장할 메서드에 평균 값을 넣어주고 길이값으로 나눠준다

        Main main = new Main();    // static을 메서드에 안붙이고, none-static에 접근하기 위해서 Main을 인스턴스화 시킨다.
        Double sum = main.getAverage(students);
        System.out.println(sum);



        /*
        6. 점수가 70점 이상인 학생들만 담은 배열을 리턴하는 메서드를 생성하고 호출하여 모든 정보를 출력합니다.
         */
        //newstudents=점수가 70점 이상인 값을 저장할 배열 객체 필요
        //기존 students의 길이 만큼 반복하면서, 점수가 70점이상인 경우 newstudents에 추가한다.

        List<Student> sum1 = main.getnewstudents(students);
        System.out.println(sum1);





        /*
        7. 전학생 한 명을 추가한 후 점수를 내림차순으로 정렬해서 이름과 점수만 출력합니다.
         */
        //전학생 추가해
        //students의 점수를 내림 차순으로 정렬
        //정렬된 students의 이름과 점수만 출력
        students.add(new Student(5,"유영",88.0,"B"));

        students = students.stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .collect(Collectors.toList());


        System.out.println(students);

        /*List<Student> list = new ArrayList<>();
        if (students.size()>1){
            for (int i = 0; i < students.size(); i++) {
                for (int j = i+1 ; j < students.size(); j++) {
                    
                }
                
            }
        }*/
        


        /*
        8. 전학생이 추가된 상태일 때 5.번에서 호출한 메서드를 동일하게 사용했을 때 변경된 내용이 출력될 수 있도록 합니다. (매개변수 변경 가능)
         */
        Double chan = main.getAverage(students);
        System.out.println(chan);

    }

    Double getAverage(List<Student> students){

        double sum = 0;
        double score=0;

        for (int i = 0; i < students.size() ; i++) {
            score = students.get(i).getScore();
            sum += score;
        }
        sum = sum/students.size();
        return sum;
    }

    List<Student> getnewstudents(List<Student> students){
        List<Student> newstudents = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() >= 70){
                newstudents.add(students.get(i));
            }
        }
        return newstudents;
    }


}
