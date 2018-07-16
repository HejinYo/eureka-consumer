package cn.hejinyo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : HejinYo   hejinyo@gmail.com
 * @date :  2018/7/16 21:58
 */
@FeignClient("jelly")
public interface JellyService {

    @RequestMapping("/wechat/findOne")
    String findOne();
}
