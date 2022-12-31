//1. Lucky_Number
class Lucky_Number {
    public static void main(String[] args) {
        int num=180802;
        int temp=num, temp2=1;
        int count=0, sum=0, x;

        while (temp!=0) {
            temp=temp/10;
            temp2=temp2*10;
        }
        temp2=temp2/10;

        while (num!=0) {
            x=(num/temp2);
            num=num%temp2;
            temp2=temp2/10;
            count++;

            if(count%2==0){
                sum=sum+x;
            } 
        }

        if(sum%9==0){
            System.out.println("Boom It's Lucky Number");
        }else{
            System.out.println("Shit It's not A Lucky Number");
        }
    }
}