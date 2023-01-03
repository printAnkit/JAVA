//3. RotateNumber
class RotateNumber {

    public static void main(String[] args) {
        int num, x, count = 0;
        int a = 1, b = 1;
        num=123456;
        x=2;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        x=x%count;
            if(x<0)
            x=x+count;


        for (int i = 1; i <= x; i++) {
            a = a * 10;
        }

        for (int i = 1; i <= (count - x); i++) {
            b = b * 10;
        }

        System.out.println(((num % a) * b) + (num / a));

    }
}