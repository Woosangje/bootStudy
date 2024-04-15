package org.zerock.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")   //@ToString은 항상 exclude
public class Board extends BaseEntity{
    //Board 클래스는 Member의 이메일(PK)을 FK로 참조하는 구조

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    private String content;
    
    @ManyToOne (fetch = FetchType.LAZY) // 명시적으로 Lazy 로딩 지정
    private Member writer;  //연관관계 지정

    public void changeTitle(String title){
        this.title = title;
    }

    public void changeContent(String content){
        this.content= content;
    }
}
