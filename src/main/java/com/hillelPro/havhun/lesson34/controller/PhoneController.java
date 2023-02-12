package com.hillelPro.havhun.lesson34.controller;

import com.hillelPro.havhun.lesson34.entity.Phone;
import com.hillelPro.havhun.lesson34.service.PhoneService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PhoneController {
        PhoneService phoneService = new PhoneService();
        private Logger logger = Logger.getLogger(PhoneController.class.getName());
    public  void checkPhoneNumber(Phone phone){
        logger.log(Level.INFO, phone.toString());
        phoneService.checkPhone(phone.getNumber());


    }
}
