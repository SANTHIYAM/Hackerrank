package techgig.Java;

import java.io.*;
public class keySpace {
    public static void main(String args[]) throws IOException {
        //Write code here
        BufferedReader input_reader=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the message string");
        String message=input_reader.readLine();
        //System.out.println("Enter the key");
        int key=Integer.parseInt(input_reader.readLine());

        String ciphertext="";
        int temp;

        for(char a : message.toCharArray()){
            temp=Character.getNumericValue(a)+key;
            if(temp>=10)
                temp=temp%10;
            ciphertext+=temp;
        }

        System.out.println(ciphertext);

    }

}
