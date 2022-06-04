package DynamicProgramming;

public class Dynamic {
    public int dynamicFibonacci(int data) {
        int[] cache = new int[data+1];
        cache[0] = 0;
        cache[1] = 1;
        for (int index = 2; index < data + 1 ; index++) {
            cache[index] = cache[index -1]+cache[index-2];
        }
        return cache[data];
    }
}
