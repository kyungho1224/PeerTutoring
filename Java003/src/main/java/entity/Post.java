package entity;

import java.time.LocalDateTime;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */

/*
TODO
 1. 게시글이 "생성"될 때
 id = 게시글 목록의 길이 + 1,
 postedAt = 현재시각 으로 자동으로 생성합니다.
 2. 적당히 완성해서 사용하세요.
 */
public class Post {
    private Integer id;
    private String title;
    private String message;

    //작성자 이름
    private String postedBy;
    private LocalDateTime postedAt;


    public Post(String title, String message, String postedBy, int id) {
        this.title = title;
        this.message = message;
        this.postedBy = postedBy;
        this.id = id;
        postedAt= LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getPostedAt() {
        return postedAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", postedBy='" + postedBy + '\'' +
                ", postedAt=" + postedAt +
                '}'+'\n';
    }
}
