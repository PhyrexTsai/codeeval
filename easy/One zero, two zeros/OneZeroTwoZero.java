import java.io.*;
public class OneZeroTwoZero {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String zeros = line.split(" ")[0];
            String num = line.split(" ")[1];
            int count = 1;
            int result = 0;
            while(count <= Integer.parseInt(num)){
                char[] numStr = String.valueOf(binary(count)).toCharArray();
                int total = 0;
                int curr = 0;
                while(numStr.length > curr){
                    if(String.valueOf(numStr[curr]).equals("0")){
                        total++;
                    }
                    curr++;
                }
                count++;
                if(total == Integer.parseInt(zeros)){
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    public static Integer binary(int num){
        int count = 0;
        int curr = num;
        int result = 0;
        while(curr >= 1){
            result = (int)(result + (curr % 2) * Math.pow((double)10,(double)count));
            curr = Math.round(curr / 2);
            count++;
        }
        return result;
    }
}