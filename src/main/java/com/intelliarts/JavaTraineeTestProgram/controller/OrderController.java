package com.intelliarts.JavaTraineeTestProgram.controller;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import com.intelliarts.JavaTraineeTestProgram.repository.OrderRepository;
import com.intelliarts.JavaTraineeTestProgram.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/expenses")
public class OrderController {

    private Order order;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderService orderService;

    @PostMapping("/expences")
    public String saveOrder(Order order) {
        Order savedOrder = orderRepository.saveOder(order);

        return "redirect:expenses";
    }

    @GetMapping("/expenses")
    public String getAndSortByDate(@RequestParam Sort sort) {
        orderRepository.getAndSortOrderByDate(sort);
        return "getAndSortByDate";
    }

    @DeleteMapping("/expences?date={date}")
    public String deleteOrder(@PathVariable Date date) {
        Order thisOrder = orderRepository.findByDate(date);
        orderRepository.deleteByDate(thisOrder);

        return "expences";
    }
}
