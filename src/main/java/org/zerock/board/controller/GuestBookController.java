package org.zerock.board.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guestbook") // http://localhost/guestbook/???
@Log4j2
public class GuestBookController {

    @GetMapping({"/","/list"})
    public String list(){
        log.info("GuestBookController.list() 메서드 실행");
        return "/guestbook/list"; // list.html로 감

    }
}
