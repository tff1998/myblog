package top.tangff.service;

import top.tangff.common.utils.BlogResult;
import top.tangff.pojo.ArticleCat;

public interface ArticleCatService {
	BlogResult getAllArtiCat();
	void addArtiCat(ArticleCat articleCat);
	BlogResult getArtCatByParentId(Long parentId);
}
