package cn.wh.dao;

import cn.wh.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    /***
     * 查询所有
     */
    @Select("select * from account")
    public List<Account> findAll();
    /***
     * 添加
     */
    public void saveAccount();
}
