package com.ssm.service;

import com.ssm.mapper.StudentMapper;
import com.ssm.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ${DESCRIPTION}
 *
 * @author cly33
 * @create 2019-04-11 19:57
 */
@Service
public class StudentService {
	@Resource
	private StudentMapper studentMapper;

	public Student getUserById(int userId) {

		return studentMapper.selectByPrimaryKey(userId);
	}
}
