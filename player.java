package sample;

import java.util.Scanner;

public class player {
    String name;
    int age;
    String type;
    int runsScored;
    int wicketsTaken;


    public player(String name,int age,String type,int runsScored,int wicketsTaken){
     this.name = name;
     this.age = age;
     this.type = type;
     this.runsScored = runsScored;
     this.wicketsTaken = wicketsTaken;
    }


    public void getPlayerType(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter player type - spin bowler, seam bowler, batsman or keeper : ");
        type = myScanner.nextLine();
        System.out.println(type);
    }

    public double getBattingAvg(){
        double battingAvg = this.runsScored/15;
        return battingAvg;
    }

    public void getPlayerDetails(){
        System.out.println("Player name            :"+this.name);
        System.out.println("Player age             :"+this.age);
        System.out.println("Player type            :"+this.type);
        System.out.println("Player runs scored     :"+this.runsScored);
        System.out.println("Player wickets taken   :"+this.wicketsTaken);
    }

    public static void main(String[]args){

    }
}
