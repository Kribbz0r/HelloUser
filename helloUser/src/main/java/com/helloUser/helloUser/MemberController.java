package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
