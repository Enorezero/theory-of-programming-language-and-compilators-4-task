import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Language language = new Language();

        try {
            ArrayList<String> l1 = language.fill();
            ArrayList<String> l2 = language.fill();
            ArrayList<String> l1l2 = language.concatanateLanguages(l1,l2);
            for(String chain : l1l2) System.out.println(chain);
        } catch (ExceedChainsAmountException e) {
            throw new RuntimeException(e);
        } catch (ExceedLengthOfChainException e) {
            throw new RuntimeException(e);
        }

    }


}