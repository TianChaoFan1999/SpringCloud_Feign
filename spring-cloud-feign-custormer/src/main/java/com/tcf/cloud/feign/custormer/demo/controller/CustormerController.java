package com.tcf.cloud.feign.custormer.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcf.cloud.common.pojo.User;
import com.tcf.cloud.feign.custormer.demo.service.UserService;

/***
 * TODO TCF 视图-控制器
 * @author 71485
 *
 */
@RestController
@RequestMapping("/")
public class CustormerController {

	//TODO TCF 用户服务
	@Autowired(required=false)
	private UserService userService;
	
	@RequestMapping("/showName.do")
	public String showUserName()
	{
		String userName=userService.showUserName("张三");
		
		return userName;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/showMap.do")
	public Map loadUserInfo()
	{
		Map<String,Object> dataMap=new HashMap<String,Object>();
		
		dataMap=userService.loadUserInfo(new User());
		
		return dataMap;
	}
	
	@RequestMapping("/showUser.do")
	public User loadByAge()
	{
		User user=userService.loadByAge(18);
		
		return user;
	}
}
