package com.service.impl;

import com.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Override
    public String createOrder() {
        log.info("in create order");
        return "order-uuid";
    }


}
