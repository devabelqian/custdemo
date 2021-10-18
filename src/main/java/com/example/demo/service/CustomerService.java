package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.orm.dao.CutomerDao;
import com.example.demo.orm.domain.CutomerDomain;

@Service("customerService")
public class CustomerService {

	@Resource
	private CutomerDao cutomerDao;

	public String checkIsMemeber(long mobile) {

		CutomerDomain domain = this.cutomerDao.findById(mobile).get();
		if (domain != null) {
			return domain.getName();
		}

		return null;
	}
	
	/// 查询所有的数据
	public List<CutomerDomain> getAllCustomers() {
		return cutomerDao.findAll();
	}

}
