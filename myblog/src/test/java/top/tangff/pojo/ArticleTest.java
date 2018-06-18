package top.tangff.pojo;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import top.tangff.BaseTest;
import top.tangff.common.pojo.ArticleVo;
import top.tangff.common.utils.JsonUtils;
import top.tangff.service.ArticleService;
//import top.tangff.pojo.Article;

public class ArticleTest extends BaseTest{
	@Autowired
	ArticleService service;
	@Test
	@Rollback(false)
	public void addArticleTest() {
		Article article = new Article();
		article.setTitle("try…catch的执行顺序");
		article.setCreated(new Date());
		article.setUseId("admin");
		article.setCid(3L);
		String content = "1、finally块一定会执行，无论是否try…catch。\r\n" + 
				"2、finally前有return，会先执行return语句，并保存下来，再执行finally块，最后return。\r\n" + 
				"3、finally前有return、finally块中也有return，先执行前面的return，保存下来，再执行finally的return，覆盖之前的结果，并返回。";
		article.setContent(content);
		for (int i = 0; i < 20; i++) {
			service.addArticle(article);	
		}
	}
}
