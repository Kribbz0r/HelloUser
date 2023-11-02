package com.helloUser.helloUser;

import java.util.ArrayList;
import java.util.List;
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
        // Controller som kontrollerrar om admin
        return "index";
    }

    @GetMapping("/members")
    String getMembers(Model model) {
        // Controller som visar medlemmar
        model.addAttribute("members", HelloUserApplication.secretClub.members);
        // Controller som tar bort medlemmar
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
        System.out.println("PostMapping" + name + " " + eMail + " " + age + " ");
        // Controller som lägger till medlemmar
        HelloUserApplication.secretClub.members
                .add(new Member(name, eMail, age, UUID.randomUUID()));
        return "redirect:/newMemberForm";
    }

    // Ändra så att medlemmarna får ett ID? Blir problem om folk har samma namn nu
    @GetMapping("/removeMember/{memberId}")
    String removeMember(@PathVariable("memberId") UUID id) {
        System.out.println("Ta bort: " + id);
        HelloUserApplication.secretClub.members.removeIf(member -> member.getId().equals(id));
        return "redirect:/members";
    }

}
