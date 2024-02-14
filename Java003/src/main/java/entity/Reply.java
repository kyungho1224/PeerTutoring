package entity;

import java.time.LocalDateTime;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */
public class Reply {
    private Long id;

    private Post post;
    private String message;
    private String repliedBy;
    private LocalDateTime repliedAt;
}
