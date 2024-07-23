# Recursion Steps Counter 🚀

A Java program that uses recursion to count the number of steps needed to reduce a number to zero. The program performs operations based on whether the number is even or odd.

## 🧩 How It Works

- **Even Number**: Divide by 2
- **Odd Number**: Subtract 1

## 🖥️ Code

```java
public class Recursion_Steps_Counter {
    public static void main(String[] args) {
        int num = 14;  // Change this number to test with different inputs
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        return Helper(num, 0);
    }

    public static int Helper(int num, int c) {
        if (num == 0) {
            return c;
        }
        if (num % 2 == 0) {
            return Helper(num / 2, c + 1);
        }
        return Helper(num - 1, c + 1);
    }
}
