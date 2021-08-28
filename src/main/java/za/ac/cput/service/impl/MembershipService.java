/* MembershipService.java
 * Service for Membership
 * Author: Haroun Mohamed-Fakier (219095523)
 * Date: 30 July 2021
 */

package za.ac.cput.service.impl;

import za.ac.cput.service.IService;
import za.ac.cput.entity.Membership;

import java.util.Set;

public interface MembershipService extends IService<Membership, Integer> {
    Set<Membership> getAll();
}
