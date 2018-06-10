
class ArrayEx4{

    public static void main(String[] args){

        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};

        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc , 0 , result , 0 , abc.length); // result 배열 변수에 abc 배열 변수 값 저장
        System.arraycopy(num , 0, result , abc.length, num.length); // result 배열 변수에 abc 배열 길이 다음 부터 num 배열 길이만큼 값 넣기
        System.out.println(result);

        System.arraycopy(abc , 0, num , 0 , abc.length);
        System.out.println(num); // num 배열 변수에 첫 번째 부터 abc 배열 변수 값 추가하기

        System.arraycopy(abc, 0,num, 6, 3);
        System.out.println(num); // num 배열 변수에 abc 배열 변수의 값을 6번째에서 3자리 길이 만큼 값 넣기
    }
}