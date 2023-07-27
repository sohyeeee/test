package com.ll.exam.sbb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    // N:1 관계. @ManyToOne설정하면 Answer 엔티티의 question 속성과 Question 엔티티가 서로 연결.(데이터베이스에서는 ForeignKey 관계가 생성)
    private Question question;
}