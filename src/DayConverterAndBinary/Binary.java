package DayConverterAndBinary;

public class Binary {
    static String getBinary(int number) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index <= 31; index++) {
            sb.append(number & 1);
            number /= 2;
            if (index != 31 && (index + 1) % 8 == 0) {
                sb.append(" ");
            }
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        int[] arr = {-2, 2, 127, 32456, -53672};
        for (int num : arr) {
            System.out.println("Number = " + num + "; binary = " + Binary.getBinary(num) + ";");
        }
    }
}
