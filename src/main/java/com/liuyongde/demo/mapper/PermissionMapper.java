package com.liuyongde.demo.mapper;

import com.liuyongde.demo.domain.Permission;

import java.util.List;

/***
 * @创建人 lyd
 * @创建时间 2019/12/27
 * @描述
 */
public interface PermissionMapper {

    List<Permission> findAll();

    List<Permission> findByAdminUserId(int userId);
}
