package top.tangff.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import top.tangff.common.utils.ArticlePage;
import top.tangff.common.utils.BlogResult;
import top.tangff.pojo.Article;
import top.tangff.pojo.User;
import top.tangff.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	
	
	/**
	 * 写入一篇博文
	 */
	@RequestMapping("article/addArticle")
	@ResponseBody
	public String addArticle(Article article,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		article.setUseId(user.getId());
		service.addArticle(article);
		return "success";
	}
	/**
	 * 查看一条博文
	 */
	@RequestMapping("article/showOneArtilce")
	public String showOneArtilce() {
		return "article/showOneArticle";
	}	
	
	/**
	 * @param page
	 * @param cid 
	 * @return
	 */
	@RequestMapping("article/getArtilcePage")
	@ResponseBody
	public ArticlePage getArtilcePage(@RequestParam(defaultValue="1") Integer page, Long ArtilceCatId) {
		ArticlePage artilcePage = service.getArtilcePage(page, ArtilceCatId);
		return artilcePage;
	}
	
	/**
	 * @param page
	 * @return 顶部导航跳转到首页即博文列表页，并带博文类目回去
	 */
	@RequestMapping("article/redirectToHome")
	public String redirectToIndex(Model model,Integer ArtilceCatId) {
		model.addAttribute("ArtilceCatId", ArtilceCatId);
		return "home";
	}
	
	/**
	 * @param page
	 * @return 跳到写博文的jsp
	 */
	@RequestMapping("article/writeArticle")
	public String writeArticle() {
		return "article/writeArticle";
	}


}
