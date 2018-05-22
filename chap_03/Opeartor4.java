class Opeartor4 {

    // 부호 연산자
    public static void main (String args[]){

        int i = -10;
        i = +i; // 부호 연산자 +> -
                // - > + 변환하여 반환 하는 예시 
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);
    
    }
}