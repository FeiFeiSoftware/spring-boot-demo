package com.bob.springdemo.mybatis.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bob.springdemo.mybatis.Student;

/**
 * @author bob.xiang
 * @Desc Spring Boot与MyBatis 集成 采用xml的方式
 *
 */
@RestController
@RequestMapping("/mybatis/xml")
public class ControllerTestForXML {
	protected static Logger logger = LoggerFactory
			.getLogger(ControllerTestForXML.class);
	@Autowired
	private StudentMapper1 studentMapper;
	@Autowired
	private StudentDao studentDao;

	@RequestMapping("/getStudent")
	public Student getStudent(int id) {
		logger.debug("接收到的参数id={}", id);
		return studentMapper.selectById(id);

	}

	@RequestMapping("/get")
	public Student get(int id) {
		logger.debug("接收到的参数id={}", id);
		return studentDao.selectStudent(id);
	}
}
