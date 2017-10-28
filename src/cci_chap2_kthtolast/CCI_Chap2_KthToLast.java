/*
    Return Kth to Last: Implement an algorithm to find the kth to last element 
    of a singly linked list.

    1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11 -> 12 -> 13
                   ^
                                                                   ^
    findKthToLast(list, 5) = 8
 */
package cci_chap2_kthtolast;

import java.util.LinkedList;

/**
 *
 * @author Ali
 */
public class CCI_Chap2_KthToLast 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        
        System.out.println(kthToLast(list, 5));
    }
    
    private static int kthToLast(LinkedList<Integer> list, int k)
    {
        if (k > list.size())
            return -1;
        
        int actualVal = 0;
        int i = 0;
        int index = 0;
        while (i < list.size())
        {
            if (i < k)
            {
                i++;
            }
            else
            {
                actualVal = list.get(index);
                i++;
                index++;
            }
        }
        
        return actualVal;
    }
}
