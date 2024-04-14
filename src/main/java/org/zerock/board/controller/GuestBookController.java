package org.zerock.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.board.dto.GuestbookDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.service.GuestbookService;

@Controller
@RequestMapping("/guestbook") // http://localhost/guestbook/???
@Log4j2
@RequiredArgsConstructor // 자동 주입을 위한 Annotation
public class GuestbookController {

    private final GuestbookService service ; //final로 선언

    @GetMapping("/")
    public String index(){

        return "redirect:/guestbook/list";
    }


    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model){

        log.info("list......" + pageRequestDTO);

        model.addAttribute("result", service.getList(pageRequestDTO));

    }

    @GetMapping("/register")
    public void register(){
    //등록 작업을 처리하는 메소드
        log.info("register get...");
    }

    @PostMapping("/register")
    public String registerPost(GuestbookDTO dto, RedirectAttributes redirectAttributes){
    //등록 작업을 처리하는 메소드
        log.info("dto..." + dto);

        //새로 추가된 엔티티의 번호
        Long gno = service.register(dto);

        redirectAttributes.addFlashAttribute("msg", gno);

        return "redirect:/guestbook/list";

    }

    @GetMapping({"/read", "/modify"})
    public void read(long gno, @ModelAttribute("requestDTO") PageRequestDTO requestDTO, Model model){
    //read페이지와 modify페이지에 데이터 전달
        log.info("gno: " + gno);

        GuestbookDTO dto = service.read(gno);

        model.addAttribute("dto", dto);
    }

    //방명록의 삭제는 POST 방식으로 gno값을 전달하고, 삭제 후에는 다시 목록의 첫 페이지로 이동
    @PostMapping("/remove")
    public String remove(long gno, RedirectAttributes redirectAttributes){
        
        log.info("gno: " + gno);
        
        service.remove(gno);
        
        redirectAttributes.addFlashAttribute("msg", gno);
        
        return "redirect:/guestbook/list";
    }

    @PostMapping("/modify")
    public String modify(GuestbookDTO dto,
                         @ModelAttribute("requestDTO") PageRequestDTO requestDTO,
                         RedirectAttributes redirectAttributes){
    //수정해야 하는 글의 정보를 가지는 GuestbookDTO
    // 기존의 페이지 정보를 유지하기 위한 PageRequestDTO
    // 리다이렉트로 이동하기 위한 RedirectAttributes
        log.info("post modify.....................");
        log.info("dto: " + dto);

        service.modify(dto);

        redirectAttributes.addAttribute("page", requestDTO.getPage());
        redirectAttributes.addAttribute("type", requestDTO.getType());
        redirectAttributes.addAttribute("keyword", requestDTO.getKeyword());
        redirectAttributes.addAttribute("gno",dto.getGno());


        return "redirect:/guestbook/read";

    }
}
