package top.tangff.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import top.tangff.common.utils.JPinyinUtils;
import top.tangff.pojo.ArticleCat;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations= {"classpath:spring/applicationContext-*.xml"}) 
@Transactional
public class ArticleCatMapperTest {
	@Autowired
	ArticleCatMapper mapper;
	@Test
	@Rollback(false)
	public void addArticleCat() {
		ArticleCat articleCat = new ArticleCat();
		articleCat.setName("其它");
		articleCat.setCode(JPinyinUtils.changeToTonePinYin(articleCat.getName()));
		articleCat.setIs_parent(true);
		mapper.addArtiCat(articleCat);
	}
	
	@Test
	@Rollback(false)
	public void addArticleCat1() {
		ArticleCat articleCat = new ArticleCat();
		articleCat.setName("人生记录");
		articleCat.setParent_id(22L);
		articleCat.setCode(JPinyinUtils.changeToTonePinYin(articleCat.getName()));
		articleCat.setIs_parent(false);
		mapper.addArtiCat(articleCat);
	}
}
