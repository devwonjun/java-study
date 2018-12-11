class Tv {
    boolean power;
    int channel;
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown(){
        --channel;
    }
} // end Tv

class CaptionTv extends Tv{
    boolean caption;
    void disPlayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
} // end CaptionTv


class CaptionTvTest{
    public static void main(String args[]){
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println("channel :"+ctv.channel); // 11
        System.out.println("caption: "+ctv.caption); //false
        ctv.disPlayCaption("Hello World");
        ctv.caption = true;
        System.out.println("caption: "+ctv.caption);
        ctv.disPlayCaption("Hellow World");
    }
}