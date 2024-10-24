package com.solvdinc.service;

import com.solvdinc.dao.IStudentDao;
import com.solvdinc.dao.jdbc.StudentDao;
import com.solvdinc.dao.mybatis.StudentDAO;

import java.util.ResourceBundle;

public class StudentService {

    public static IStudentDao getStudentSelect() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        if  (resourceBundle.getString("type").equals("jdbc")){
            return new StudentDao();
        } else {
            return new StudentDAO();
        }
    }
}
