import api.PostApi;
import dto.PostRequest;
import entity.Post;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Number> chan01 = new ArrayList<>();
        ArrayList<Integer extends> chan02 = new ArrayList<>();
        chan01.add(1);


        PostApi postApi = new PostApi();
        ConsoleView consoleView = new ConsoleView();

        while (true) {

            System.out.println("========== 게시판 프로그램 ==========");
            System.out.println("1.게시글 작성\n2.게시글 단건 조회\n3.게시글 전체 조회\n4.게시글 단건 삭제\n5.게시글 단건 업데이트\n6.종료");
            System.out.println("==================================");
            System.out.print("메뉴입력 : ");

            Scanner scanner = new Scanner(System.in);
            String menuNum = scanner.nextLine();

            if (menuNum.equals("1")) {
                //("1".equals(menuNum))
                /*
                TODO
                 1. 작성자 이름을 입력받는다.
                 2. 제목을 입력받는다.
                 3. 내용을 입력받는다.
                 4. 입력받은 내용을 용도에 맞게 저장한다.
                 5. 저장한 게시글의 제목과 함께 저장완료 메시지 출력
                 6. 다른 메뉴에 대한 내용을 완성합니다.
                 */
                System.out.println("이름을 입력하세요.");
                String inputname = scanner.nextLine();
                System.out.println("제목을 입력하세요.");
                String inputitle = scanner.nextLine();
                System.out.println("내용을 입력하세요.");
                String inputmessage = scanner.nextLine();
                PostRequest postRequest = new PostRequest(inputitle, inputmessage);
                postApi.create(inputname, postRequest);
                System.out.println(inputitle+"저장완료 되었습니다.");
            } else if (menuNum.equals("2")) {
                System.out.println("조회할 아이디를 입력하세요.");
                int inputId = scanner.nextInt();
                consoleView.printMessage(postApi.read(inputId));
            } else if (menuNum.equals("3")) {
                consoleView.printMessage(postApi.readAll());
            } else if (menuNum.equals("4")) {
                System.out.println("삭제할 아이디를 입력하세요.");
                int removeId = scanner.nextInt();
                postApi.delete(removeId);
            } else if (menuNum.equals("5")) {
                System.out.println("업데이트할 아이디를 입력하세요.");
                int updateId = scanner.nextInt();
                System.out.println("업데이트할 목록을 선택하세요. 1-제목, 2-메세지, 3-제목+메세지");
                Integer num = scanner.nextInt();
                scanner.nextLine();
                if (num == 1){
                    System.out.println("업데이트할 제목을 입력하세요.");
                    String updateTitle = scanner.nextLine();
                    postApi.update(updateId, updateTitle, num);
                } else if (num == 2) {
                    System.out.println("업데이트할 메세지를 입력하세요.");
                    String updateMessage = scanner.nextLine();
                    postApi.update(updateId, updateMessage, num);
                } else if (num == 3) {
                    System.out.println("업데이트할 제목을 입력하세요.");
                    String updateTitle = scanner.nextLine();
                    System.out.println("업데이트할 메세지를 입력하세요.");
                    String updateMessage = scanner.nextLine();
                    PostRequest pRequest = new PostRequest(updateTitle, updateMessage);
                    postApi.update(updateId, pRequest);
                } else {
                    System.out.println("잘못 입력했습니다.");
                }

            } else if (menuNum.equals("6")) {
                System.out.println("정상 종료 합니다.");
                break;
            } else {
                System.out.println("1~5번 입력을 해주세요.");
            }
        }
    }
}