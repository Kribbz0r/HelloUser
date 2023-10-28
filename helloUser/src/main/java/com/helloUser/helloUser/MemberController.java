package com.helloUser.helloUser;

import java.util.ArrayList;
import java.util.List;

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
        model.addAttribute("newMember", new Member(null, null, 0, false));
        return "newMemberForm";
    }

    @PostMapping("/newMemberForm")
    String newMemberForm(@RequestParam("name") String name, @RequestParam("eMail") String eMail,
            @RequestParam("age") int age, @RequestParam("admin") boolean admin) {
        System.out.println("PostMapping" + name + " " + eMail + " " + age + " " + admin);
        // Controller som lägger till medlemmar
        HelloUserApplication.secretClub.members.add(new Member(name, eMail, age, admin));
        return "redirect:/newMemberForm";
    }

    // Ändra så att medlemmarna får ett ID? Blir problem om folk har samma namn nu
    @GetMapping("/removeMember/{memberName}")
    String removeMember(@PathVariable String memberName) {
        System.out.println("Ta bort: " + memberName);
        HelloUserApplication.secretClub.members.removeIf(member -> member.getName().equals(memberName));
        return "redirect:/members";
    }
}
