package fr.exceptions.listException;

import java.util.InputMismatchException;

public class IntegerException extends InputMismatchException {

    public String toString(){
        return " Merci de rentrer un nombre entier";
    }
}
