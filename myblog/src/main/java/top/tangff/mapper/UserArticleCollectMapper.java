package top.tangff.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.tangff.pojo.UserArticleCollectExample;
import top.tangff.pojo.UserArticleCollectKey;

public interface UserArticleCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int countByExample(UserArticleCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int deleteByExample(UserArticleCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int deleteByPrimaryKey(UserArticleCollectKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int insert(UserArticleCollectKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int insertSelective(UserArticleCollectKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    List<UserArticleCollectKey> selectByExample(UserArticleCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserArticleCollectKey record, @Param("example") UserArticleCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_article_collect
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int updateByExample(@Param("record") UserArticleCollectKey record, @Param("example") UserArticleCollectExample example);
}