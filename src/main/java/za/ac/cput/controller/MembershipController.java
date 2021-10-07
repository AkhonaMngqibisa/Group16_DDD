/* MembershipController.java
 * Controller for Membership
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 18 August 2021
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Member;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.MembershipFactory;
import za.ac.cput.service.impl.MemberService;
import za.ac.cput.service.impl.MembershipService;

import java.util.Set;

@RestController
@RequestMapping("/membership")
public class MembershipController {
    
    @Autowired
    private MembershipService membershipService;

    @Autowired
    private MemberService memberService;

    @PostMapping("/create")
    public ResponseEntity<Membership> create(@RequestBody Membership membership)
    {
        System.out.println(membership.getMember());
        Member member = memberService.read(membership.getMember().getMemberID());
        System.out.println(member);

        if (member == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        System.out.println(member);
        Membership newMembership =
                MembershipFactory.createMembership(
                        member,
                        membership.getType(),
                        membership.getTotalFees()
                    );
        System.out.println("Got new membership");
        System.out.println(newMembership);
        Membership ret = membershipService.create(newMembership);
        System.out.println("Completed");
        System.out.println(ret);
        return new ResponseEntity<>(ret, HttpStatus.OK);
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
