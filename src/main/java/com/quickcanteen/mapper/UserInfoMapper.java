package com.quickcanteen.mapper;

import com.quickcanteen.model.UserInfo;
import org.apache.ibatis.annotations.*;

public interface UserInfoMapper {
    @Delete({
            "delete from user_info",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
            "insert into user_info (user_id, account_number, ",
            "user_password, head_portrait, ",
            "nick_name, real_name, ",
            "telephone, entrance_year, ",
            "college_name, university_name, ",
            "is_admin, points, ",
            "update_time)",
            "values (#{userId,jdbcType=INTEGER}, #{accountNumber,jdbcType=VARCHAR}, ",
            "#{userPassword,jdbcType=VARCHAR}, #{headPortrait,jdbcType=VARCHAR}, ",
            "#{nickName,jdbcType=VARCHAR}, #{realName,jdbcType=VARCHAR}, ",
            "#{telephone,jdbcType=VARCHAR}, #{entranceYear,jdbcType=DATE}, ",
            "#{collegeName,jdbcType=VARCHAR}, #{universityName,jdbcType=VARCHAR}, ",
            "#{isAdmin,jdbcType=INTEGER}, #{points,jdbcType=INTEGER}, ",
            "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    @Select({
            "select",
            "user_id, account_number, user_password, head_portrait, nick_name, real_name, ",
            "telephone, entrance_year, college_name, university_name, is_admin, points, update_time",
            "from user_info",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo record);

    @Update({
            "update user_info",
            "set account_number = #{accountNumber,jdbcType=VARCHAR},",
            "user_password = #{userPassword,jdbcType=VARCHAR},",
            "head_portrait = #{headPortrait,jdbcType=VARCHAR},",
            "nick_name = #{nickName,jdbcType=VARCHAR},",
            "real_name = #{realName,jdbcType=VARCHAR},",
            "telephone = #{telephone,jdbcType=VARCHAR},",
            "entrance_year = #{entranceYear,jdbcType=DATE},",
            "college_name = #{collegeName,jdbcType=VARCHAR},",
            "university_name = #{universityName,jdbcType=VARCHAR},",
            "is_admin = #{isAdmin,jdbcType=INTEGER},",
            "points = #{points,jdbcType=INTEGER},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserInfo record);

    @Select({
            "select",
            "user_id, account_number, user_password, head_portrait, nick_name, real_name, ",
            "telephone, entrance_year, college_name, university_name, is_admin, points, update_time",
            "from user_info",
            "where account_number = #{accountNumber}"
    })
    @ResultMap("BaseResultMap")
    UserInfo selectByAccountNumber(@Param("accountNumber") String accountNumber);

}