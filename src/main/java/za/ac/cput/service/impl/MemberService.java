package za.ac.cput.service.impl;
import za.ac.cput.entity.Member;
import za.ac.cput.service.IService;

import java.util.Set;

public interface MemberService extends IService<Member, Integer> {
    public Set<Member> getAll();
}
