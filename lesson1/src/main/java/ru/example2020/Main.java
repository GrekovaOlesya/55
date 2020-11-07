package ru.example2020;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumByteShort((byte) 5, (short) 145));
        System.out.println(multIntLong(8, 181));
        System.out.println(getMaxNumber(45, 163));
        System.out.println(isCharA('C'));
        System.out.println(isCharNumber('1'));
        printBin();
        printIntValue();
        System.out.println(chatToInt('R'));
        System.out.println(intToChar(12543));
    }

    public static byte sumByteShort(byte byte_value, short short_value) {
        return (byte) (byte_value + short_value);
    }

    public static int multIntLong(int int_value, long long_value) {
        return (int) (int_value * long_value);
    }

        public static int getMaxNumber(int a, int b){
            return Math.max(a, b);
        }

        public static boolean isCharA(char a){
            return a == 'A';
        }

        public static boolean isCharNumber(char a){
            return Character.isDigit(a);
        }

        public static void printBin(){
            for(int i=0; i<=30; i++)
            {
                System.out.println(Integer.toBinaryString(i));
            }
        }

        public static void printIntValue(){
            System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        }
        public static int chatToInt(char char_value){
            return char_value;
        }

        public static char intToChar(int int_value){
            return (char)int_value;
        }
    }