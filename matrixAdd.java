import java.util.Scanner;

class matrixAdd {
    
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("hello");
    System.out.println("Please enter the number of rows for matrix: ");
    int a = sc.nextInt();
    System.out.println("Please enter the number of columns for matrix: ");
    int b = sc.nextInt();
    int arr[][]=new int[a][b];
    for(int i=0; i<a; i++){
        for(int j =0;j<b; j++){
            arr[i][j]=sc.nextInt();
        }
        System.out.println();

    }

    for(int i=0; i<a;i++){
        for(int j=0; j<b;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }


   } 
    
}
