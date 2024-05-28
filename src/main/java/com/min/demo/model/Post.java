package com.min.demo.model;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Post {
    private String postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;
}
