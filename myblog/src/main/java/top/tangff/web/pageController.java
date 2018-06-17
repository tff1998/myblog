package top.tangff.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import top.tangff.pojo.User;

@Controller
public class pageController {
/*	@RequestMapping("/{pagepath}")
	public String showPage(@PathVariable("pagepath") String pagepath, HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null) {
			User user2 = new User();
			user2.setName("admin");
			user2.setId("admin");
			user2.setCreated(new Date());
			session.setAttribute("user", user2);
		}
		return pagepath;
	}
	@RequestMapping("/{pagepath}/{pagepath2}")
	public String showPage2(@PathVariable("pagepath") String pagepath,@PathVariable("pagepath2") String pagepath2) {
		System.out.println(pagepath+"/"+pagepath2);
		return pagepath+"/"+pagepath2;
	}*/
}
