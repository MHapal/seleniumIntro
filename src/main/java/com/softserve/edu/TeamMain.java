package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mhap on 27.09.2017.
 */
public class TeamMain {
    public static void main (String[]args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Team cool = new Team();
        try {System.out.print("Enter your team size");
            cool.predictFuture(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            System.out.println("You Entered something stupid" + e);
        } catch (NumberFormatException e){
            System.out.print("That is not a number!");
        }

        System.out.print(cool.future);
    }
}
