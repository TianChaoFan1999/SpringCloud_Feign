package com.tcf.cloud.feign.provider.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcf.cloud.common.pojo.User;
import com.tcf.cloud.feign.provider.demo.service.UserService;

/***
 * TODO TCF 服务提供层
 * @author 71485
 *
 */
@RestController
@RequestMapping("/")
public class UserServiceImpl implements UserService{

	//TODO TCF 提供服务方法
	@RequestMapping("/showUserName")
	public String showUserName(@RequestParam("userName") String userName)
	{
		System.out.println(userName+"1");
		
		return userName+"1";
	}
	
	@RequestMapping("/loadUserInfo")
	public Map loadUserInfo(User user)
	{
		System.out.println(user!=null?user.toString():"");
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("success",true);
		
		return map;
	}
	
	@RequestMapping("/loadByAge")
	public User loadByAge(@RequestParam("age") Integer age)
	{
		System.out.println(age);
		
		return new User();
	}
	
	@RequestMapping("/selectByUserName/{userName}")
	public String loadUserName(@RequestBody @PathVariable("userName") String userName) 
	{
		System.out.println(userName+"1");
		
		return userName+"1";
	}

	@RequestMapping("/test")
	public String testHystrixDashBoard() 
	{
		System.out.println("8888");
		
		return "";
	}

}
