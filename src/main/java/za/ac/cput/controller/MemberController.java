package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Member;
import za.ac.cput.entity.Membership;
import za.ac.cput.factory.MemberFactory;
import za.ac.cput.service.impl.MemberService;
import za.ac.cput.service.impl.MembershipService;

import javax.validation.Valid;
import java.util.Set;

/* MemberController.java
Controller for the Member
Author: Akhona Mngqibisa (217302394)
Date:15 August 2021
*/

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MembershipService membershipService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public String create(@ModelAttribute("member")Member member)
    {
        Member newMember = MemberFactory.createMember(member.getFirstName(), member.getLastName(), member.getAddress(),member.getPhoneNo(), member.getAge(), member.getStatus(), member.getEmailAddress(), member.getPassword());
        if((newMember.getFirstName()==null)|| (newMember.getFirstName().trim().isEmpty())
                || (newMember.getLastName()==null) || (newMember.getLastName().trim().isEmpty())
                || (newMember.getEmailAddress()==null) || newMember.getEmailAddress().trim().isEmpty())
            //These are compulsory

            throw new NullPointerException();
        else
        memberService.create(newMember);
        System.out.println("SHOW THE MEMBER"+member.toString());
        return "redirect:/member/getall";

    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Member read(@PathVariable int id)
    {
        return memberService.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
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
    public Set<Member> getAll(
            @RequestParam(required = false, defaultValue = "false", value = "filter") String filter
    )
    {
        Set<Member> listMembers = memberService.getAll();
        if (filter.equals("true")) {
            Set<Membership> listMemberships = membershipService.getAll();
            for(Membership membership : listMemberships)
                listMembers.removeIf(p -> p.getMemberID() == membership.getId());
        }

        return listMembers;
    }

    @RequestMapping("/new")
    public String showNewMemberPage(Model model) {
        Member member = new Member();
        model.addAttribute("member", member);

        return "newMemberForm";
    }


}
