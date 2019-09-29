package com.tcf.cloud.feign.custormer.demo.service.callback;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.tcf.cloud.common.pojo.User;
import com.tcf.cloud.feign.custormer.demo.service.UserService;

/***
 * TODO TCF Feign声明式客户端负载均衡调用接口异常回调
 * @author 71485
 *
 */
@Component
public class UserServiceErrorCallBack implements UserService{

	@Override
	public String showUserName(String userName) 
	{
		return "errorUserName";
	}

	@Override
	public Map loadUserInfo(User user) 
	{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("success",false);
		map.put("errorMessage","error");
		
		return map;
	}

	@Override
	public User loadByAge(Integer age) 
	{
		System.out.println("error");
		
		User user=new User();
		user.setUserName("Error");
		
		return user;
	}
	
}
