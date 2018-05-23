
import java.util.*;

class OpeartorEx25{

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        char ch =' ';
        System.out.printf("input......>");
        
        String input =  scanner.nextLine();
        ch = input.charAt(0);

        if ('0'<= ch && ch <='9'){
            System.out.printf("Num %n");
        }

        if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')) {
            System.out.printf("Eng %n");
        }
        scanner.close();// jdk 1.5 + 부터 외부 클래스를 나타내는 것으로 간주되어 필요 없는 경우 close 해주어야 함.
        

    }
}