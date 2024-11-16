package spring;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MyService {

    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView("MyDynamicPage.html");

        List<Person> list = new ArrayList<>();
        list.add(new Person("ayu", 1));
        list.add(new Person("ayush", 2));
        modelAndView.getModelMap().put("personList", list);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd mm:hh:ss");
        modelAndView.getModelMap().put("date", dateFormat.format(new Date()));

        return modelAndView;
    }
}
