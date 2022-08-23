package com.gd.webmvc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
	//@Select  이렇게 선언 후 커리를 만들수 있지만 양이 많으면 더러워짐 - xml로 만듬 (인터페이스와 한 쌍)
	//마이바티스가 스스로 클래스를 만듬  - 서비스에 사용할 객체를 만들기 위해서 쿼리에 더해서 코드를 작성
	List<Employee> selectEmployeeList();
	
}
