package com.gd.webmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
	// new를 사용하면 결합도 높아져서 안됨, 클래스는 마이 바티스가 나중에 알아서 생성
	// 스프링은 매퍼가 붙어있는 곳으로 로 먼저 들어가가 클래스를 만들고 쿼리를 이용하여 원래 dao와 같은것을 만들고 그 위에 레파지토리를 만들어
	// 미리객체를 만들어 놓음 클래스 앞에 서비스. 매퍼. 컨트롤. 컴포넌트와 같은 것들을 미리만들어 어플리케이션셋어트리뷰트와 같은 곳에 저장
	
	// 객체는 만들어 줘야 컨트롤러 쪽에서 사용 할 수 있음 - 서비스의 역할

	   @Autowired // new 를 대신해서 필요할때마다 객체를 만들어줌
	   private EmployeeMapper employeeMapper;
	   
	   public List<Employee> getEmployeeList(){
	      
	      return employeeMapper.selectEmployeeList();
      
   }
}