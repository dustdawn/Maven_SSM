package cn.dustdawn.service.Impl;

import cn.dustdawn.dao.StudentMapper;
import cn.dustdawn.entry.Student;
import cn.dustdawn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dustdawn
 * @date 2019/9/30 13:27
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(String sno) {
        return 0;
    }

    @Override
    public int insert(Student record) {
        return 0;
    }

    @Override
    public int insertSelective(Student record) {
        return 0;
    }

    @Override
    public Student selectByPrimaryKey(String sno) {
        return studentMapper.selectByPrimaryKey(sno);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return 0;
    }
}
