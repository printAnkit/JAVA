//5. Armstrong_Number
class Armstrong_Number{

    public static int pow(int x,int power) {
        int z=1;
        while (power!=0) {
            z=z*x;
            power--;
        }
    return z;
    }

    public static void main(String[] args) {

        int n=54748 , power=0;
        int temp=n,x=n, sum=0;

        while (temp!=0) {
            temp/=10;
            power++;
        }

        while (x!=0) {
            sum=sum+pow(x%10,power);
            x/=10;
        }
        if (sum==n) {
            System.out.println("Boom It's Armstrong number");
        }else{
            System.out.println("Shit It's not Armstrong Number");
        }
        
    }
}
