package com.han.dao.redis;

import org.apache.log4j.Logger;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * author:hanpeiyi
 * Date:2019/2/21
 * Time:15:52
 */
public class RedisCache implements Cache {
    private final Logger LOGGER = Logger.getLogger(RedisCache.class);
    private RedisTemplate<String, Object> redisTemplates;
    private static final String KEY_PREFIX_VALUE = "han:protice:";

    public RedisTemplate<String, Object> getRedisTemplates() {
        return redisTemplates;
    }

    public void setRedisTemplates(RedisTemplate<String, Object> redisTemplates) {
        this.redisTemplates = redisTemplates;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Object getNativeCache() {
        return null;
    }

    @Override
    public ValueWrapper get(Object o) {
        final String k = KEY_PREFIX_VALUE + o.toString();
        ValueOperations<String, Object> valueOps = redisTemplates.opsForValue();
        Object object;
        if (k.contains("*")) {
            Set<String> keys = redisTemplates.keys(k);
            object = valueOps.multiGet(keys);
        } else {
            object = valueOps.get(k);
        }
        if (object != null) {
            return new SimpleValueWrapper(object);
        } else {
            return null;
        }
    }

    @Override
    public <T> T get(Object o, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> T get(Object o, Callable<T> callable) {
        return null;
    }

    @Override
    public void put(Object o, Object o1) {
        final String k = KEY_PREFIX_VALUE + o.toString();
        if (o1 != null) {
            ValueOperations<String ,Object> valueOperations = redisTemplates.opsForValue();
            valueOperations.set(k,o1);
            redisTemplates.expire(k,3, TimeUnit.DAYS);

        }

    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {
        return null;
    }

    @Override
    public void evict(Object o) {
        final String k = KEY_PREFIX_VALUE + o.toString();
        try {
            redisTemplates.delete(redisTemplates.keys(k));
        } catch (Throwable t) {
            LOGGER.error("删除缓存失败key[" + k + ", error[" + t + "]");
        }
    }

    @Override
    public void clear() {

    }
}
