package com.jerry.web.data;

import com.jerry.web.model.Order;

public interface OrderRepository {

  Order save(Order order);
  
}
