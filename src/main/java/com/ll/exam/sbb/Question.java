package com.ll.exam.sbb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity // 아래 Question 클래스는 엔티티 클래스이다.
// 아래 클래스와 1:1로 매칭되는 테이블이 DB에 없다면, 자동으로 생성되어야 한다.
public class Question {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    //@GeneratedValue 데이터를 저장할 때 해당 속성에 값을 따로 세팅하지 않아도 1씩 자동으로 증가하여 저장
    //strategy는 고유번호를 생성하는 옵션'
    //GenerationType.IDENTITY는 해당 컬럼만의 독립적인 시퀀스를 생성하여 번호를 증가시킬 때 사용
    private Integer id;
    @Column(length = 200) // varchar(200)
    private String subject;
    @Column(columnDefinition = "TEXT")
    //columnDefinition = "TEXT"은 "내용"처럼 글자 수를 제한할 수 없는 경우에 사용
    //엔티티의 속성은 @Column을 사용안해도 테이블 컬럼으로 인식. 인식하고 싶지 않은 경우에만 @Transient 사용
    private String content;
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
    //질문1개에 답변이 여러개. mappedBy는 참조 엔티티의 속성명을 의미(answer안에 변수명)
    //cascade 질문 하나에는 여러개의 답변이 작성가능. 이때 질문을 삭제하면 그에 달린 답변들도 모두 함께 삭제
}
