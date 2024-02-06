import java.util.*;
public class AdvPatterns {
    public static void hollow_Rectangle(int totrows, int totcols){
        //outer loop
        for(int i=1; i<=totrows; i++){
            //inner loop
            for(int j=1; j<=totcols; j++){
                //where to print star 
                if(i == 1 || i == totrows || j == 1 || j == totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Inverted_Rotated_Half_Pyramid(int totrows, int totcols){
        for(int i = 1; i<=totrows; i++){
            //spaces
            for(int j =1 ; j<= totrows-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void FloydTri(int n){
        int counter =1;
        //outer loop = no of lines 
        for(int i = 1; i<=n; i++){
            //inner loop and what to print
            for(int j = 1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void ZOTriangle(int n){
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i;j++){
                if((i+j) % 2 ==0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n){
        //1st half
        for(int i = 1; i<=n; i++){
            //stars
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            for(int j =1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n; i>=1; i--){
             //stars
             for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            for(int j =1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_Rhombus(int n){
        for(int i =1 ;i<= n ; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            //hollow rectangle
                for(int j=1; j<=n; j++){
                    //where to print star 
                    if(i == 1 || i == n || j == 1 || j == n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void diamond(int n){
            //1st half
            for(int i=1 ; i<=n; i++){
                //spaces
                for(int j =1; j<=n-i ; j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //2nd half
            for(int i=n; i>=1; i--){
                //spaces
                for(int j =1 ; j<=n-i ; j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        hollow_Rectangle(5,5);
        Inverted_Rotated_Half_Pyramid(4,4);
        FloydTri(5);
        ZOTriangle(5);
        butterflyPattern(3);
        solid_Rhombus(4);
        hollow_Rhombus(4);
        diamond(4);
    }
    
}
