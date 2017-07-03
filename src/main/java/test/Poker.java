package test;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class Poker {
    //牌的样式
    private String[] suite = {"黑桃", "红桃", "梅花", "方块"};

    //牌的点数
    private int[] fac = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    private Cards[] cardss;

    //构造器
    public Poker() {
        cardss = new Cards[52];
        for (int i = 0; i < suite.length; i++) {
            for (int j =0; j< fac.length; j++){
                cardss[i*13+j]=new Cards(suite[i],fac[j]);
            }
        }

    }

    //打乱牌的顺序
    public void shuffle(){
        for (int i =0,len = cardss.length;i<len;i++){
            int index = (int)(Math.random()*len);
            Cards temp = cardss[index];
            cardss[index] = cardss[i];
            cardss[i] = temp;
        }
    }

    //发牌的位置
    public Cards deal(int index){
        return cardss[index];
    }

    public class Cards {
        //花色
        private String suite;
        //点数
        private int fac;

        //构造器
        public Cards(String suite, int fac) {
            this.suite = suite;
            this.fac = fac;
        }

        @Override
        public String toString() {
            String facStr = "";
            switch (fac) {
                case 1:
                    facStr = "A";
                    break;
                case 11:
                    facStr = "J";
                    break;
                case 12:
                    facStr = "Q";
                    break;
                case 13:
                    facStr = "K";
                    break;
                default:
                    facStr = Integer.toString(fac);
                    break;
            }
            return suite + facStr;
        }

    }



}
