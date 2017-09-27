package com.softserve.edu;

/**
 * Created by mhap on 27.09.2017.
 */
public class Team {
    private int teamSize;
    private String teamName;
    public String future;

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String predictFuture(int teamSize){
        if (teamSize < 1) {
            future = "dark";
        }
        else if (teamSize > 0 && teamSize < 5){
            future = "manageble";
        }
        else {
            future = "very dependant";
        }
    return future;
    }
}
