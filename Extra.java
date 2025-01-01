// Program for Extraction of digit from the number 
public class Extra {
    
        public static void main (String args[]){
            int n=3457;
            while(n>0){
                int digit=n%10;
                System.out.println(+digit);
                n=n/10;
            }
        }
 }    

