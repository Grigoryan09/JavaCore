package example.clasBox;

public class OverloadCons {
    static void main(String[] args) {

        Box mybox1 = new Box(10, 15, 20);
        Box mybox2 = new Box(7);
        Box mycube = new Box();

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объёь mybox1 равно " + vol);
        vol = mybox2.volume();
        System.out.println("Объёь mybox2 равно " + vol);
        vol = mycube.volume();
        System.out.println("Объёь куба равно " + vol);
        vol = myclone.volume();
        System.out.println("Объёь клона равно " + vol);

    }
}
