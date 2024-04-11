package org.zerock.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Guestbook extends BaseEntity{
    //extends BaseEntity를 상속받아서 날짜 시간 자동처리
    @Id // Guestbook 데이블의 pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 마리아db용 자동 번호
    private Long gno ; //방명록에서 사용할 번호
    @Column(length = 100, nullable = false)// 문자 100, not null
    private String title;
    @Column(length = 1500, nullable = false)
    private String content;
    @Column(length = 50, nullable = false)
    private String writer;  //작성자

    public void changeTitle(String title){
        this.title = title; // 세터 역할 (수정할 때 사용)
    }
    public void changeContent(String content){
        this.title = content; // 세터 역할 (수정할 때 사용)
    }

}
