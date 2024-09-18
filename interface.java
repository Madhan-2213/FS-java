class phone{
    void makecall(){
        System.out.println("Make a call.....");
    }
}
interface camera{
    void takephoto();
}
class smartphone extends phone implements camera{
    smartphone(){
        super();
    }
   public void takephoto(){
        System.out.println("Taking a photo with Smartphone............");
    }
    void internet(){
        this.takephoto();
    }
}
class iphone extends smartphone{
    void makecall(){
        super.makecall();
    }
     void userfaceid(){
        System.out.print("Using faceid to unlock the iphone");
    }
}

class Main{
    public static void main(String[] args){
       iphone myphone = new iphone();
       myphone.makecall();
       myphone.internet();
       myphone.userfaceid();

}}
