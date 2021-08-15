package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Member;
import za.ac.cput.factory.MemberFactory;
import za.ac.cput.service.impl.MemberService;

import java.util.Set;

/* MemberController.java
Controller for the Member
Author: Akhona Mngqibisa (217302394)
Date:15 August 2021
*/

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Member create(@RequestBody Member member)
    {
        Member newMember = MemberFactory.createMember(member.getFirstName(), member.getLastName(), member.getAddress(),member.getPhoneNo(), member.getAge(), member.getStatus(), member.getEmailAddress(), member.getPassword());
        if((newMember.getFirstName()== null)|| (newMember.getFirstName().trim().isEmpty())
                || (newMember.getLastName()==null) || (newMember.getLastName().trim().isEmpty())
                || (newMember.getEmailAddress()==null) || newMember.getEmailAddress().trim().isEmpty())
            //These are compulsory

            throw new NullPointerException();
        else

        return memberService.create(newMember);
    }
    @GetMapping("/read/{id}")
    public Member read(@PathVariable int id)
    {
        return memberService.read(id);
    }

    @PostMapping("/update")
    public Member update(@RequestBody Member member)
    {
        return memberService.update(member);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id)
    {
        return memberService.delete(id);
    }


    @GetMapping("/getall")
    public Set<Member> getAll()
    {
        return memberService.getAll();
    }
}
