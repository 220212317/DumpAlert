package za.ac.cput.repository;

import za.ac.cput.entity.Member;

import java.util.List;

public interface MemberRepository extends IRepository<Member,String> {
    Member create(Member member);

    Member read(String memberId);

    Member update(Member member);

    boolean delete(String memberId);

    List<Member> getAll();
}
