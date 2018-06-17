package top.tangff.pojo;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

import top.tangff.common.pojo.dto.ArticleCatDto;
import top.tangff.common.utils.JsonUtils;
import top.tangff.pojo.ArticleCat;

public class ArticleCatDtoTest {
	@Test
	public void getArticleCatDtoTest() throws CloneNotSupportedException {
		ArticleCatDto articleCatDto = new ArticleCatDto();
		ArrayList arrayList = new ArrayList<ArticleCatDto>();
		articleCatDto.setId(1L);
		articleCatDto.setCode("javaxiangguan");
		articleCatDto.setName("Java相关");
		articleCatDto.setUrl("www.sina.com");
		//创建分类实体
		ArticleCat articleCat = new ArticleCat();
		articleCat.setUrl("www.baidu.com");
		articleCat.setId(2L);
		articleCat.setIs_parent(false);
		articleCat.setName("Java框架");
		articleCat.setCode("javakuanjia");
		HashSet<ArticleCat> hashSet = new HashSet<ArticleCat>();
		ArticleCat articleCat2 = (ArticleCat) articleCat.clone();
		ArticleCat articleCat3 = (ArticleCat) articleCat.clone();
		hashSet.add(articleCat);
		hashSet.add(articleCat2);
		hashSet.add(articleCat3);
		articleCatDto.setChilren(hashSet);
		
		arrayList.add(articleCatDto);
		arrayList.add(articleCatDto);
		arrayList.add(articleCatDto);
		
		System.out.println(JsonUtils.objectToJson(arrayList));
	}
}
