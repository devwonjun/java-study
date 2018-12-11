
class DeckTest{
     public static void main(String args[]) {
        //System.out.println("test");
        Deck d = new Deck();
        Card2 c = d.pick(0);
        System.out.println(c);
        d.shuffle();			// 카드를 섞는다.
		c = d.pick(0);			// 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);        
    }
}

class Deck{
    final int CARD_NUM = 52;
    Card2 cardArr[] = new Card2[CARD_NUM];

    Deck(){
        int i =0;

        for (int k=Card2.KIND_MAX; k>0; k--) {
            for(int n =0; n<Card2.NUM_MAX; n++) {
                cardArr[i++]  = new Card2(k , n+1);
            }
        }
    }

    Card2 pick(int index){
        return cardArr[index];
    }

    Card2 pick(){
        int index = (int)(Math.random()* CARD_NUM);
        return pick(index);
    }

    void shuffle(){
        for (int i=0; i <cardArr.length; i++){
            int r = (int)(Math.random()* CARD_NUM);
            Card2 temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }    

}



class Card2 {
    static final int KIND_MAX =4;
    static final int NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card2() {
        this(SPADE, 1);
    }

    Card2(int kind , int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String[] kinds  = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "kind : "+ kinds[this.kind]+", number : "+ numbers.charAt(this.number);
    } // end toString
} // end Card

