package bit.com;

import java.util.Scanner;

    class allInfo{
        int bitDigit;
        int pos;

        Scanner sc= new Scanner(System.in);
        public void takingInput(){
            System.out.print("Enter your bit here :");
            bitDigit =sc.nextInt();
            System.out.print("Enter your bit position :");
            pos = sc.nextInt();
        }

        //GET BIT SECTION
        public void getBit(){
            takingInput();
            int bitMask = 1 << pos;
            if( (bitMask & bitDigit)==0){
                System.out.println("Curret bit is zero.");
            }
            else {
                System.out.println("Current bit is one.");
            }
        }

        //SET BIT SECTION
        public void setBit(){
            takingInput();
            int bitMask = 1 << pos;
            int newSetNumber = bitMask | bitDigit;
            System.out.println("After set bit current bit in decimal is  :"+newSetNumber);
            System.out.println("After set bit current bit in binary is  :"+Integer.toBinaryString(newSetNumber));

        }

        //CLEAR BIT SECTION

        public void clearBit(){
            takingInput();
            int bitMask = 1<<pos;
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & bitDigit;
            System.out.println("After clear a bit current bit in decimal is :"+newNumber);
            System.out.println("After clear a bit current bit in binary is :"+Integer.toBinaryString(newNumber));
        }

        //UPDATE BIT SECTION

        public void updateBit(){
            takingInput();
            System.out.println("For update a bit you have to select a operation : \ni.e 1. set 2. clear ");
            System.out.print("Enter your operation :");
            int oper = sc.nextInt();
            int bitMask = 1 << pos;
            if (oper == 1){
                //set bit
                System.out.print("Enter your bit position :");
                pos = sc.nextInt();
                 bitMask = 1 << pos;
                int newUpNumber = bitMask | bitDigit;
                System.out.println(" new bit set bit in decimal is :"+" "+newUpNumber);
                System.out.println(" new bit set bit in binary is :"+" "+Integer.toBinaryString(newUpNumber));
            }else {
                //clear bit
                System.out.print("Enter your bit position :");
                pos = sc.nextInt();
                bitMask = 1 << pos;
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & bitDigit;
                System.out.println("After clear a bit current bit in decimal is :"+newNumber);
                System.out.println("After clear a bit current bit in binary is :"+Integer.toBinaryString(newNumber));
            }


        }

        public void selectOperation(){
            System.out.println("Select your bit manipulation option :\n 1. get bit , 2. set bit , 3. clear bit , 4. update bit");
            System.out.print("Enter your option here :");
            int selectOper = sc.nextInt();
            switch (selectOper) {
                case 1 -> getBit();
                case 2 -> setBit();
                case 3 -> clearBit();
                case 4 -> updateBit();
                default -> System.out.print("404 not found");
            }
        }

    }


public class manipulation {
    public static void main(String[] args) {
      allInfo allin = new allInfo();
      allin.selectOperation();
    }
}

