package example.examples;

public class Switch {
    static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно единице.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                    System.out.println("i равно трём.");
                    break;
                default:
                    System.out.println("i болше трёх.");
            }
        }


        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осен";
                break;
            default:
                season = "вымышленным месецам";
        }
        System.out.println(season);
    }
}
