package Variable;

public class sstings {
    public static void main(String[] args){
        String S1 = "Hello";
        String S2 = "Hello";
        System.out.print(S1.equals(S2));//It will check if the value is present in String pool constant in heap memory

        String S3 = new String("Hello");
        System.out.println(String.valueOf(S1 == S3));
        S1 = "Hello World";
        System.out.println(S1);
    }
}
