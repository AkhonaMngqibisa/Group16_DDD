/* MembershipRepository.java
 * Class Repository for Membership
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 24 July 2021
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Membership;

import java.util.HashSet;
import java.util.Set;

public class MembershipRepository implements IMembershipRepository {

    private static MembershipRepository membershipRep = null;
    private Set<Membership> membershipSet;

    private MembershipRepository()
    {
        membershipSet = new HashSet<>();
    }

    public static MembershipRepository getRepository()
    {
        if(membershipRep == null)
        {
            membershipRep = new MembershipRepository();
        }
        return membershipRep;
    }

    @Override
    public Membership create(Membership membership)
    {
        boolean success = membershipSet.add(membership);
        if(!success)
            return null;

        return membership;
    }

    @Override
    public Membership read(Integer membershipId)
    {
        for(Membership m : membershipSet) {
            if (m.getMembershipID() == membershipId) {
                return m;
            }
        }
            return null;
    }

    @Override
    public Membership update(Membership membership)
    {
        Membership _membership = read(membership.getMembershipID());
        if(_membership != null)
        {
            membershipSet.remove(_membership);
            membershipSet.add(membership);
            return membership;
        }
        return null;
    }

    @Override
    public boolean delete(Integer membershipId)
    {
        Membership delete = read(membershipId);
        if(delete == null)
            return false;
        membershipSet.remove(delete);
        return true;
    }

    @Override
    public Set<Membership> getAll() {
        return membershipSet;
    }
}
