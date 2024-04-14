package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.zerock.board.entity.Guestbook;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long>,
        QuerydslPredicateExecutor<Guestbook> {
    //extends JpaRepository<엔티티명, pk타입>
    // jpa가 curd를 해준다. -> JpaRepository에 상속 받는 메소드

    // Querydsl : 0도메인을 이용해서 자동으로 검색 조건을 완성 시킴(다중 검색용)

    //http://querydsl.com/ : 0도메인을 이용해서 자동으로 검색 조건을 완성 시킴(다중검색용)
    //
}
