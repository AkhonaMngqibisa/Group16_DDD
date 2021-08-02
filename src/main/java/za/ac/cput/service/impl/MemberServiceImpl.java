package za.ac.cput.service.impl;

import za.ac.cput.entity.Member;
import za.ac.cput.repository.impl.MemberRepository;

import java.util.Set;

public class MemberServiceImpl implements MemberService {
    private static MemberService membservice;
    private MemberRepository membrepo;


    public MemberServiceImpl() {
        this.membrepo = MemberRepository.getMembRep();
    }

    public static MemberService getMembservice() {
           if(membservice== null)
            membservice=new MemberServiceImpl();

        return membservice;
    }

    @Override
    public Member create(Member member) {
        return this.membrepo.create(member);
    }

    @Override
    public Member read(Integer memberId) {
        return this.membrepo.read(memberId);
    }

    @Override
    public Member update(Member member) {
        return this.membrepo.update(member);
    }

    @Override
    public boolean delete(Integer memberId) {
       return this.membrepo.delete(memberId);
    }

    public Set<Member> getAll()
    {
        return this.membrepo.getAll();
    }
}
