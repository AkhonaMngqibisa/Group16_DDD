/* MembershipController.java
 * Controller for Membership
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 18 August 2021
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.MembershipFactory;
import za.ac.cput.service.impl.MembershipService;

import java.util.Set;

@RestController
@RequestMapping("/membership")
public class MembershipController {
    
    @Autowired
    private MembershipService membershipService;

    @PostMapping("/create")
    public Membership create(@RequestBody Membership membership)
    {
        Membership newMembership =
                MembershipFactory.createMembership(
                        membership.getMemberID(),
                        membership.getType(),
                        membership.getTotalFees()
                    );
        return membershipService.create(newMembership);
    }

    @GetMapping("/read/{id}")
    public Membership read(@PathVariable int id)
    {
        return membershipService.read(id);
    }

    @PostMapping("/update")
    public Membership update(@RequestBody Membership membership)
    {
        return membershipService.update(membership);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return membershipService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Membership> getAll()
    {
        return membershipService.getAll();
    }

}
