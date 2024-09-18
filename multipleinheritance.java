interface camera{
    void takephoto();
}
interface GPS{
    void usegps();
}
class smartphone implements camera,GPS{
    public void takephoto(){
        System.out.println("Photo shooting");
    }
    public void usegps(){
        System.out.println("Use GPS");
    }
    void performAction(){
        this.takephoto();
        this.usegps();
    }
}

public class Main {
	public static void main(String[] args) {
	smartphone urphone = new smartphone();
	urphone.performAction();
	}
}
