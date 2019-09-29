package com.tcf.cloud.feign.custormer.demo.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcf.cloud.common.pojo.User;
import com.tcf.cloud.feign.custormer.demo.service.callback.UserServiceErrorCallBack;

/***
 * TODO TCF Feign声明式客户端负载均衡调用接口
 * @author 71485
 *
 */
@FeignClient(value="feign-provider",fallback=UserServiceErrorCallBack.class)
public interface UserService {

	//TODO TCF 展示用户姓名
	@RequestMapping("/showUserName")
	public String showUserName(@RequestParam("userName") String userName);
	
	//TODO TCF 获取用户信息
	@RequestMapping("/loadUserInfo")
	public Map loadUserInfo(User user);
	
	//TODO TCF 根据年龄获取用户信息
	@RequestMapping("/loadByAge")
	public User loadByAge(@RequestParam("age") Integer age);
	
}
