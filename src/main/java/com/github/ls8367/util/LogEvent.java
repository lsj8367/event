package com.github.ls8367.util;

import com.github.ls8367.domain.order.MemberOrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogEvent {

    @EventListener(MemberOrderEvent.class)
    public void logEvent(final MemberOrderEvent memberOrderEvent) {
        log.info(memberOrderEvent.getSource() + "에서 이벤트 실행함");
    }

}
