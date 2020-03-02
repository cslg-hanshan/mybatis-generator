package com.h2sj.mybatis.generator.mapper;

import com.h2sj.mybatis.generator.entity.RoleToPermission;
import com.h2sj.mybatis.generator.entity.RoleToPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface RoleToPermissionMapper {
    long countByExample(RoleToPermissionExample example);

    int deleteByExample(RoleToPermissionExample example);

    @Insert({
        "insert into db_role_to_permission (r_id, p_id)",
        "values (#{rId,jdbcType=BIGINT}, #{pId,jdbcType=BIGINT})"
    })
    int insert(RoleToPermission record);

    int insertSelective(RoleToPermission record);

    List<RoleToPermission> selectByExample(RoleToPermissionExample example);

    int updateByExampleSelective(@Param("record") RoleToPermission record, @Param("example") RoleToPermissionExample example);

    int updateByExample(@Param("record") RoleToPermission record, @Param("example") RoleToPermissionExample example);
}