package example.clasBox;

public class BoxDemo {
    static void main(String[] args) {

        Box mybox = new Box(10,15,18);
        Box mybox1 = new  Box(2,8,9);

        double vol;
         vol = mybox1.volume();
        System.out.println(vol);
         vol = mybox.volume();
        System.out.println(vol);
    }
}
