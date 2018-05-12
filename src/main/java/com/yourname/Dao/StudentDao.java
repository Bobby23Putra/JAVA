package com.yourname.Dao;

import com.yourname.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>
{
      Student findByName(String name);
    /*private static Map<Integer,Student> students;
    static
    {
        students = new HashMap<Integer, Student>()
        {
            {
                put(1, new Student(1, "bobby", "Computer"));
                put(2, new Student(2, "Tristania", "Computer Science"));
                put(3, new Student(3, "Rizaq", "Computer Science"));
            }
        };
    }

    public String Hallo(int id)
    {
        return students.get(id).getName();
    }
    public Collection<Student> getAllstudents()
    {
        return this.students.values();
    }
    public Student getStudentsById(int id)
    {
        return this.students.get(id);
    }
    public void DeleteStudentByid (int id){this.students.remove(id);}
    */
}
