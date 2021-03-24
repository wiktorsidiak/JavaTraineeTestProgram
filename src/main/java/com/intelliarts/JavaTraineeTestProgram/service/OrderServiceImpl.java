package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import com.intelliarts.JavaTraineeTestProgram.repository.OrderRepository;
import com.tunyk.currencyconverter.api.CurrencyConverter;
import com.tunyk.currencyconverter.api.CurrencyConverterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements  OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private Order order;
    @Autowired
    private CurrencyConverter currencyConverter;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public List<Order> findAll(Date date) {
        return orderRepository.findAll();
    }

    @Override
    public void deleteByDate(Date date) {
        orderRepository.delete(order);
    }

    @Override
    public BigDecimal getTotal() throws CurrencyConverterException {
        currencyConverter.convertCurrency(order.getAmount(), order.getCurrency(), order.setCurrency());
        return null;
    }
}