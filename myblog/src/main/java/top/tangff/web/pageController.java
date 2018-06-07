package top.tangff.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
	@RequestMapping("/{pagepath}")
	public String showPage(@PathVariable("pagepath") String pagepath) {
		return pagepath;
	}
}
