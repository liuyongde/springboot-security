package com.liuyongde.demo.mapper;

import com.liuyongde.demo.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/***
 * @创建人 lyd
 * @创建时间 2019/12/27
 * @描述
 */
public interface SysUserMapper {

    SysUser findByUsername(@Param("username") String username);
}
