package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import org.springframework.data.domain.Sort;

import java.util.Date;
import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);

    List<Order> findByDate(Date date);

    List<Order> deleteByDate(Order order);

    List<Order> getAndSortOrderByDate(Sort sort, Date date);
}
