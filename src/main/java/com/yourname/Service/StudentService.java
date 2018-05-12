package com.yourname.Service;

import com.yourname.Dao.StudentDao;
import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service

public class StudentService {
    @Autowired
    private StudentDao studentDao;

  /*  public  Student getStudentsById(int id) {
        return this.studentDao.getStudentsById(id);
    }

    public Collection<Student> getAllstudents(){
        return this.studentDao.getAllstudents();
    }

    public void DeleteStudentByid (int id){this.studentDao.DeleteStudentByid(id);}
    */
    public Student getByName(String name)
    {
        return studentDao.findByName(name);
    }
}
