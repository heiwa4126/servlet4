package servlet4;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.ui.Model;
import java.time.LocalDateTime;

@RestController
public class Servlet4Controller {

  @Autowired
  private Test4Bean t4b;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!\n";
	}

	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public String test1() {
		return "test1!\n";
	}

	@RequestMapping("/test2")
	public Result test2() {
		return new Result("OK", "test2");
	}

  @RequestMapping(value = "/test3.xml", produces = "application/xml")
  public String test3() {
    return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<result>\n  <rc>OK</rc>\n  <msg>test3</msg>\n</result>";
  }

  @RequestMapping(value = "/test4/1.htm")
  public ModelAndView test41(ModelAndView mv) {
    mv.setViewName("test4");
    mv.addObject("msg", "<Hello> <world>!");
    mv.addObject("now", LocalDateTime.now());
    return mv;
  }
  @RequestMapping(value = "/test4/2.htm")
  public ModelAndView test42(ModelAndView mv) {
    mv.setViewName("test4");
    mv.addObject("msg", t4b.getMsg());
    mv.addObject("now", ".........");
    return mv;
  }
}
