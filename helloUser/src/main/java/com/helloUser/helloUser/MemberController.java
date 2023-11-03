package com.helloUser.helloUser;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @GetMapping("/")
    String getIndex() {
        return "index";
    }

    @GetMapping("/members")
    String getMembers(Model model) {
        model.addAttribute("members", HelloUserApplication.secretClub.members);
        return "members";
    }

    @GetMapping("/newMemberForm")
    String getNewMembersForm(Model model) {
        model.addAttribute("newMember", new Member(null, null, 0, UUID.randomUUID()));
        return "newMemberForm";
    }

    @PostMapping("/newMemberForm")
    String newMemberForm(@RequestParam("name") String name, @RequestParam("eMail") String eMail,
            @RequestParam("age") int age) {
        HelloUserApplication.secretClub.members
                .add(new Member(name, eMail, age, UUID.randomUUID()));
        return "redirect:/newMemberForm";
    }

    @GetMapping("/removeMember/{memberId}")
    String removeMember(@PathVariable("memberId") UUID id) {
        HelloUserApplication.secretClub.members.removeIf(member -> member.getId().equals(id));
        return "redirect:/members";
    }

}
