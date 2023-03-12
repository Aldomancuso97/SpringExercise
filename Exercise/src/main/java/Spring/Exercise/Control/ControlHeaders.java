package Spring.Exercise.Control;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;
import java.net.http.HttpHeaders;

@RestController
public class ControlHeaders {


    /*@GetMapping("/headers")
    public String getHeader(@RequestHeader HttpHeaders headers) {
        InetSocketAddress host = headers.getHost();
        return ("The host is: " + host.getHostName()
                + " and the port is: " + host.getPort());
    }*/
}

