package com.batiaev.java2.lesson1.homework;

import lombok.Data;

@Data

public class Team {
    //    private List<Member> members = new ArrayList<>();
    private Member[] members;
    private String name;

    public Team(String teamName, Member[] animals) {
        this.name = teamName;
        this.members = animals;
    }

    public void showResults() {
        for (Member member : members) {
            String result = member.getResult() ? "passed" : "failed";
            System.out.println("Member " + member.getName() + " is " + result);
        }
    }

}
