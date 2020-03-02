package com.h2sj.mybatis.generator.mapper;

import com.h2sj.mybatis.generator.entity.Role;
import com.h2sj.mybatis.generator.entity.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    @Delete({
        "delete from db_role",
        "where r_id = #{rId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long rId);

    @Insert({
        "insert into db_role (r_id, r_name)",
        "values (#{rId,jdbcType=BIGINT}, #{rName,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExampleWithRowbounds(RoleExample example, RowBounds rowBounds);

    List<Role> selectByExample(RoleExample example);

    @Select({
        "select",
        "r_id, r_name",
        "from db_role",
        "where r_id = #{rId,jdbcType=BIGINT}"
    })
    @ResultMap("com.h2sj.mybatis.generator.mapper.RoleMapper.BaseResultMap")
    Role selectByPrimaryKey(Long rId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update db_role",
        "set r_name = #{rName,jdbcType=VARCHAR}",
        "where r_id = #{rId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Role record);
}