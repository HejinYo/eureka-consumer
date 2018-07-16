package cn.hejinyo.consumer.controller;

import cn.hejinyo.consumer.service.JellyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : HejinYo   hejinyo@gmail.com
 * @date :  2018/4/18 23:30
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private JellyService jellyService;

    @GetMapping("/joke1")
    public String joke1() {
        return restTemplate.getForEntity("http://jelly/wechat/findOne", String.class).getBody();
    }

    @GetMapping("/joke2")
    public String joke2() {
        return jellyService.findOne();
    }


}
