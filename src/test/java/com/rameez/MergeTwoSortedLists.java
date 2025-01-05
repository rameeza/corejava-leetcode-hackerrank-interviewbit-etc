package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLists {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if ((list1 == null) && (list2 == null)){
            return null;
        }else if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else{
            ListNode ptr1 = list1;
            ListNode ptr2 = list2;
            ListNode answer = null;

            if (ptr1.val < ptr2.val){
                answer=new ListNode(ptr1.val);
                ptr1=ptr1.next;
            }else{
                answer=new ListNode(ptr2.val);
                ptr2=ptr2.next;
            }

            ListNode curNode = answer;
            while ((ptr1 != null) && (ptr2 != null)){
                ListNode n = null;
                if (ptr1.val < ptr2.val){
                    n = new ListNode (ptr1.val);
                    ptr1 = ptr1.next;
                }else {
                    n = new ListNode (ptr2.val);
                    ptr2 = ptr2.next;
                }
                curNode.next = n;
                curNode = n;
            }

            ListNode append = ptr1==null ? ptr2 : ptr1;
            curNode.next = append;
            // no need to run the below commented code. we can just use the existing nodes (shown above) instead of creating the new ones. when using the below code instead of the line above, all test cases fail due to higher memory usage.
            /*
            while (append != null){
                ListNode n = new ListNode(append.val);
                curNode.next = n;
                curNode = n;
            }
            */
            return answer;
        }

    }
    @Test
    public void main() {

    }
}