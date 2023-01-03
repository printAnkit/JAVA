//4. Prime_Number
class Prime_Number{

    public static void main(String[] args) {
        int n, check = 0;
        n=1000000007;

        if ((n==0)||(n==1)) {
            System.out.println("Shit it's not Prime");
        }else{
                for (int i = 2; i < n; i++) {
                    if ((n % i) == 0)
                        check++;
                }

                if (check == 0) {
                    System.out.println("Boom it's Prime");
                } else {
                    System.out.println("Shit it's not Prime");
                }
        }
    }

}