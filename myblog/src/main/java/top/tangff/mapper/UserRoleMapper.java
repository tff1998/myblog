package top.tangff.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.tangff.pojo.UserRoleExample;
import top.tangff.pojo.UserRoleKey;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int countByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int deleteByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int deleteByPrimaryKey(UserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int insert(UserRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int insertSelective(UserRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    List<UserRoleKey> selectByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Thu Jun 07 21:37:41 CST 2018
     */
    int updateByExample(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);
}