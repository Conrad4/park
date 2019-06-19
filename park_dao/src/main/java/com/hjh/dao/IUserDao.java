package com.hjh.dao;

import com.hjh.dao.pojo.Merchant;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {



    @Insert("insert into merchant value(#{merName},#{parkLocation},#{parkTotal},#{charge}")
    public void register(Merchant merchant);
}
