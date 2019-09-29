package com.tcf.cloud.feign.provider.demo.service;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcf.cloud.common.pojo.User;

/***
 * TODO TCF 服务提供者：用户服务
 * @author 71485
 *
 */
public interface UserService {

	//TODO TCF 展示用户姓名
	public String showUserName(@RequestParam("userName") String userName);
	
	//TODO TCF 获取用户信息
	public Map loadUserInfo(User user);
	
	//TODO TCF 根据年龄获取用户信息
	public User loadByAge(@RequestParam("age") Integer age);
	
	//TODO TCF 加载用户名
	public String loadUserName(@PathVariable("userName") String userName);
	
	//TODO TCF Hystrix豪猪仪表盘熔断监控
	public String testHystrixDashBoard();
	
}
