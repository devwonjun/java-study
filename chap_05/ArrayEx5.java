class ArrayEx5 {

    /*
      총합과 평균 값 
    */
    public static void main(String[] args){

        int sum =0;
        float average = 0f;
        int[] score = {100 , 88, 100, 100,90};
        for (int i =0; i<score.length; i++){
            sum+=score[i]; // 스코어 점수 더함
        }

        average = sum / (float)score.length; // 계산 결과물을 float 형태로 변환 하여 average 변수에 값 저장

        System.out.println("Total Score :"+ sum);
        System.out.println("Average :"+ average);
    }
}