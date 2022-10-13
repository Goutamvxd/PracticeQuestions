import java.lang.reflect.Array;

/*
 * 
 * There are two types of fishes in a pond, A and B.
 * there are N fishes of type A numbered from 1 to N and M.
 * the following two methods are adopted by the fishes of type A to satisfy their hunger.

1)E1:Fish of typeA(n1) eats the fish of type B(n2).

2)E2:Fish of type A(n1) eats the fish of type A(n2) if size(n1)>size(n2).

In the above mentioned context,E1and E2 denote the respective methods and n1 and n2 are the fishes belonging to these types and Size(X) 
denotes the total number of fish within X.

Example:if size(L)=3 and size(K)=2 and L eats K then the resulting size(L) will be5.

It is feeding time now and the fishes are hungry.
theyeat as per the given method and satiate their hunger.
your task is to find and return an array defining whether which type A fishes do All type B fishes fall under.

Note: the size of all fishes initially is the same i.e,1.

Ex1:

i/p1:2

i/p2:3

i/p3:4

i/p4:{{1,1,1},{1,1,2},{1,2,3},{2,1,2}}

o/p:{1,1,1}

ex2:

i/p1:1

i/p2:1

i/p3:1

i/p4:{{1,1,1}}

o/p:{1} 
 */
public class Fishes {
public static void main(String[] args) {
	
}
public static int HungryFish(int infectedFishSize, int[] fishs)
{
    Array.sort(fishs);
    int moves = 0;

    for (int i = 0; i < fishs.length; i++)
    {
        if (fishs[i] < infectedFishSize)
        {
            infectedFishSize += fishs[i];
        }
        else
        {
            if (fishs[i] < (infectedFishSize + infectedFishSize - 1))
            {
                infectedFishSize += (infectedFishSize - 1);
                moves++;
            }
            else
            {
                moves += (fishs.length - i);
                break;
            }
        }
    }

    return moves;
}

}
