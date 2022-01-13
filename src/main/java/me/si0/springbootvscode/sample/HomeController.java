package me.si0.springbootvscode.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping (value="/hi")
    public String homej() throws Exception {
        System.out.println("homej hi");
        return "/index";
    }
    @RequestMapping (value="/hi2")
    public ModelAndView home2(ModelAndView mav){
        System.out.println("ModelAndView");
        mav.setViewName("indexMv");
        return mav;
    }

        /**
     * Thymeleaf 호출 테스트
     * @param medel
     * @return
     * @throws Exception
     */
    @RequestMapping ( value="/tf")
    public String home(Model model) throws Exception{
        model.addAttribute("name","Hello Thymeleaf!");
        System.out.println("root / home");
        return "html/index";
    }
    @RequestMapping("/wellcome.do")
    public String wellcome(
        @RequestParam(name="name",required = false, defaultValue="world") 
        String name, Model model)
        {
            model.addAttribute("name", name);
        return "html/index";
    }


}
