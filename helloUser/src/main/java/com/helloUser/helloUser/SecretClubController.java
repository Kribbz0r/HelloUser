package com.helloUser.helloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecretClubController {

    @GetMapping("/newMemberForm")
    String getNewMemberForm(Model model) {
        // Controller som lägger till medlemmar
        model.addAttribute("members", HelloUserApplication.secretClub.members);
        return "newMemberForm";
    }

}
