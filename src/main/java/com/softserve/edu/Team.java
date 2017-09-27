package com.softserve.edu;

/**
 * Created by mhap on 27.09.2017.
 */
public class Team {
    private int teamSize;
    public String future;

    public Team() {
    }

    public int getTeamSize() {
        return teamSize;
    }


    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String predictFuture(int teamSize){
        if (teamSize < 1) {
            future = "Dark";
        }
        else if (teamSize > 0 && teamSize < 5){
            future = "Manageble";
        }
        else {
            future = "You will have a looot of work";
        }
    return future;
    }
}
