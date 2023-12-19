package basic;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.insert(0,"hi");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);
    }
}
