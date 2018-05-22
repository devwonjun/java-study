
class OpeartorEx11 {

    public static void main(String args[]){
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d, a, a -a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c' = %d%n", a ,(int)a);
        System.out.printf("'%c' = %d%n", d ,(int)d);
        System.out.printf("'%c' = %d%n", zero, (int)zero);
        System.out.printf("'%c' = %d%n", two, (int)two);
        // 유니코드(정수) 값으로 사칙 연산 가능한 예제이며, 문자 '2'의 유니코드를 숫자로 변경 하고 싶은 경우 '0' 을 빼주면된다.
        // 문자 '2'의 유니코드 값은 50 이고 유니코드 0 값은 2 이기 때문에 48이 된다. // 48 코드 숫자 0
        // 책 102  page 표 참조

    }
}