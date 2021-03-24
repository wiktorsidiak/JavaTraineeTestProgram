package com.intelliarts.JavaTraineeTestProgram.controller;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import com.intelliarts.JavaTraineeTestProgram.repository.OrderRepository;
import com.intelliarts.JavaTraineeTestProgram.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class OrderController {

    private Order order;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping(value = "expenses/{date}")
    public List<Order> getOrdersByDate(@PathVariable Date date){
        return orderService.findAll(date);
    }
    @DeleteMapping(value = "expences?{date}")
    public void deleteOrder(@PathVariable Date date){
        orderService.deleteByDate(date);
    }

}