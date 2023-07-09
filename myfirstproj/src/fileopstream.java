import java.io.*;
public class fileopstream {
    public static void main(String[] args) throws IOException{
            DataInputStream dis = new DataInputStream(System.in);
            // FileOutputStream fout = new FileOutputStream("C:/Users/HP/Desktop/New folder//1.txt");

            // System.out.println("Enter the data (@ at the end)");

            // char ch;
            // while((ch = (char)dis.read()) != '@'){
            //     fout.write(ch);
            // }
            // fout.close();

            char ch = dis.readChar();
            System.out.println(ch);
        }
  }
