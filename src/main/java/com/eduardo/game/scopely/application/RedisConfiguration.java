package com.eduardo.game.scopely.application;

import com.eduardo.game.scopely.domain.PlayerRepository;
import com.eduardo.game.scopely.infrastructure.PlayerRedisRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {

  @Bean
  PlayerRepository playerRepository(PlayerRedisRepository playerRedisRepository) {
    return  playerRedisRepository;
  }

  @Bean
  public RedisTemplate<String, Object> redisTemplate() {
    RedisTemplate<String, Object> template = new RedisTemplate<>();
    template.setConnectionFactory(jedisConnectionFactory());
    return template;
  }

  @Bean
  JedisConnectionFactory jedisConnectionFactory() {
    JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
    jedisConFactory.setHostName("localhost");
    jedisConFactory.setPort(6379);
    return jedisConFactory;
  }
}
