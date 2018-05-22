class OpeartorEx13 {

    public static void main(String args[]) {

        char c1 ='a';
        //char c2 - c1 + 1; 컴파일 오류 해당 코드 형식으로 사용 할 경우 7번 라인 코드로 변경하여 사용
        int sec = 60 * 60 * 24;
        char c2 = (char)(c1+ 1);
        //char c2 = 'a'+ 1;
        System.out.println("String: "+c2+ "Sec :"+ sec);
    }
}