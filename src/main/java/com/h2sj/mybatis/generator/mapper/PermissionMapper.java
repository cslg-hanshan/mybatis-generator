package com.h2sj.mybatis.generator.mapper;

import com.h2sj.mybatis.generator.entity.Permission;
import com.h2sj.mybatis.generator.entity.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface PermissionMapper {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    @Delete({
        "delete from db_permission",
        "where p_id = #{pId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long pId);

    @Insert({
        "insert into db_permission (p_id, p_description, ",
        "p_name, p_url)",
        "values (#{pId,jdbcType=BIGINT}, #{pDescription,jdbcType=VARCHAR}, ",
        "#{pName,jdbcType=VARCHAR}, #{pUrl,jdbcType=VARCHAR})"
    })
    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExampleWithRowbounds(PermissionExample example, RowBounds rowBounds);

    List<Permission> selectByExample(PermissionExample example);

    @Select({
        "select",
        "p_id, p_description, p_name, p_url",
        "from db_permission",
        "where p_id = #{pId,jdbcType=BIGINT}"
    })
    @ResultMap("com.h2sj.mybatis.generator.mapper.PermissionMapper.BaseResultMap")
    Permission selectByPrimaryKey(Long pId);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    @Update({
        "update db_permission",
        "set p_description = #{pDescription,jdbcType=VARCHAR},",
          "p_name = #{pName,jdbcType=VARCHAR},",
          "p_url = #{pUrl,jdbcType=VARCHAR}",
        "where p_id = #{pId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Permission record);
}