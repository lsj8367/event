package com.github.ls8367.infrastructure;

import com.github.ls8367.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
