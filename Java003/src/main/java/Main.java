import api.PostApi;

import java.util.Scanner;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */
public class Main {

    public static void main(String[] args) {

        PostApi postApi;
        ConsoleView consoleView;

        while (true) {

            System.out.println("========== 게시판 프로그램 ==========");
            System.out.println("1.게시글 작성\n2.게시글 단건 조회\n3.게시글 전체 조회\n4.종료");
            System.out.println("==================================");
            System.out.print("메뉴입력 : ");

            Scanner scanner = new Scanner(System.in);
            String menuNum = scanner.nextLine();

            if (menuNum.equals("1")) {
                /*
                TODO
                 1. 작성자 이름을 입력받는다.
                 2. 제목을 입력받는다.
                 3. 내용을 입력받는다.
                 4. 입력받은 내용을 용도에 맞게 저장한다.
                 5. 저장한 게시글의 제목과 함께 저장완료 메시지 출력
                 6. 다른 메뉴에 대한 내용을 완성합니다.
                 */
            } else {
                break;
            }

        }

    }

}
