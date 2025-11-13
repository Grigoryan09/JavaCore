package homework.braceChecker;

public class BraceCheckerTest {

    static void main(String[] args) {

        String text = "((([{helo}}}]";
        BraceChecker bC = new BraceChecker(text);
        bC.check();

    }
}
