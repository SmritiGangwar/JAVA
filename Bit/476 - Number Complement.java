/*
Num + Complement = All 1's
So, Complement = All 1's - Num

Example :
num = 5 = 101
complement = 2 = 010

101 + 010 = 111
101 + complement = 111
So, complement = 111 - 101
= 010
*/

class Solution {
    public int findComplement(int num) {
    int n = 0;
        while (n < num) {
            n = (n << 1) | 1;
        }
        return n - num;
    }
}
