package top.tangff.pojo;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import top.tangff.common.pojo.ArticleVo;
import top.tangff.common.utils.JsonUtils;
//import top.tangff.pojo.Article;

public class ArticleTest {
	@Test
	public void getJson() {
		ArticleVo article = new ArticleVo();
		article.setArticleCatName("Java");
		article.setUpdated(new Date());
		article.setTitle("try…catch的执行顺序");
		article.setCreated(new Date());
		article.setUseId("userId");
		article.setUseName("用户名");
		String content = "1、finally块一定会执行，无论是否try…catch。\r\n" + 
				"2、finally前有return，会先执行return语句，并保存下来，再执行finally块，最后return。\r\n" + 
				"3、finally前有return、finally块中也有return，先执行前面的return，保存下来，再执行finally的return，覆盖之前的结果，并返回。";
		content = content.substring(0, 100);
		article.setContent(content);
		ArrayList<ArticleVo> arrayList = new ArrayList<ArticleVo>();
		arrayList.add(article);
		arrayList.add(article);
		System.out.println(JsonUtils.objectToJson(arrayList));
	}
}
