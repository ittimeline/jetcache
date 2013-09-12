/**
 * Created on  13-09-04 15:34
 */
package com.taobao.geek.cache;

import com.taobao.geek.cache.impl.CacheImplSupport;

/**
 * @author yeli.hl
 */
public class CacheContext {

    private CacheContext() {
    }

    public static <T> T enableCache(final T target) {
        return CacheImplSupport.enableCache(target);
    }

}
