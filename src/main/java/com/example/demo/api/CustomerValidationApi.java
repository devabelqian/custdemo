package com.example.demo.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.orm.domain.CutomerDomain;
import com.example.demo.service.CustomerService;
import com.mysql.cj.util.StringUtils;

@RestController
@RequestMapping("/v1/unsecurity/cust")
public class CustomerValidationApi {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/validation", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@CrossOrigin
	public String getAddress(HttpServletRequest requestServlet) {
		String mobileval = requestServlet.getParameter("mobile");
		if (StringUtils.isNullOrEmpty(mobileval)) {
			return "";
		}
		return this.customerService.checkIsMemeber(Long.parseLong(mobileval));
	}

	/// 获取地址列表
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@CrossOrigin
	public @ResponseBody List<CutomerDomain> getAllCustList(HttpServletRequest requestServlet) {
		return this.customerService.getAllCustomers();
	}

}
