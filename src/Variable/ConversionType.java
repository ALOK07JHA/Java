package Variable;

public class ConversionType {

    public static void main(String[] args) {
        byte x = 10;
        int var = x;
        System.out.println(var);//automatically conversion

        int num = 12;
        byte byteVar = (byte) num;
        System.out.println(byteVar);

        byte a = 127;
        byte b = 1;
        byte sum = (byte) (a+b);
        System.out.println(sum);



    }
}
