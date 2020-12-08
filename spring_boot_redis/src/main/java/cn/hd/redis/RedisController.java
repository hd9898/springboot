package cn.hd.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("test")
    public String test(){
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set("hd","km");
        return "ok";
    }

    @RequestMapping("getRedis")
    public String getRedis(){
        ValueOperations operations = redisTemplate.opsForValue();
       String value = (String) operations.get("hd");
        return value;
    }
}
