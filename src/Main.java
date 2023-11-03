import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Logger log=Logger.getLogger(Main.class.getName());

        try {
            BufferedReader bf=new BufferedReader(new FileReader("File/topic.txt"));
            String str;
            String str2 = null;
            while ((str=bf.readLine())!=null){
                System.out.println(str);
                str2+=str;
            }   bf.close();
            System.out.println();

            String[] split = str2.split("\\s");
            System.out.println("Matinda "+split.length+" ta so'z bor");

            System.out.println();

            int max = 0;
            for (int i = 0; i <split.length ; i++) {
               max+=split[i].length();
            }
            System.out.println("O'rtacha so'z uzunligi "+max/ split.length+" ta");

        } catch (Exception e) {
            log.severe("Run time exeption bor!");
        }
        System.out.println();
    }
}