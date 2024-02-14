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
    private String postedBy;
    private LocalDateTime postedAt;
}
