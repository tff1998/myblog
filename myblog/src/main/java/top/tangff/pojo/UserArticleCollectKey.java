package top.tangff.pojo;

public class UserArticleCollectKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_article_collect.id
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_article_collect.art_id
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    private Long artId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_article_collect.id
     *
     * @return the value of user_article_collect.id
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_article_collect.id
     *
     * @param id the value for user_article_collect.id
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_article_collect.art_id
     *
     * @return the value of user_article_collect.art_id
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    public Long getArtId() {
        return artId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_article_collect.art_id
     *
     * @param artId the value for user_article_collect.art_id
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    public void setArtId(Long artId) {
        this.artId = artId;
    }
}