
class Result {

    /*
     * Complete the 'winner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING erica
     *  2. STRING bob
     */

    public static String winner(String erica, String bob) {
    String result;
    char[] ericaArray =  erica.toCharArray();
    int ericaScore = 0;
    int bobScore = 0;
    for (char c : ericaArray) {
    System.out.println("Erica Char: "+c);
    ericaScore = ericaScore + findScore(c);
}
    System.out.println("ericaScore: "+ericaScore);
    char[] bobArray =  bob.toCharArray();
    for (char c : bobArray) {
    System.out.println("Bob Char: "+c);
    bobScore = bobScore + findScore(c);
}
    System.out.println("bobScore: "+bobScore);
    if(ericaScore == bobScore) {
    result = "Tie";
    } else {
    result = ericaScore > bobScore ? "Erica" : "Bob";
    }
   
    return result;
    }

private static int findScore(char c) {
Character ch = new Character(c);
int score =0;
if(ch.toString().equals("E"))
score = 1;
else if(ch.toString().equals("M")) {
score = 3;
} else if(ch.toString().equals("H")) {
score = 5;
}
return score;
}

}
public class CodingFriends {

public static void main(String[] args) {
System.out.println("Result: " +Result.winner("EHH", "EME"));

}

}