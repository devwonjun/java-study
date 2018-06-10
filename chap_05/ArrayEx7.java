class ArrayEx7{

    public static void main(String[] args){
        int[] numArr  = new int[10];

        for(int i =0; i<numArr.length; i++){
            numArr[i] = i;
            System.out.print(numArr[i]);
        }

        System.out.println();
        /*

        for (int i = 0; i<100; i++) {
            int n = (int)(Math.random() *10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
            // numArr[0]의 값과 numArr[n] 값을 서로 변경한다
        }
        */

        for (int i = 0; i<numArr.length; i++) {
            int n = (int)(Math.random() *10);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
            // numArr[0]의 값과 numArr[n] 값을 서로 변경한다
        }        

        for (int i =0; i<numArr.length; i++){
            System.out.print(numArr[i]);
        }

    }
}