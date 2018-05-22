class OpeartorEx6{

    public static void main(String args[]){
        byte a = 10;
        byte b = 20;
        //byte c = a +b; // 오류 발생 java version 10 에서는 오류 발생 나지 않음 
        byte c = (byte)(a + b) ;
        
        System.out.println(c);

    }
}