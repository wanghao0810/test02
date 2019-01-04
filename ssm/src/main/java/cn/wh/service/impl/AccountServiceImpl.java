package cn.wh.service.impl;

import cn.wh.dao.AccountDao;
import cn.wh.domain.Account;
import cn.wh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount() {

    }
}
