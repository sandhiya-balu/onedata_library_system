package demo.library_management.service;

import demo.library_management.entity.Member;
import demo.library_management.repository.MemberRepository;

import java.util.List;

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void addMember(Member member) {
        memberRepository.save(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member getMemberById(int id) {
        return memberRepository.findById(id);
    }

    public void updateMember(int id, Member member) {
        memberRepository.update(id, member);
    }

    public void deleteMember(int id) {
        memberRepository.deleteById(id);
    }
}
