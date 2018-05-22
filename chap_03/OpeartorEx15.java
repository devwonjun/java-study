
class OpeartorEx15 {

    public static void main (String args[]){
        
        /*
        char lowerCase = 'a'; // 대문자
        char upperCase = (char) (lowerCase -32); // 대문자
        */

        char lowerCase = 'A'; // 소문자
        char upperCase = (char) (lowerCase +32); // 소문자


        //System.out.println(upperCase);
        // 연산 처리 후 형변환 (int -> char) 하는것 필수

        for (int i = 0; i<26; i++){
            System.out.print(upperCase++);
        }

    }
}