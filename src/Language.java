import java.util.ArrayList;
import java.util.Scanner;

public class Language {
    public ArrayList<String> fill() throws ExceedChainsAmountException, ExceedLengthOfChainException {
        System.out.println("Введите количество цепочек в языке: ");
        Scanner scanner = new Scanner(System.in);
        int chainsAmount = scanner.nextInt();
        ArrayList<String>language = new ArrayList<>();
        if(chainsAmount <= 10000){
            for (int i = 0; i < chainsAmount;i++){
                String chain = scanner.next();
                if(chain.length() <= 100){
                    language.add(chain);
                }
                else {
                   throw new ExceedLengthOfChainException("Превышена максимальная длина цепочки");
                }
            }
        }
        else {
            throw new ExceedChainsAmountException("Превышено максимальное количество цепочек в языке");
        }
        return language;
    }

    public ArrayList<String> concatanateLanguages(ArrayList<String>firstLanguage, ArrayList<String>secondLanguage){
        ArrayList<String>concatenatedLanguage = new ArrayList<>();
        if(!firstLanguage.isEmpty() && !secondLanguage.isEmpty()){
            for (String chainFromFirstLanguage : firstLanguage){
                for(String chainFromSecondLanguage : secondLanguage){
                    concatenatedLanguage.add(chainFromFirstLanguage + chainFromSecondLanguage);
                }
            }

        }
        else if(firstLanguage.isEmpty()){
            return secondLanguage;
        }
        else{
            return firstLanguage;
        }
        return concatenatedLanguage;
    }
}
