package com.intelliarts.JavaTraineeTestProgram.repository;

import com.intelliarts.JavaTraineeTestProgram.model.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order saveOder(Order order);

    Order findByDate(Date date);

    Order deleteByDate(Order order);

    List<Order> getAndSortOrderByDate(Sort date);
}
