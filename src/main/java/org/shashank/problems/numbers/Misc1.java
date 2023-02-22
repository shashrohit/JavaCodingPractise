package org.shashank.problems.numbers;

public class Misc1 {

    private static int findNoOfDigits(int number){
        int digitsCount=0;
        while(number!=0){
            digitsCount += 1;
            number = number/10;
        }
        return digitsCount;
    }

    public static boolean isArmstrong(int number){
        int digitsCount = findNoOfDigits(number);
        int temp = number,total = 0, digit;

        while(temp!=0){
            digit = temp % 10;
            total += Math.pow(digit, digitsCount);
            temp = temp /10;
        }
        return number == total;
    }

    public static boolean isBinary(int num){
        String numberString = String.valueOf(num);
        char[] charSequence = numberString.toCharArray();
        for(char c: charSequence){
            if(c != '1' && c != '0'){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number){
        int reverse = 0, temp = number;
        while(temp!=0){
            reverse = reverse*10 + temp%10;
            temp = temp / 10;
        }
        return reverse == number;
    }

    public static boolean isPerfect(int number){
        int total = 0;
        for(int i=1; i<number/2+1; i++){
            if(number%i == 0){
                total += i;
            }
        }
        return total == number;
    }

    public static boolean isPrime(int number){
        for(int i=2; i<number/2+1; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));

        System.out.println(isBinary(101011));

        System.out.println(isPalindrome(12121));

        System.out.println(isPerfect(6));

        System.out.println(isPrime(13));
    }
}
