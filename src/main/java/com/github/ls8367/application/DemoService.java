package com.github.ls8367.application;

import com.github.ls8367.domain.member.Member;
import com.github.ls8367.domain.order.MemberOrderEvent;
import com.github.ls8367.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class DemoService {

    private final MemberRepository memberRepository;
    private final ApplicationEventPublisher memberEvent;

    public void saveMember() {
        final Member savedMember = memberRepository.save(new Member("name", "email"));
        memberEvent.publishEvent(new MemberOrderEvent(this, savedMember));
    }

}
