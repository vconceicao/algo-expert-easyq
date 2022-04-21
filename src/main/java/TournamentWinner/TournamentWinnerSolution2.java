package TournamentWinner;

import java.util.*;

public class TournamentWinnerSolution2 {

    public static void main(String[] args) {

        //Time complexity - O(n) - where n is the input of the result array
        //Space complexity - O(n) - where n is the size of the hashset
        List<List<String>> competitions = new ArrayList<>();

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("HTML");
        c1.add("C#");



        ArrayList<String> c2 = new ArrayList<>();
        c2.add("C#");
        c2.add("PYTHON");


        ArrayList<String> c3 = new ArrayList<>();
        c3.add("PYTHON");
        c3.add("HTML");

        competitions.add(c1);
        competitions.add(c2);
        competitions.add(c3);

        List<Integer> results =  List.of(0, 0, 1);
        System.out.println(tournamentWinner(competitions, results));

    }

    private static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {

        HashMap<String, Integer> score = new HashMap<>();
        String possibleChampion = "";



        for (int i = 0; i < results.size(); i++) {

            String winnerTeam = competitions.get(i).get(convertResult(results.get(i)));

            score.put(winnerTeam,score.get(winnerTeam)!=null?score.get(winnerTeam) +3: 3);

            if (possibleChampion.isEmpty()) {
                possibleChampion = winnerTeam;
            }

            if (score.get(possibleChampion) < score.get(winnerTeam)) {
                possibleChampion = winnerTeam;
            }




        }
        String champion = possibleChampion;


        return champion;
    }

    private static int convertResult(Integer result) {
        int awayTeam = 1;
        int homeTeam = 0;
        if (result==0) {
            return awayTeam;
        }else{
            return homeTeam;
        }
    }


}
