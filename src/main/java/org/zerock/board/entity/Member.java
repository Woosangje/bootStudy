package org.zerock.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Member extends BaseEntity{

    @Id
    private String email;   //Member 클래스는 이메일 주소를 PK로 이용합니다.

    private String password;

    private String name;
}
