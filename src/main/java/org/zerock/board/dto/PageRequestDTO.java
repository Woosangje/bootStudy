package org.zerock.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class PageRequestDTO<DTO, EN> {

    //DTO리스트
    private List<DTO> dtoList;

    //총 페이지 번호
    private int totalPage;

    private int page;    //현재 페이지 번호
    private int size;    //목록 사이즈
    private String type; //검색용 타입
    private String keyword; // 검색용 키워드

    public PageRequestDTO(){
        this.page = 1;
        this.size = 10;
    }

    public Pageable getPageable(Sort sort){

        return PageRequest.of(page -1, size, sort);
    }

}
