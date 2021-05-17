package fly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlyController {
    @RequestMapping("/coco")
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }
}
