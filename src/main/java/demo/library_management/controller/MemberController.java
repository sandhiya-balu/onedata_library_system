package demo.library_management.controller;

import demo.library_management.entity.Member;
import demo.library_management.service.MemberService;

import java.util.List;

public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // Create a new member
    public void addMember(Member member) {
        memberService.addMember(member);
    }

    // Retrieve all members
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    // Retrieve a member by ID
    public Member getMemberById(int id) {
        return memberService.getMemberById(id);
    }

    // Update a member by ID
    public void updateMember(int id, Member member) {
        memberService.updateMember(id, member);
    }

    // Delete a member by ID
    public void deleteMember(int id) {
        memberService.deleteMember(id);
    }
}
