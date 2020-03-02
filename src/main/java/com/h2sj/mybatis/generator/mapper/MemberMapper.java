package com.h2sj.mybatis.generator.mapper;

import com.h2sj.mybatis.generator.entity.Member;
import com.h2sj.mybatis.generator.entity.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    @Delete({
        "delete from db_member",
        "where m_id = #{mId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long mId);

    @Insert({
        "insert into db_member (m_id, u_password, ",
        "m_username, r_id)",
        "values (#{mId,jdbcType=BIGINT}, #{uPassword,jdbcType=VARCHAR}, ",
        "#{mUsername,jdbcType=VARCHAR}, #{rId,jdbcType=BIGINT})"
    })
    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExampleWithRowbounds(MemberExample example, RowBounds rowBounds);

    List<Member> selectByExample(MemberExample example);

    @Select({
        "select",
        "m_id, u_password, m_username, r_id",
        "from db_member",
        "where m_id = #{mId,jdbcType=BIGINT}"
    })
    @ResultMap("com.h2sj.mybatis.generator.mapper.MemberMapper.BaseResultMap")
    Member selectByPrimaryKey(Long mId);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    @Update({
        "update db_member",
        "set u_password = #{uPassword,jdbcType=VARCHAR},",
          "m_username = #{mUsername,jdbcType=VARCHAR},",
          "r_id = #{rId,jdbcType=BIGINT}",
        "where m_id = #{mId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Member record);
}