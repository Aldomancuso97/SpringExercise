package Spring.Exercise.Control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {




    @GetMapping("/String")
    public String completeString(@RequestParam String n1, @RequestParam(required = false) String n2){
        if(n2 == null){
            return n1;
        }
        return n1 + " " + n2;


    }
}
