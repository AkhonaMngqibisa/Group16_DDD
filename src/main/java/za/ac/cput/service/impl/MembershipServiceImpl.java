/* MembershipServiceImpl.java
 * Service implementation for Membership
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 30 July 2021
 */

package za.ac.cput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Membership;
import za.ac.cput.repository.impl.MembershipRepository;
import java.util.Set;

@Service
public class MembershipServiceImpl implements MembershipService{
    private static MembershipService membershipService;
    private final MembershipRepository membershipRepository;

    public MembershipServiceImpl() {
        this.membershipRepository = MembershipRepository.getRepository();
    }

    public MembershipServiceImpl(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    public static MembershipService getInstance() {
        if(membershipService== null)
            membershipService = new MembershipServiceImpl();
        return membershipService;
    }

    @Override
    public Membership create(Membership membership) {
        return membershipRepository.create(membership);
    }

    @Override
    public Membership read(Integer integer) {
        return membershipRepository.read(integer);
    }

    @Override
    public Membership update(Membership membership) {
        return membershipRepository.update(membership);
    }

    @Override
    public boolean delete(Integer integer) {
        return membershipRepository.delete(integer);
    }

    public Set<Membership> getAll() {
        return membershipRepository.getAll();
    }
}
