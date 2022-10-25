package DataStructure.stack.usingArray;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Enter the Size of stack");
        int size=sc.nextInt();

        stck st=new stck(size);

        for(int i=0;i<size;i++) {
            System.out.println("Enter data");
            int a=sc.nextInt();
            st.push(a);
        }
        st.display();

    }
}
