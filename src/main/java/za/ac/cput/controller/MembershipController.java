/* MembershipController.java
 * Controller for Membership
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 18 August 2021
 */

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Member;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.MembershipFactory;
import za.ac.cput.service.impl.MemberService;
import za.ac.cput.service.impl.MembershipService;

import java.security.Principal;
import java.util.Set;

@RestController
@RequestMapping("/membership")
@EnableWebSecurity
public class MembershipController {
    
    @Autowired
    private MembershipService membershipService;

    @Autowired
    private MemberService memberService;

//    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<Membership> create(@RequestBody Membership membership)
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(!(auth instanceof AnonymousAuthenticationToken) && auth != null)
            System.out.println(auth.getName());
        else
            System.out.println("No Auth!");

        Member member = memberService.read(membership.getMember().getMemberID());

        if (member == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        Membership newMembership =
                MembershipFactory.createMembership(
                        member,
                        membership.getType(),
                        membership.getTotalFees()
                    );
        Membership ret = membershipService.create(newMembership);
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
