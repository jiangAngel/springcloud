package com.jx.springcloud.service.impl;

import com.jx.springcloud.dao.StorageDao;
import com.jx.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("扣减库存开始..........");
        storageDao.decrease(productId, count);
        log.info("扣减库存结束..........");
    }
}
