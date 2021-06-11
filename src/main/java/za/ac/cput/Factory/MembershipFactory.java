/* MembershipFactory.java
 * Factory for the Membership entity
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 11 June 2021
 */

package za.ac.cput.Factory;
import za.ac.cput.Entity.Membership;
import za.ac.cput.Util.GenericHelper;

public class MembershipFactory
{
    public static Membership createMembership(int memberID, String type, double totalFees)
    {
        int membershipID = GenericHelper.generateId();

        return new Membership.Builder(membershipID)
                .addMember(memberID)
                .setType(type)
                .setTotalFees(totalFees)
                .build();
    }
}