package hakerrank.daysOfCode30;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Given a base-10 integer, n, convert it to binary (base-2).
 Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.


 Ты смотришь
If (list. Get(i) ==1) count++
Else
Просто нужно найти последовательность
Находишь первую единицу и прибавляешь пока не встретишь 0
Как встретила 0, значит последовательность оборвалась
И нужно сравнить с максимальной


Ты бежишь по циклу
Как только встретила 0, то логично, что последовательность закончилась
Обычный for тут
 */
public class Day10_BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> bitSeq = new ArrayList<>();

        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            bitSeq.add(remainder);
        }
        int maxSubSequence = 0;
        int count = 0;

        for (int b : bitSeq) {
            if (b == 1) {
                count++;
            } else {
                maxSubSequence = Math.max(maxSubSequence, count);
                count = 0;
            }
        }

        maxSubSequence = Math.max(maxSubSequence, count);
        System.out.println(maxSubSequence);

    }
}
