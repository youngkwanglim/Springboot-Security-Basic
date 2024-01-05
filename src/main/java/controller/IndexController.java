package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //View를 리턴하겠다.
public class IndexController {

    @GetMapping({"", "/"})
    public String index() {
        //머스테치
        return "index";
    }
}
