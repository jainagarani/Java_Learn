package interview.walmart;
/*
THREAD-1
abcd
efg
zec

THREAD-2
abcd-> dcba
efg - > gfe


THREAD-3
dcba -> new.txt

 */

/*
1
	2 				2
3			-15			7
     	5.       5		   5                  5


10
4
-5
20

 non negative , current element > next element

1) size - going through all possible ways and then finding the max sum of it,
2) finding largest sum , going above and below finding the sum


Map <level , List<Node>>
Map<Integer (level), Integer (sum)
 */
public class ThreadRead {




}
