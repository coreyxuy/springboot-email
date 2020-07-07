package com.itcorey;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.itcorey.pojo.Notice;
import com.itcorey.pojo.User;
import com.itcorey.pojo.UsersDo;
import com.itcorey.service.NoticeService;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {

    @Autowired
    private NoticeService noticeService;


    @Resource
    private RedisTemplate<String,User> redisTemplate;


    @Test
    public void  noticeTest(){
        Notice notice = noticeService.queryUser(6);
        System.out.println(notice);
    }


    @Test
    public void  TestEasyExcel() throws FileNotFoundException {


    }


    @Test
    public void redisTemplateTest(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        System.out.println("corey"+redisTemplate.opsForValue().get("corey"));
    }



	@Test
	public void contextLoads() {
        System.out.println("success!");
    }



}
