import java.util.Collections;
import java.util.List;
import java.util.Comparator;






public class Player {
    private String emailId;
    private int score;
    private Long createdAtTs;

    public Player(String emailId, int score)
    {
        this.emailId=emailId;
        this.score=score;
        createdAtTs=System.currentTimeMillis();
    }

    public Player(String emailId,int score,long createdAtTs)
    {
        this.emailId=emailId;
        this.score=score;
        this.createdAtTs=createdAtTs;
    }
    public String getEmailId()
    {
        return emailId;
    }
    public int getScore()
    {
        return score;
    }
    public void setEmailId(String emailId)
    {
        this.emailId=emailId;
    }
    public void setScore(int score)
    {
        this.score=score;
    }

}

class Leaderboard
{
    List<Player> list;

    public Leaderboard(List<Player> list)
    {
        //Collections.sort(list,EMAIL_COMPARATOR);
        this.list=list;
    }

    //Fetch the score of the player with the given email ids

    public int getMyScore(String email)
    {
        //int myPosition = performBinaryForEmail(email,0,list.size()-1);
        return 0;
    }
}
