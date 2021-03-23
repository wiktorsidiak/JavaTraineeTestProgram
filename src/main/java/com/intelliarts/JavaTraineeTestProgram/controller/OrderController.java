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


    }
