// int arr[] = {2,5,8,9,10,12}
//int index=2 int x =7
// Return arr[]= {2,5,7,8,9,10,12}

package Arrays;
import java.util.*;

public class InsertAtKthIndex {

    public static void Insert(ArrayList<Integer> al,int index,int item)
    {
      al.add(index,item);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al =  new ArrayList<Integer>();
        al.add(2);
        al.add(5);
        al.add(8);
        al.add(9);
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int item = sc.nextInt();
        Insert(al, index, item);
        System.out.println(al);
        sc.close();
    }
}
