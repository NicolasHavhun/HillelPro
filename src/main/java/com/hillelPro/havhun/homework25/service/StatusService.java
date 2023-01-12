package com.hillelPro.havhun.homework25.service;

import com.hillelPro.havhun.homework25.dao.StatusDao;
import com.hillelPro.havhun.homework25.model.Status;

public class StatusService {
    private final StatusDao statusDao = new StatusDao();

    public void save(Status status) {
        if (status == null) {
            System.out.println("status is null");
        }
        statusDao.save(status);
    }

    public void update(Status status) {
        if (status == null) {
            System.out.println("status is null");
        }
        statusDao.update(status);
    }

    public Status getById(int id) {
        Status status = statusDao.getById(id);

        return status;
    }

    public void delete(Status status) {
        if (status == null) {
            System.out.println("status is null");
        }
        statusDao.delete(status);
    }
}
