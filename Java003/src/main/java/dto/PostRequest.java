package dto;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */

/*
TODO 게시글을 입력받을 때 사용하는 DTO 입니다. 적당히 완성해서 사용하세요.
 */
public class PostRequest {
    private String title;
    private String message;

    public PostRequest(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
