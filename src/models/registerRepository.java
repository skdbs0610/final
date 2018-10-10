package models;
//DAO랑 같은 개념임

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class registerRepository {
	
	@Autowired
	SqlSessionFactory factory;
	
	@Autowired
	SqlSessionTemplate template;

	
	public Integer getEmployeeSeq(){
		SqlSession session = factory.openSession();
		try {
			return session.selectOne("employee.getEmployeeSeq");
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	
	public List<Map> getDept(){
		SqlSession session = factory.openSession();
		try {
			return session.selectList("employee.getDept");
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
	}
	/*
	public List<Map> getAllWithOpinionCount(){
		return template.selectList("issue.getAllWithOpinionCount");
	}*/
	
	
	
}


