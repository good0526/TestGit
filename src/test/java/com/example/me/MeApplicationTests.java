package com.example.me;

import com.example.me.dao.UserInfoMapper;
import com.example.me.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MeApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("登录失败!");
	}

	/*public static void main(String[] args) {
		System.out.println("登录成功！");
	}*/

}

