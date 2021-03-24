package com.intelliarts.JavaTraineeTestProgram.service;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import com.tunyk.currencyconverter.api.CurrencyConverterException;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);

    List<Order> findAll(Date date);

    void deleteByDate(Date date);

    BigDecimal getTotal() throws CurrencyConverterException;

}
