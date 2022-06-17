package com.github.ls8367.domain.order;

import com.github.ls8367.domain.member.Member;

public class MemberOrderEvent {

    private final Object source;
    private final Member member;

    public MemberOrderEvent(final Object source, final Member member) {
        this.source = source;
        this.member = member;
    }

    public Object getSource() {
        return source;
    }

    public Member getMember() {
        return member;
    }
}
