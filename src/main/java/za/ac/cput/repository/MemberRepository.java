package za.ac.cput.repository;

import za.ac.cput.entity.Member;
import java.util.HashSet;
import java.util.Set;

public class MemberRepository implements IMemberRepository{

    private static MemberRepository membRep = null;
    private Set<Member> membSet = null;

    private MemberRepository()
    {
        membSet = new HashSet<>();
    }

    public static MemberRepository getMembRep()
    {
        if(membRep == null)
        {
            membRep = new MemberRepository();
        }
        return membRep;
    }

    @Override
    public Member create(Member member)
    {
        boolean success = membSet.add(member);
        if(!success)
            return null;

        return member;
    }

    @Override
    public Member read(Integer memberId)
    {
        for(Member m : membSet)

            if(m.getMemberID()==memberId)
            {
                return m;
            }
        return null;
    }

    @Override
    public Member update(Member member)
    {
        Member member1 = read(member.getMemberID());
        if(member1 != null)
        {
            membSet.remove(member1);
            membSet.add(member);
            return member;
        }
        return null;
    }

    @Override
    public boolean delete(Integer memberId)
    {
        Member memberToDelete = read(memberId);
        if(memberToDelete == null)
            return false;
        membSet.remove(memberToDelete);
        return true;
    }

    @Override
    public Set<Member> getAll() {
        return membSet;
    }
}

