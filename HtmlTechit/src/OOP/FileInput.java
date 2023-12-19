package OOP;

import java.io.*;

public class FileInput {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream output = new FileOutputStream("c:/out.txt"); // 파일생성 String -> Byte변환 귀찮음
        for (int i = 0; i < 11; i++) {
            String data = i +"번째 줄입니다. \r\n";
            output.write(data.getBytes());
        }
        output.close();*/

        /*FileWriter fw = new FileWriter("c:/out.txt");
        for (int i = 0; i < 11; i++) {
            String data = i+"번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();*/

        PrintWriter pw = new PrintWriter("c:/out.txt");
        for (int i = 0; i < 11; i++) {
            String data = i+"번째 줄입니다."; // \r \n 안써도 println으로 알아서 개행됨
            pw.println(data);
        }
        pw.close();

        FileWriter fw2 = new FileWriter("c:/out.txt",true); // 추가할때
        // PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt",true)); printwriter에서 추가하고 싶을때
        for (int i = 11; i < 21; i++) {
            String data = (i+"번째 줄입니다. \r \n");
            fw2.write(data);
        }

        byte[] b = new byte[1024]; // byte배열을 이용해서 읽는 방법
        FileInputStream input = new FileInputStream("c:/out.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();

        BufferedReader br = new BufferedReader(new FileReader("c:/out.txt"));
        while(true){
            String line = br.readLine();
            if(line == null) break; // 더 이상 읽을 라인이 없을 경우 break
            System.out.println(line);
        }
    }
}
