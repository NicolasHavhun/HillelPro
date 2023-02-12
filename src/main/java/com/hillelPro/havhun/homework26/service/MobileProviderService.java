package com.hillelPro.havhun.homework26.service;

import com.hillelPro.havhun.homework26.dao.MobileProviderDao;
import com.hillelPro.havhun.homework26.entity.MobileProvider;

public class MobileProviderService {
   MobileProviderDao mobileProviderDao = new MobileProviderDao();
   public  void save (MobileProvider mobileProvider){
       mobileProviderDao.save(mobileProvider);
   }
}
