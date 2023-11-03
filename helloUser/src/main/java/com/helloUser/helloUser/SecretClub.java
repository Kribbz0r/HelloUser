package com.helloUser.helloUser;

import java.util.ArrayList;
import java.util.UUID;

public class SecretClub {
    public String clubName;
    ArrayList<Member> members;

    SecretClub(String clubName) {
        this.clubName = clubName;
        this.members = new ArrayList<>();
        addDefaultMembers();
    }

    public void addMember(String name, String eMail, int age, UUID id) {
        members.add(new Member(name, eMail, age, id));
    }

    public void addDefaultMembers() {
        addMember("Admin", "admin@admin.se", 72, UUID.randomUUID());
        addMember("Anna", "anna.svensson@e-post.se", 42, UUID.randomUUID());
        addMember("Lennart", "Lennart@koskenkorva.fi", 27, UUID.randomUUID());
        addMember("Kalle", "k@anka.ab", 89, UUID.randomUUID());
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

}
