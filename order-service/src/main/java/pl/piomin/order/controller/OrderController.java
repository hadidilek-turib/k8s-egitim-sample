package pl.piomin.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piomin.order.domain.OrderEntity;
import pl.piomin.order.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders-db")
public class OrderController {

    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<OrderEntity> findAll() {
        List<OrderEntity> orders = new ArrayList<>();
        repository.findAll().forEach(orders::add);
        return orders;
    }
}
