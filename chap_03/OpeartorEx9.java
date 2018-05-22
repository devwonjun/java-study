class OpeartorEx9{

    public static void main(String args[]){        
        long a = 1_000_000 * 1_000_000; // int 형 오버플로우 발생 하여 값 손실
        long b = 1_000_000 * 1_000_000L; // long 형 데이터로 정상 값 출력

        System.out.println("a="+a);
        System.out.println("b="+b);
    
    }

}