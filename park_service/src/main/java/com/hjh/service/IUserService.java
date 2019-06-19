package com.hjh.service;

import com.hjh.dao.pojo.Merchant;
import org.springframework.stereotype.Service;

public interface IUserService {
    void register(Merchant merchant) throws Exception;
}
