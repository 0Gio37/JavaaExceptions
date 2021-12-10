package fr.exceptions;

import fr.exceptions.listException.AgeCapException;
import fr.exceptions.listException.DivisionZero;
import fr.exceptions.listException.IntegerException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExoExecption {

    public static int divisionByZero(int a, int b) throws DivisionZero {
        if(b == 0){
            throw new DivisionZero();
        } else{
            int sum;
            return sum = a/b;
        }
    }
    public static void getAgeCap() throws AgeCapException{
        int i=0;
        while(i>=0){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("entre un age ?");
                int val = scanner.nextInt();
                if (val < 18 || val > 65) {
                    i++;
                    throw new AgeCapException(val, i);
                } else {
                    System.out.println("age = "+val);
                }
            }catch (InputMismatchException e){
                if(e.getMessage() == null){
                    System.out.println("rentrer un entier");
                }
            }
            }
        }

}
