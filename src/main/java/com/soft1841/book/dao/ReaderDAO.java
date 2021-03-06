package com.soft1841.book.dao;

import cn.hutool.db.Entity;
import com.soft1841.book.entity.Reader;

import java.sql.SQLException;
import java.util.List;

/**
 * 读者的DAO接口
 */
public interface ReaderDAO {
    /**
     * 查询所有读者信息
     * @return List<Reader>
     * @throws SQLException
     */
    List<Reader> selectReaders()throws SQLException;

    /**
     * 根据id删除实体
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteById(long id) throws SQLException;

    /**
     * 新增一个读者，返回自增主键
     * @param reader
     * @return
     * @throws SQLException
     */
    Long insertReader(Reader reader) throws SQLException;

    /**
     * 根据身份角色统计读者数量
     * @param role
     * @return
     * @throws SQLException
     */
    int countByRole(String role) throws SQLException;

    /**
     * 根据身份角色统计读者数量
     * @param department
     * @return
     * @throws SQLException
     */
    int countByDepartment(String department) throws SQLException;
}
