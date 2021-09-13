package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Member;
import za.ac.cput.repository.impl.IMemberRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private IMemberRepository memberrepo;

    @Override
    public Member create(Member member) {

        return this.memberrepo.save(member);
    }

    @Override
    public Member read(Integer memberId) {
        return this.memberrepo.findById(memberId).orElse(null);
    }

    @Override
    public Member update(Member member) {
        if(this.memberrepo.existsById(member.getMemberID()))
            return this.memberrepo.save(member);
        return null;
    }

    @Override
    public boolean delete(Integer memberId) {
        this.memberrepo.deleteById(memberId);
        if(this.memberrepo.existsById(memberId))
            return false;
        else

            return true;
    }

    @Override
    public Set<Member> getAll()
    {
        return this.memberrepo.findAll().stream().collect(Collectors.toSet());
    }
}
