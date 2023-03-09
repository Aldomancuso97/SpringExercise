package Spring.Exercise.Control;

import Spring.Exercise.Service.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlName {

    @Autowired
    Name name;



    @GetMapping("/Name")
    public String getname(){
        return name.getName();
    }


    @PostMapping("/ReversName")
    public String ReverseName(String name){
        return name;
    }
}
