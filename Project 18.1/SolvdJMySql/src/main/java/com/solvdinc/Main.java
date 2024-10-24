package com.solvdinc;

import com.solvdinc.dao.mybatis.StudentDAO;
import com.solvdinc.model.Student;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {



        StudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getEntityById(2);
        System.out.println(student);
    }




}
