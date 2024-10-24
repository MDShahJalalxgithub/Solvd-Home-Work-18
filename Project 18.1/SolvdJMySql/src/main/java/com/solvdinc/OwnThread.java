package com.solvdinc;

import com.solvdinc.dao.jdbc.StudentDao;

public class OwnThread extends Thread{

    @Override
    public void run() {
        StudentDao studentDao = new StudentDao();
        studentDao.getEntities();
    }
}
