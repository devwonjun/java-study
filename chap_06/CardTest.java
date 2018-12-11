

class CardTest{

    public static void main (String args[]){
        System.out.println("Crard width :"+ Card.width);
        System.out.println("Card height :"+ Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind  = "Spade";
        c2.number = 4;

        System.out.println("c1 kind:"+c1.kind+"/ c1 number:"+ c1.number);
        System.out.println("c2 kind:"+c2.kind+"/ c2 number:"+ c2.number);

        System.out.println("c1 width , height changed." );
        c1.width = 50;
        c1.height = 80;


        System.out.println("c1 kind:"+c1.width+"/ c1 number:"+ c1.height);
        System.out.println("c2 kind:"+c2.width+"/ c2 number:"+ c2.height);



    }
}


class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}