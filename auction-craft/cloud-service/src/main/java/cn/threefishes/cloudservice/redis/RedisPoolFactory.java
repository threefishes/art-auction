package cn.threefishes.cloudservice.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @date 2019-9-27 16:21:11
 */
@Service
public class RedisPoolFactory {

    @Autowired
    RedisConfig redisConfig;
    /**
     * redis连接池的一些配置
     * @return
     */
    @Bean
    public JedisPool JedisPoolFactory(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(redisConfig.getMaxIdle());
        poolConfig.setMaxTotal(redisConfig.getMaxActive());
        poolConfig.setMaxWaitMillis((redisConfig.getMaxWait()));

        JedisPool jedisPool = new JedisPool(poolConfig, redisConfig.getHost(),redisConfig.getPort(),redisConfig.getTimeout());
        return jedisPool;
    }

}
