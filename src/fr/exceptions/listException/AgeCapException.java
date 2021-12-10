package fr.exceptions.listException;

public class AgeCapException extends Exception {

    private Integer val;
    private int i;

    public AgeCapException(Integer val, int i){
        this.val = val;
        this.i = i;
    }

    public String toString(){
        return "Essai N°"+i+" - La valeur saisie "+'"'+this.val+'"'+" n'est pas un nombre compris entre 18 et 65ans";
    }

}
