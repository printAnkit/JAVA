//2. Reverse_Number
class Reverse_Number{
    
    public static void main(String[] args) {
        int num=987654321, sum=0, count=1;
        int temp=num;
        while (temp!=0) {
            temp=temp/10;
            count=count*10;
        }
        count=count/10;
        
        while(num!=0){
            sum=sum+((num%10)*count);
            count=count/10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
