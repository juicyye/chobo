package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleInput {
    public static void main(String[] args) throws IOException {
        /*InputStream in = System.in; // 1바이트만 입력 가능

        byte[] a= new byte[3];
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);*/

        /*InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in); // 3바이트로 고정
        char[] a= new char[3];
        reader.read(a);

        System.out.println(a);*/

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);


    }
}
