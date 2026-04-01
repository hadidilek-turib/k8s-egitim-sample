package pl.piomin.order.repository;

import org.springframework.data.repository.CrudRepository;
import pl.piomin.order.domain.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
}
