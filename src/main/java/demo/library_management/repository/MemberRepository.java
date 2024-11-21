package demo.library_management.repository;

import demo.library_management.entity.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private final List<Member> members = new ArrayList<>();

    public void save(Member member) {
        members.add(member);
    }

    public List<Member> findAll() {
        return new ArrayList<>(members);
    }

    public Member findById(int id) {
        return members.stream().filter(member -> member.getId() == id).findFirst().orElse(null);
    }

    public void update(int id, Member member) {
        Member existingMember = findById(id);
        if (existingMember != null) {
            members.remove(existingMember);
            members.add(member);
        }
    }

    public void deleteById(int id) {
        members.removeIf(member -> member.getId() == id);
    }
}
