package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/*
@RestController = @Controller + @ResponseBody
@Controller --> Tells the following class can handle http req and res. Also, by this we can return only view(html)
@ResponseBody --> Tells whatever type is returned (string/xml/json etc., except html), will be automatically serialized to json and passed to http res obj
*/
@RestController
public class MyController {

    @GetMapping("/returnStr") // this maps the below method to the path
    public String getStr(){
        return "str";
    }

    @Autowired
    private MyService myService;

    @GetMapping("/returnView")
    public ModelAndView getView() {
        return myService.getView();
    }
}

/*
servlet --> html inside java
jsp --> java inside html
*/
