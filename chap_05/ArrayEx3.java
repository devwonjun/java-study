
class ArrayEx3 {

    public static void main(String[] args){

        int[]  arr =  new int[5];

        for (int i =0; i<arr.length; i++){

            arr[i] = i+1;
        }
        System.out.println("[Previous]");
        System.out.println("arr.length:"+arr.length);

        for (int i =0; i<arr.length; i++){
            System.out.println("arr["+i+"]:" + arr[i]);
        }

        int[] tmp = new int[arr.length*2];

        for(int i =0; i<arr.length; i++){
            tmp[i] = arr[i]; // tmp 배열에 arr 배열 값을 넣는다
        }

        arr = tmp; // arr 배열 변수의 값을 tmp 배열 변수 값으로 변경한다.
        System.out.println("[After this]");
        System.out.println("arr.length:"+arr.length);
        for (int i = 0; i<arr.length; i++){
            System.out.println("arr["+i+"]:"+arr[i]);
        }




        
    }
}