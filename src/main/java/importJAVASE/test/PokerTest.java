package importJAVASE.test;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class PokerTest {
    public static void main(String[] args){
        Poker poker = new Poker();
        poker.shuffle();


        Poker.Cards card = poker.new Cards("红桃",12);
       // System.out.println(card);
    }
}
