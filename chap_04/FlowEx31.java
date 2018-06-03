class FlowEx31 {

    public static void main(String[] args){
        for (int i=0; i<=10; i++){
            if(i%3==0){
                continue; //조건식이 참이 되면 실행 하여 블럭의 끝으로 이동한다.
            }
            System.out.println(i);
        }// 이곳으로 이동 함
    }
}