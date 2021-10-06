/* MembershipServiceImpl.java
 * Service implementation for Membership
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 30 July 2021
 */

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Membership;
import za.ac.cput.repository.impl.IMembershipRepository;
import java.util.HashSet;
import java.util.Set;

@Service
public class MembershipServiceImpl implements MembershipService{

    @Autowired
    private IMembershipRepository membershipRepository;

    @Override
    public Membership create(Membership membership) {
        return membershipRepository.save(membership);
    }

    @Override
    public Membership read(Integer id) {
        return membershipRepository.findById(id).orElse(null);
    }

    @Override
    public Membership update(Membership membership) {
        if (membershipRepository.existsById(membership.getID()))
            return membershipRepository.save(membership);
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        membershipRepository.deleteById(id);
        return !membershipRepository.existsById(id);
    }

    public Set<Membership> getAll() {
        return new HashSet<>(membershipRepository.findAll());
    }
}
