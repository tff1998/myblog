package top.tangff.web;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class pageController {
	@RequestMapping("/index")
	public String showPage() {
		return "index";
	}
	/*
	@RequestMapping("/{pagepath}/{pagepath2}")
	public String showPage2(@PathVariable("pagepath") String pagepath,@PathVariable("pagepath2") String pagepath2) {
		System.out.println(pagepath+"/"+pagepath2);
		return pagepath+"/"+pagepath2;
	}*/
}
