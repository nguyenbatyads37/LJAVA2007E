package t3h.ljava2007a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(name = "/home", method = RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
}
