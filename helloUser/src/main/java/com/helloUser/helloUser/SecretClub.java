package com.helloUser.helloUser;

import java.util.ArrayList;

public class SecretClub {
    public String clubName;
    ArrayList<Member> members;

    SecretClub(String clubName) {
        this.clubName = clubName;
        this.members = new ArrayList<>();
        addDefaultMembers();
    }

    // Metod för att lägga till ny medlem
    public void addMember(String name, String eMail, int age, boolean admin) {

        members.add(new Member(name, eMail, age, admin));
    }

    // Metod för att kontrollera om en användare med det namnet redan existerar
    // public boolean validateMember(String name){
    // if (name == namn på ny användare){
    // ropa på html och ge popup som säger att det inte går
    // return false;
    // } else
    // return true;
    // }

    // Metod för att lägga till default members
    public void addDefaultMembers() {
        addMember("admin", "admin@admin.se", 72, true);
        addMember("Anna", "anna.svensson@e-post.se", 42, false);
        addMember("Lennart", "Lennart@koskenkorva.fi", 27, false);
        addMember("Kalle", "Anka", 89, false);
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
