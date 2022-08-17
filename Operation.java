import java.util.*;
public class Operation{
    public static int cannibalNumber(int n){
        //base case
        if(n==0){
            return 0;
        }
        
        //logic
        String num=Integer.toBinaryString(n);
        int i=0;
        while(i+1<num.length()){
        char p=num.charAt(i);
        char q=num.charAt(i+1);
        if(p=='1'){
            if(q=='1'){
                return cannibalNumber(n+1);
            }
            else{
                return n;
            }
        }
        i++;
        }
        return cannibalNumber(n+1);
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);        
         int n=sc.nextInt();
       System.out.println(cannibalNumber(n));
    }
}

