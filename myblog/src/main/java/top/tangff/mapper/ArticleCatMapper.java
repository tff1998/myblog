package top.tangff.mapper;

import java.util.List;

import top.tangff.pojo.ArticleCat;

public interface ArticleCatMapper {
	List<ArticleCat> getAllArtiCat();
	void addArtiCat(ArticleCat articleCat);
	List<ArticleCat> getArtCatByParentId(Long parentId);
}
