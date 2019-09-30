package cn.dustdawn.controller;

import cn.dustdawn.entry.Student;
import cn.dustdawn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dustdawn
 * @date 2019/9/30 8:46
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/stu")
    @ResponseBody
    public String insert() {
        System.out.println("hello");
        Student student = studentService.selectByPrimaryKey("202160201");

        return student.toString();
    }
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    public static void main(String[] args) {
        System.out.println("哈哈哈");
    }
}
