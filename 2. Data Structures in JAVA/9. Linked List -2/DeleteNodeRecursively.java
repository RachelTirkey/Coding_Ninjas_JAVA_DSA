/*
Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
 Note :
Assume that the Indexing for the linked list always starts from 0.

No need to print the list, it has already been taken care. Only return the new head to the list.
 input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains a single integer depicting the value of 'i'.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M

Time Limit:  1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9
Sample Input 2 :
2
30 -1
0
10 20 30 50 60 -1
4
Sample Output 2 :
10 20 30 50 
 */




 public class DeleteNodeRecursively {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
//         if(head==null)
//             return head;
//         if(pos==0)
//             return head.next;
//         head.next=deleteIthNodeRec(head.next,pos-1);
//         return head;
        
        
        
        
		// if(head==null&& position>0)
		// {
		// 	return head;
		// }
		// if(position==0)
		// { 
		// 	if(head==null) //incase of a LL of length 5 if position =5 then this if will handle the null pointer exception
		// 		return head;
		// 	else
		// 		return head.next;
		// }
		// LinkedListNode<Integer>next=delete(head.next, position-1);
		// head.next=next;
		// return head;
        
       
        
        if (head == null)
        {
            return head;
        }
        
        if (pos==0)
        {
            head=head.next;
            return head;
        }
        else
        {
            LinkedListNode<Integer> smallerHead=deleteNodeRec(head.next,pos-1);
            head.next=smallerHead;
            return head;
        }  
        
        
	}

}