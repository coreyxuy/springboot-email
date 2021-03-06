package com.itcorey.controller;

import com.itcorey.pojo.Notice;
import com.itcorey.service.NoticeService;
import com.itcorey.utils.Global;
import com.itcorey.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 通知
 * @Author: xuyp
 * @Date: 2019/4/30 14:24
 * @Modified By:
 */
@RestController
@Api(tags = "通知类")
@RequestMapping("/corey")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * @return
     */
    @RequestMapping(value = "/babyList",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("通知列表")
    public R babyList() {
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("Global",Global.getValue("sms_apihost"));
        resultMap.put("redis_test",redisTemplate.opsForValue().get("REDIS_CONFIG_TEST"));
        return R.ok().data("resultMap",resultMap).message("通知列表");
    }


    /**
     * @return
     */
    @RequestMapping(value = "/notice",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("根据id查询同志信息")
    public R queryNote() {
        Integer id = 6;
        Notice notice = noticeService.queryUser(id);
        System.out.println("==="+notice.toString());
        return R.ok().data("notice",notice).message("查询成功");
    }
}
