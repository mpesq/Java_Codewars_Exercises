package com._8kyu;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        // your code
        if(p1.equals("rock")) {
            if(p2.equals("scissors")) return "Player 1 won!";
            else if(p2.equals("paper")) return "Player 2 won!";
        } else if(p1.equals("paper")) {
            if(p2.equals("rock")) return "Player 1 won!";
            else if(p2.equals("scissors")) return "Player 2 won!";
        } else if(p1.equals("scissors")) {
            if(p2.equals("paper")) return "Player 1 won!";
            else if(p2.equals("rock")) return "Player 2 won!";
        } else return "Draw!";
        return "Draw!";
    }

    public static void main(String[] args) {
        System.out.println(rps("paper", "paper"));
    }
}
