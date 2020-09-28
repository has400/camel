/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.caffeine.load;

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
public class CaffeineLoadCacheComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
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
        map.put("configuration", org.apache.camel.component.caffeine.CaffeineConfiguration.class);
        map.put("keyType", java.lang.String.class);
        map.put("valueType", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.caffeine.CaffeineConfiguration getOrCreateConfiguration(CaffeineLoadCacheComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.caffeine.CaffeineConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CaffeineLoadCacheComponent target = (CaffeineLoadCacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": getOrCreateConfiguration(target).setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "cacheloader":
        case "cacheLoader": getOrCreateConfiguration(target).setCacheLoader(property(camelContext, com.github.benmanes.caffeine.cache.CacheLoader.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.caffeine.CaffeineConfiguration.class, value)); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": getOrCreateConfiguration(target).setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "evictiontype":
        case "evictionType": getOrCreateConfiguration(target).setEvictionType(property(camelContext, org.apache.camel.component.caffeine.EvictionType.class, value)); return true;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": getOrCreateConfiguration(target).setExpireAfterAccessTime(property(camelContext, int.class, value)); return true;
        case "expireafterwritetime":
        case "expireAfterWriteTime": getOrCreateConfiguration(target).setExpireAfterWriteTime(property(camelContext, int.class, value)); return true;
        case "initialcapacity":
        case "initialCapacity": getOrCreateConfiguration(target).setInitialCapacity(property(camelContext, int.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "keytype":
        case "keyType": getOrCreateConfiguration(target).setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maximumsize":
        case "maximumSize": getOrCreateConfiguration(target).setMaximumSize(property(camelContext, int.class, value)); return true;
        case "removallistener":
        case "removalListener": getOrCreateConfiguration(target).setRemovalListener(property(camelContext, com.github.benmanes.caffeine.cache.RemovalListener.class, value)); return true;
        case "statscounter":
        case "statsCounter": getOrCreateConfiguration(target).setStatsCounter(property(camelContext, com.github.benmanes.caffeine.cache.stats.StatsCounter.class, value)); return true;
        case "statsenabled":
        case "statsEnabled": getOrCreateConfiguration(target).setStatsEnabled(property(camelContext, boolean.class, value)); return true;
        case "valuetype":
        case "valueType": getOrCreateConfiguration(target).setValueType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CaffeineLoadCacheComponent target = (CaffeineLoadCacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return getOrCreateConfiguration(target).getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "cacheloader":
        case "cacheLoader": return getOrCreateConfiguration(target).getCacheLoader();
        case "configuration": return target.getConfiguration();
        case "createcacheifnotexist":
        case "createCacheIfNotExist": return getOrCreateConfiguration(target).isCreateCacheIfNotExist();
        case "evictiontype":
        case "evictionType": return getOrCreateConfiguration(target).getEvictionType();
        case "expireafteraccesstime":
        case "expireAfterAccessTime": return getOrCreateConfiguration(target).getExpireAfterAccessTime();
        case "expireafterwritetime":
        case "expireAfterWriteTime": return getOrCreateConfiguration(target).getExpireAfterWriteTime();
        case "initialcapacity":
        case "initialCapacity": return getOrCreateConfiguration(target).getInitialCapacity();
        case "key": return getOrCreateConfiguration(target).getKey();
        case "keytype":
        case "keyType": return getOrCreateConfiguration(target).getKeyType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maximumsize":
        case "maximumSize": return getOrCreateConfiguration(target).getMaximumSize();
        case "removallistener":
        case "removalListener": return getOrCreateConfiguration(target).getRemovalListener();
        case "statscounter":
        case "statsCounter": return getOrCreateConfiguration(target).getStatsCounter();
        case "statsenabled":
        case "statsEnabled": return getOrCreateConfiguration(target).isStatsEnabled();
        case "valuetype":
        case "valueType": return getOrCreateConfiguration(target).getValueType();
        default: return null;
        }
    }
}
