class OpeartorEx12 {

    public static void main(String args[]){

        char c1 ='a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 +1; // a + 1 > 97 +1 = 98
        c3 = (char) (c1 + 1); // 97 + 1 = 98 > 98 : b
        c2++; // 97 > 97 + 1 : 98 > b
        c2++; // 98 > 98 + 1 : 99 > c

        System.out.println("i="+ i); // 98 : b 
        System.out.println("c2=" + c2); // c
        System.out.println("c3="+ c3); // b




    }
}