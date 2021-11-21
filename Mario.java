package adean4;

import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {
        System.out.println("Input Height");
        Scanner in = new Scanner(System.in);
        int Height = in.nextInt();
        for(int i=0;i<Height;i++){
            for(int j=0;j<Height;j++){
                if(j<Height-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
                }
        }



    }
