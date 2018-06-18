package top.tangff.service;

import top.tangff.common.utils.ArticlePage;
import top.tangff.pojo.Article;

public interface ArticleService {
	//写入一篇博文
	void addArticle(Article article);
	//得到一页博文，包括总页数
	ArticlePage getArtilcePage(Integer page, Long artilceCatId);
}
