package com.solvdinc.dao.mybatis;

import com.solvdinc.MyBatisConf;
import com.solvdinc.dao.IStudentDao;
import com.solvdinc.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentDAO implements IStudentDao {
    static SqlSessionFactory sqlSessionFactory
            = MyBatisConf.buldFactoryXml();

    @Override
    public Student getEntityById(int index) {
        //Interface
//        try(SqlSession session = sqlSessionFactory.openSession()) {
//            Student student = session.selectOne("com.solvd.dao.IStudentDao.getEntityById", index);
//            return student;
//        }

        //XML
        try(SqlSession session = sqlSessionFactory.openSession()) {
            Student student = session.selectOne("StudentMapper.getEntityById", index);
            return student;
        }
    }

    @Override
    public List<Student> getEntities() {
        return null;
    }

    @Override
    public void insert(Student student) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(int index, Student student) {

    }
}
