package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mhap on 27.09.2017.
 */
public class TeamMain {
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Team cool = new Team();
        cool.setTeamName("Your Team");
        Team lame = new Team();
        System.out.println("What is the enemy team name");
        lame.setTeamName((br.readLine()));
        System.out.println("What is the enemy team size");
        lame.setTeamSize(readString());
        try {System.out.println("Enter your team size");
            cool.setTeamSize(Integer.parseInt(br.readLine()));
            cool.predictFuture(cool.getTeamSize());
            if (cool.getTeamSize()> lame.getTeamSize()){
                System.out.println("Be happy, Your team is bigger");
            }
            else if (cool.getTeamSize()<lame.getTeamSize()){
                System.out.println("Start moving, Your team is smaller");
            }
            else {
                System.out.println("Teams are the same");
            }
            System.out.print(new StringBuilder().append("The future is ").append(cool.future).append(" for ").append(cool.getTeamName()).toString());
        } catch (IOException e) {
            System.out.println("You Entered something stupid" + e);
        } catch (NumberFormatException e){
            System.out.print("That is not a number!");
        }
    }

    public static int readString() {
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            result = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Inavalid input");
        } catch (NumberFormatException e) {
            System.out.println("You did not set the number of the other team correctly so we assume it's 0");
        }
        return result;
    }
}
