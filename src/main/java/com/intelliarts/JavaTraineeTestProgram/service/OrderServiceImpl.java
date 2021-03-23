package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import com.intelliarts.JavaTraineeTestProgram.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements  OrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        order.setDate(order.getDate());
        order.setAmount(order.getAmount());
        order.setCurrency(order.getCurrency());
        order.setProduct(order.getProduct());

        return orderRepository.saveOder(order);
    }

    @Override
    public List<Order> findByDate(Date date) {
        return Collections.singletonList(orderRepository.findByDate(date));
    }

    @Override
    public List<Order> deleteByDate(Order order) {
        return Collections.singletonList(orderRepository.deleteByDate(order));
    }

    @Override
    public List<Order> getAndSortOrderByDate(Sort sort, Date date) {
        return orderRepository.getAndSortOrderByDate(Sort.by(Sort.Direction.ASC, "date"));
    }
}
