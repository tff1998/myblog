package top.tangff.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import top.tangff.common.utils.BlogResult;
import top.tangff.pojo.ArticleCat;
import top.tangff.service.ArticleCatService;

@Controller
public class ArticleCatController {
	@Autowired
	ArticleCatService service;
	//动态获得所有博文类目通过Ajax
	@RequestMapping("articleCat/getAllArtiCat")
	@ResponseBody
	public BlogResult getAllArtiCat() {
		BlogResult allArtiCat = service.getAllArtiCat();
		return allArtiCat;
	}
	//增加一个类目
	@RequestMapping("articleCat/addArtiCat")
	@ResponseBody
	public BlogResult addArtiCat(ArticleCat articleCat) {
		service.addArtiCat(articleCat);
		return BlogResult.ok(null);
	}
	
	//获得某一级目录根据父目录Id，默认值为0（即查出所有的顶级目录）
	@RequestMapping("articleCat/getArtCatByParentId")
	@ResponseBody
	public BlogResult getArtCatByParentId(@RequestParam(defaultValue="-1") Long parentId) {
		if(parentId == -1)parentId = null;
		BlogResult result = service.getArtCatByParentId(parentId);
		return result;
	}
	
	
	
	//以下均作为jsp跳板
	@RequestMapping("article/writeArticle")
	public String writeArticle() {
		return "article/writeArticle";
	}
}
