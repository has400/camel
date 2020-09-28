/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.caffeine.cache;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CaffeineCacheEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("cacheName", java.lang.String.class);
        map.put("action", java.lang.String.class);
        map.put("cacheLoader", com.github.benmanes.caffeine.cache.CacheLoader.class);
        map.put("createCacheIfNotExist", boolean.class);
        map.put("evictionType", org.apache.camel.component.caffeine.EvictionType.class);
        map.put("expireAfterAccessTime", int.class);
        map.put("expireAfterWriteTime", int.class);
        map.put("initialCapacity", int.class);
        map.put("key", java.lang.Object.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("maximumSize", int.class);
        map.put("removalListener", com.github.benmanes.caffeine.cache.RemovalListener.class);
        map.put("statsCounter", com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
        map.put("statsEnabled", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("keyType", java.lang.String.class);
        map.put("synchronous", boolean.class);
        map.put("valueType", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CaffeineCacheEndpoint target = (CaffeineCacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "cacheloader":
        case "cacheLoader": target.getConfiguration().setCacheLoader(property(camelContext, com.github.benmanes.caffeine.cache.CacheLoader.class, value)); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": target.getConfiguration().setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "evictiontype":
        case "evictionType": target.getConfiguration().setEvictionType(property(camelContext, org.apache.camel.component.caffeine.EvictionType.class, value)); return true;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": target.getConfiguration().setExpireAfterAccessTime(property(camelContext, int.class, value)); return true;
        case "expireafterwritetime":
        case "expireAfterWriteTime": target.getConfiguration().setExpireAfterWriteTime(property(camelContext, int.class, value)); return true;
        case "initialcapacity":
        case "initialCapacity": target.getConfiguration().setInitialCapacity(property(camelContext, int.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "keytype":
        case "keyType": target.getConfiguration().setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maximumsize":
        case "maximumSize": target.getConfiguration().setMaximumSize(property(camelContext, int.class, value)); return true;
        case "removallistener":
        case "removalListener": target.getConfiguration().setRemovalListener(property(camelContext, com.github.benmanes.caffeine.cache.RemovalListener.class, value)); return true;
        case "statscounter":
        case "statsCounter": target.getConfiguration().setStatsCounter(property(camelContext, com.github.benmanes.caffeine.cache.stats.StatsCounter.class, value)); return true;
        case "statsenabled":
        case "statsEnabled": target.getConfiguration().setStatsEnabled(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "valuetype":
        case "valueType": target.getConfiguration().setValueType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CaffeineCacheEndpoint target = (CaffeineCacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return target.getConfiguration().getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "cacheloader":
        case "cacheLoader": return target.getConfiguration().getCacheLoader();
        case "createcacheifnotexist":
        case "createCacheIfNotExist": return target.getConfiguration().isCreateCacheIfNotExist();
        case "evictiontype":
        case "evictionType": return target.getConfiguration().getEvictionType();
        case "expireafteraccesstime":
        case "expireAfterAccessTime": return target.getConfiguration().getExpireAfterAccessTime();
        case "expireafterwritetime":
        case "expireAfterWriteTime": return target.getConfiguration().getExpireAfterWriteTime();
        case "initialcapacity":
        case "initialCapacity": return target.getConfiguration().getInitialCapacity();
        case "key": return target.getConfiguration().getKey();
        case "keytype":
        case "keyType": return target.getConfiguration().getKeyType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maximumsize":
        case "maximumSize": return target.getConfiguration().getMaximumSize();
        case "removallistener":
        case "removalListener": return target.getConfiguration().getRemovalListener();
        case "statscounter":
        case "statsCounter": return target.getConfiguration().getStatsCounter();
        case "statsenabled":
        case "statsEnabled": return target.getConfiguration().isStatsEnabled();
        case "synchronous": return target.isSynchronous();
        case "valuetype":
        case "valueType": return target.getConfiguration().getValueType();
        default: return null;
        }
    }
}
