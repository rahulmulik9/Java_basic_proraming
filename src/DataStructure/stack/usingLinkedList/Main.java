package DataStructure.stack.usingLinkedList;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter how many element you want to add");
        int size= sc.nextInt();
        lnkst ls=new lnkst();

        for(int i=0;i<=size-1;i++){
            System.out.println("Enter data "+i);
            int a=sc.nextInt();
            ls.push(a);
        }
        ls.display();


    }
}
