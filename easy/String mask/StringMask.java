import java.io.*;
public class StringMask {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            char[] words = line.split(" ")[0].toCharArray();
            char[] binarys = line.split(" ")[1].toCharArray();
            int count = 0;
            String output = "";
            while(words.length > count){
                if(binarys[count] == '1'){
                    output += String.valueOf(words[count]).toUpperCase();
                }else{
                    output += String.valueOf(words[count]);
                }
                count++;
            }
            System.out.println(output);
        }
    }
}