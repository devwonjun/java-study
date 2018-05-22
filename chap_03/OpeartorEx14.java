class OpeartorEx14 {

    // 문자열 반복문으로 출력하기
    public static void main(String args[]){

        char c = 'a';
        for (int i =0; i<26; i++){
            System.out.print(c++); // 소문자 A ~ Z
        }

        System.out.println();
        c ='A';
        for (int i=0; i<26; i++){
            System.out.print(c++); // 대문자 A ~ Z
        }
        System.out.println();
        c = '0'; 
        for(int i =0; i<10; i++){
            System.out.print(c++); // 0 ~ 9 
        }

        // 문자 코드 대문자와 소문자 간의 코드값 차이는 10진수로 32이다.
    }
}