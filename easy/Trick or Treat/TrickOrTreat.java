import java.io.*;
public class TrickOrTreat {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] words = line.split(", ");
            int count = 0;
            int children = 0;
            int candies = 0;
            while(words.length > count){
                String num = words[count].split(": ")[1];
                int p = Integer.parseInt(num);
                if(count == 0){
                    children += p;
                    candies += p * 3;
                }else if(count == 1){
                    children += p;
                    candies += p * 4;
                }else if(count == 2){
                    children += p;
                    candies += p * 5;
                }else{
                    candies = candies * p;
                }
                count++;
            }
            System.out.println(Double.valueOf(Math.floor(candies / children)).intValue());
        }
    }
}
