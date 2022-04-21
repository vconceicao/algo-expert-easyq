package p20220421;

import java.util.*;

public class TournamentWinnerMD {

    public static void main(String[] args) {

        //Time complexity - O(n) - where n is the input of the result array
        //Space complexity - O(n) - where n is the size of the hastmap
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


        int resultIndex = 0;
        int team = 0;
        var map = new HashMap<String, Integer>();
        String possibleChampion = null;
        while (resultIndex < results.size()) {


            if (results.get(resultIndex)==0) {
                team = 1;
            }else{
                team = 0;
            }

            String winnerTeam = competitions.get(resultIndex).get(team);

            var count = map.getOrDefault(winnerTeam, 3);
            map.put(winnerTeam, count + 3);

            if (possibleChampion==null) {
                possibleChampion = winnerTeam;
            }

            if (map.get(possibleChampion) < map.get(winnerTeam)) {
                possibleChampion = winnerTeam;
            }

            resultIndex++;

        }

        return possibleChampion;
    }



}
