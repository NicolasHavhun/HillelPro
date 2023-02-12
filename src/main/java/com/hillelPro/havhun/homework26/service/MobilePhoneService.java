package com.hillelPro.havhun.homework26.service;

import com.hillelPro.havhun.homework26.dao.MobilePhoneDao;
import com.hillelPro.havhun.homework26.entity.MobilePhoneNumber;

public class MobilePhoneService {
    private MobilePhoneDao mobilePhoneDao = new MobilePhoneDao();
    public void save(MobilePhoneNumber mobilePhoneNumber){
        mobilePhoneDao.save(mobilePhoneNumber);
    }
}
