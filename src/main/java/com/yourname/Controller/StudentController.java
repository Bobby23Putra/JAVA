package com.yourname.Controller;

import com.yourname.Dao.StudentDao;
import com.yourname.Entity.Student;
import com.yourname.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController
{
    @Autowired
    private StudentService studentService;

   /* @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllstudents(){
        return studentService.getAllstudents();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Student getStudentById (@PathVariable("id") int id)
    {
        return studentService.getStudentsById(id);
    }
    @RequestMapping(value ="/halo/{id}",method = RequestMethod.GET)
    public ResponseEntity deleteStudentByid (@PathVariable("id") int id)
    {
        studentService.DeleteStudentByid(id);

        return new ResponseEntity("Data Telah di hapus", HttpStatus.OK) ;
    }
    */
   @RequestMapping(value ="/halo/{name}",method = RequestMethod.GET)
   public ResponseEntity findByName(@PathVariable("name")String name)
   {
       return new ResponseEntity(studentService.getByName(name),HttpStatus.OK);
   }
}
