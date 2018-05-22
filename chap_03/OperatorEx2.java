
class OperatorEx2 {
    // 증감 연산자2
    public static void main (String args[]){
        int i =5;
        int j = 0;

        j  = i++;  // 대입 후 증가
        System.out.println("j= i++;  실행 후, i="+ i + ", j ="+ j);
        
        i = 5;
        j = 0;
        j = ++i; // 증가 후 대입
        System.out.println("j=++i; 실행 후 i="+ i +", j="+j);
        

    }
}
