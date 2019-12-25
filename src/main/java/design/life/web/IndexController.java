package design.life.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({ "/", "/index" })
    public String index() {
        return "人生再设计";
    }

}
