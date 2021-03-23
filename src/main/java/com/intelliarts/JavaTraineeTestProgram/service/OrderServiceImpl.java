package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import com.intelliarts.JavaTraineeTestProgram.repository.OrderRepository;
import com.tunyk.currencyconverter.api.CurrencyConverter;
import com.tunyk.currencyconverter.api.CurrencyConverterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements  OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    Order order;
    @Autowired
    CurrencyConverter currencyConverter;
    @Autowired
    EntityManager entityManager;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> findByDate(Date date) {
        return orderRepository.findAllByDate(date);
    }

    @Override
    public void deleteByDate(Order order) {
        entityManager.persist(order);
        entityManager.createNativeQuery("delete from Order where date = :date")
                .setParameter("date", order.getDate())
                .executeUpdate();
        orderRepository.delete(order);
    }

    @Override
    public BigDecimal getTotal() throws CurrencyConverterException {
        currencyConverter.convertCurrency(order.getAmount(), order.getCurrency(), order.setCurrency());
        return null;
    }
}