package com.github.ls8367.domain.order;

import com.github.ls8367.infrastructure.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderSaver {

    private final OrderRepository orderRepository;

    @EventListener(MemberOrderEvent.class)
    public void saveOrder(final MemberOrderEvent memberOrderEvent) {
        orderRepository.save(new Order(memberOrderEvent.getMember().getId()));
    }
}
