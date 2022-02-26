package com.example.week1.service;

import com.example.week1.models.Orders;
import com.example.week1.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List getAllOrders(){
        return orderRepository.findAll();
    }

    public void addOrder(Orders orders) {
        orderRepository.save(orders);
    }

    public void deleteOrder(long id) {
        orderRepository.deleteById((int) id);
    }

    public void updateOrder(Orders orders) {
        Orders order = orderRepository.findById(orders.getId()).orElse(null);

        order.setId(orders.getId());
        order.setUserId(orders.getUserId());
        order.setAddress(orders.getAddress());
        order.setPrice(orders.getPrice());
        order.setStatus(orders.getStatus());
        orderRepository.save(order);
    }
}
