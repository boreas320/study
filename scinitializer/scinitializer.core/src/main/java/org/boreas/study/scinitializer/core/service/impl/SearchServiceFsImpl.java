package org.boreas.study.scinitializer.core.service.impl;

import org.boreas.study.scinitializer.core.service.SearchService;

/**
 * Created by shuai.xiang@renren-inc.com on 16/6/7.
 */
public class SearchServiceFsImpl implements SearchService {
    @Override
    public String search(String key) {
        return "file://User/boreas";
    }
}
