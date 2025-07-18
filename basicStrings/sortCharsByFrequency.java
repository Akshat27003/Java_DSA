package basicStrings;

import java.util.*;

/*
You are given a string s. Return the array of unique characters, sorted by highest to lowest occurring characters.

If two or more characters have same frequency then arrange them in alphabetic order.


Examples:
(1)
Input : s = "tree"
Output : ['e', 'r', 't' ]
Explanation : The occurrences of each character are as shown below :
e --> 2
r --> 1
t --> 1.
The r and t have same occurrences , so we arrange them by alphabetic order.
(2)
Input : s = "raaaajj"
Output : ['a' , 'j', 'r' ]
Explanation : The occurrences of each character are as shown below :
a --> 4
j --> 2
r --> 1
(3)
Input : s = "bbccddaaa"
Output:
['a', 'b', 'c', 'd']

Constraints:
1 <= s.length <= 105
s consist of only lowercase English characters.

 */

// Helper Class to store int and char together. 
class Pair {
    int freq;
    char ch;

    Pair(int f, char c) {
        this.freq = f;
        this.ch = c;
    }
}

//
class Solution8 {
    // comparator operating on Pair type custom data.
    public static Comparator<Pair> getComparator() {
        // method called getComparator().
        // returns object of type Comparator<Pair>
        // i.e. a comparator that returns Integer values.
        return new Comparator<Pair>() {
            // the above line return new Comparator<Integer>()
            // creates a new object of anonymous class that implements the abstract method
            // compare of interface Comparator.
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.freq != p2.freq) {
                    return (p2.freq - p1.freq); // + if p2.freq is more. - if p1.freq is more.
                    // negative value means swap.
                }
                return (p1.ch - p2.ch); // + if p1.ch is more. - if p2.ch is more
            }

            // using lambda expression:
            // Arrays.sort(freq, (p1,p2) -> {
            // if(p1.freq != p2.freq) return (p1.freq-p2.freq);
            // return p2.ch-p2.ch;
            // });
            // This automatically takes p1 and p2 to be objects of Pair Class as we are
            // sorting freq array which itself stores Pair type data.
        };
    }

    public ArrayList<Character> sortChars(String s) {
        Pair[] freqArr = new Pair[26]; // frequency array to store frequency of char and the char itself.
        for (int i = 0; i < 26; i++) {
            freqArr[i] = new Pair(0, (char) (i + 'a'));
            // assigning ch in alphabetical order throughout the array of pair.
            // each index of freqArr is an object of Pair type custom data.
            // freqArr[i].freq -> gives int frequency throughout.
            // freqArr[i].ch -> gives char corresponding to the frequency mapped with
            // alphabetical position.
        }
        for (int i = 0; i < s.length(); i++) {
            freqArr[s.charAt(i) - 'a'].freq++; // updating freq with each occurrence of char
        }
        // sort arr in decreasing order of frequency. if freq same, sort in alphabetical
        // order.
        Arrays.sort(freqArr, getComparator()); // using custom comparator.
        ArrayList<Character> answer = new ArrayList<>(); // taking empty ArrayList.
        for (int i = 0; i < 26; i++) {
            if (freqArr[i].freq == 0) { // break out of loop on facing first char with 0 freq as it is sorted in
                                        // decreasing order.
                break; // all chars from this point will have 0 frequency only.
            }
            answer.add(freqArr[i].ch); // adding relevant char to answer ArrayList.
        }
        return answer;

    }
}

public class sortCharsByFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter string: ");
        s = sc.nextLine();
        Solution8 solution = new Solution8();
        ArrayList<Character> al = solution.sortChars(s);
        for (var i : al) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }

}
