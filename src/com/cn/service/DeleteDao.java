package com.cn.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.domain.Customer;
import com.cn.domain.Employee;
import com.cn.domain.Merchandise;

@Service
public class DeleteDao {
	@Autowired
	public SqlSessionTemplate sqlSession;
	
	//�����ݿ⽻����ʵ�ָ��ݱ��ɾ��Ա����Ϣ
	public boolean deleteemp(Employee emp){
		boolean flag = false;
		int ret = sqlSession.delete("delemp",emp);
		if(ret>0){
			flag = true;
		}      
		return flag;
	}
	
	//�����ݿ⽻����ʵ�ָ��ݱ��ɾ���ͻ���Ϣ
	public boolean deletecus(Customer cus){
		boolean flag = false;
		int ret = sqlSession.delete("delcus",cus);
		if(ret>0){
			flag = true;
		}
		return flag;
	}
	
	//�����ݿ⽻����ʵ�ָ��ݱ��ɾ����Ʒ��Ϣ
	public boolean deletegoods(Merchandise mer){
		boolean flag = false;
		int ret = sqlSession.delete("delgoods",mer);
		if(ret>0){
			flag = true;
		}
		return flag;
	}

}
