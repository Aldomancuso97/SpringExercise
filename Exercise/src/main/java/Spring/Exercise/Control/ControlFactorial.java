package Spring.Exercise.Control;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlFactorial {


    @PostMapping("/factorial")
    public int factorial (@RequestParam Integer n1, @RequestParam Integer n2 ) {
        return n1 + n2;
    }

}
