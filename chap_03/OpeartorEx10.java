
class OpeartorEx10{

    public static void main(String args[]){

        int a = 1000000;
        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d%n", a,a,a , result1);//계산 방식(연산 순서)에 따라서 결과 값이 다르게 나온다 -727
        System.out.printf("%d / %d * %d = %d%n", a,a,a, result2); // 1000000 (정상 결과)
    }
}