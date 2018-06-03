import java.util.*;

class FlowEx8 {

    public static void main(String args[]){

        System.out.print("당신의 주민번호를 입력하세요.(011231-1111222) >");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char  gender = regNo.charAt(7); // 7번째 문자열 
        switch(gender){
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("주민번호가 틀립니다.");
                break;
        }
    }
}