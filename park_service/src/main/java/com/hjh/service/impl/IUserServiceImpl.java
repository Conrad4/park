package com.hjh.service.impl;

import com.hjh.dao.IUserDao;
import com.hjh.dao.pojo.Merchant;
import com.hjh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IUserServiceImpl implements IUserService {


    @Autowired
    private IUserDao userDao;

    @Override
    public void register(Merchant merchant) throws Exception {
         userDao.register(merchant);
    }
}
