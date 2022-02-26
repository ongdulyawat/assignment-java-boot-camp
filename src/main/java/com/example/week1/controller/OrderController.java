package com.example.week1.controller;

import com.example.week1.models.Orders;
import com.example.week1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/{id}")
    public List<Orders> get(@PathVariable int id){

        return  orderService.getAllOrders();
    }

    @PostMapping("/orders/add")
    public void addOrder(@RequestBody Orders orders) {
        orderService.addOrder(orders);
    }

    @DeleteMapping("/orders/delete/{id}")
    public void deleteOrder(@PathVariable long id) {
        orderService.deleteOrder(id);
    }

    @PutMapping("/orders/edit/{id}")
    public void updateOrder(@RequestBody Orders orders){
        orderService.updateOrder(orders);
    }
}
