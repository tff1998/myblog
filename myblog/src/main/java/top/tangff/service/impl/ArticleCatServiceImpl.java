package top.tangff.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.tangff.common.utils.BlogResult;
import top.tangff.mapper.ArticleCatMapper;
import top.tangff.pojo.ArticleCat;
import top.tangff.service.ArticleCatService;
@Service
public class ArticleCatServiceImpl implements ArticleCatService {
	@Autowired
	ArticleCatMapper mapper;
	@Override
	public BlogResult getAllArtiCat() {
		// TODO Auto-generated method stub
		List<ArticleCat> artiCat = null;
		try {
			artiCat = mapper.getAllArtiCat();
		} catch (Exception e) {
			e.printStackTrace();
			return new BlogResult(500,"fail",null);
		}
		return BlogResult.ok(artiCat);
	}
	@Override
	public void addArtiCat(ArticleCat articleCat) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BlogResult getArtCatByParentId(Long parentId) {
		List<ArticleCat> artiCatList = null;
		try {
			artiCatList = mapper.getArtCatByParentId(parentId);
		} catch (Exception e) {
			e.printStackTrace();
			return new BlogResult(500,"fail",null);
		}
		return BlogResult.ok(artiCatList);
	}
}
