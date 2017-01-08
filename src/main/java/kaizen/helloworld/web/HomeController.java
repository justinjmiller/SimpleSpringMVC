package kaizen.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by larry on 1/7/2017.
 *
 */
@Controller
public class HomeController {

    @RequestMapping({"/","/index"})
    public String index()
    {
        return "index";
    }
}
