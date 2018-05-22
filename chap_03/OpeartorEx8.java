class OpeartorEx8{

    public static void main(String aggs[]){

        int a = 1_000_000;
        int b = 2_000_000;
        
        long c = a * b; // 값 손실 
        //이유 : int 형 + int 형 곱하기는 int 형 으로 저장됨으로 오류 발생 정상 값으로 반환 시 아래의 코드로 변환 해야 함.
        //long c = (long)a * b;
        
        System.out.println(c);

    }
}