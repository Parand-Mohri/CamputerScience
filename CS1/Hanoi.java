public class Hanoi{
    public static void main(String [] args){
        int b = 4 ;// number of disc that we want 
        hanoi(b ,1,2,3) ; // 1,2,3 are the number of stacks 1 is the first one, 2 is the second one and 3 is the third one.
    }
    public static void hanoi(int n, int i , int s , int t ) { // here "i" is initial rod, "s" is support rod and "t" is target rod
        if ( n ==1){ // move 1 disc from initial rod to target rod 
            System.out.println (" Move the top disk from stack "+ i + " to stack "+ t);
        }
        else if (n == 2){ // move 2 discs from initial rod to target rod.
            System.out.println (" Move the top disk from stack "+ i + " to stack "+ s );
            System.out.println (" Move the top disk from stack "+ i + " to stack "+ t);
            System.out.println (" Move the top disk from stack "+ s + " to stack "+ t);        
        }
        else {
  
                int x = s; // change the support rod to target rod and target rod to support 
                s = t;
                t = x; 
                hanoi ((n-1) ,i, s, t ); // call the the method again with new target and support for n-1

            x = s; //again change the support rod to target rod and target rod to support 
            s = t;
            t = x; 
            hanoi (1 ,i , s, t );/* here we call the method again but only for 1 disc because this disc is bigger than those 2
             that we already change and we want to put does two on this disc but in another stack */
            hanoi ((n-1), s , i , t);/* and we call the method again but this time we change the initial rod with support row 
            because now our discs are in support rod and we want to use initial rod as support */     
        }
    }
     
}