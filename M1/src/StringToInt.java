public class StringToInt {

    public static void main(String[] args) {
        checkIntegers(args);
    }

    static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return false;
        }
        return true;
    }

    static int parseInt(String str) {
        int num = 0, total = 0;
        for (int i = 0; i < str.length(); i++) {
            num = str.charAt(i) - '0';
            total = total * 10 + num;
        }
        return total;
    }

    static void checkIntegers(String[] str) {
        int intAmount = 0, nonIntAmount = 0, sum = 0;
        for (int i = 0; i < str.length; i++) {
            if (isInteger(str[i])) {
                intAmount++;
                sum += parseInt(str[i]);
            } else
                nonIntAmount++;
        }
        System.out.println("Encontrei " + intAmount + " termos inteiros");
        System.out.println("Encontrei " + nonIntAmount + " termos não inteiros");
        System.out.println("Somatorio dos inteiros: " + sum);
    }

}