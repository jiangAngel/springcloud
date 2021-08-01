package com.jx.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    // 得到实例总数
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
