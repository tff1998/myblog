package top.tangff.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.tangff.common.utils.BlogResult;
import top.tangff.pojo.Article;
import top.tangff.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	@RequestMapping("article/addArticle")
	@ResponseBody
	public BlogResult addArticle(Article article) {
		return null;
	}
	/**
	 * 查看一条博文
	 */
	@RequestMapping("article/showOneArtilce")
	public String showOneArtilce() {
		return "article/showOneArticle";
	}	
}
