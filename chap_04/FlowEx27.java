import java.util.*;

class FlowEx27 {

    public static void main(String[] args){

        int num;
        int sum =0;
        boolean flag = true;
        System.out.println("합계를 구할 숫자를 입력하세요. (끝 내려면 숫자 0을 입력)");

        while(flag) { // flag 값이 true 이므로 반복문 실행
            System.out.print(">>");

            Scanner scanner = new Scanner(System.in);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num!=0){ // 입력 값이 0 이 아니면 계속 더함
                sum+=num;
            } else { // 0 인 경우 false 로 전환 되며 반복문 탈출
                flag = false;
            }

        }
        System.out.println("합계:"+sum);


    }
}