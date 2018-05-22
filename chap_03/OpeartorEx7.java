class OpeartorEx7 {
    // 산술 연산자 형 변환되어 결과 값 손실이 있다.
    public static void main(String args[]) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        System.out.println(c);

    }
}