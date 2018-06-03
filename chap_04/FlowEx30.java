class FlowEx30 {

    public static void main(String[]  args){
        int sum = 0;
        int i = 0;

        while(true){
            if(sum > 100){
                break; // sum 값이 100 넘으면 중단
            }
            ++i;
            sum +=i;
        } // wnd while

        System.out.println("i = "+ i);
        System.out.println("sum="+ sum);

    }
}