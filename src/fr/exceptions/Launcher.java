package fr.exceptions;
import fr.exceptions.listException.AgeCapException;
import fr.exceptions.listException.ListEmptyException;

import java.util.*;

public class Launcher {

    private static final List<Country> countryList = new ArrayList<>();

    public static void addCountry(Country country){
        countryList.add(country);
    }
    public static void displayCountryList() throws ListEmptyException {
        /*
        countryList.stream().forEach(new Consumer<Country>() {
            @Override
            public void accept(Country country) {
                System.out.println(country.getName());
            }
        });
         */
        if (countryList.isEmpty()){
            throw new ListEmptyException();
        }else{
            System.out.println("La collection contient "+countryList.size()+" pays");
            for (Country item : countryList){
                System.out.println(" - "+item.getName());
            }
        }
    }
    public static void removeAll(){
       countryList.clear();
    }
    public static void modifOneElement(){
        Scanner scanner = new Scanner(System.in);
        try {
            Launcher.displayCountryList();
        } catch (ListEmptyException e) {
            e.printStackTrace();
        }
        System.out.println("Quel pays voulez-vous modifier ?");
        String countrySelected = scanner.next();
        System.out.println("Tapez votre modification");
        String countryUpdated = scanner.next();
        for (Country item : countryList){
            if(countrySelected.equals(item.getName())){
                int currentIndex = countryList.indexOf(item);
                Country newCountry = new Country(countryUpdated);
                countryList.set(currentIndex,newCountry);
            }
        }
        System.out.println("Voici la liste modifiée :");
        try {
            Launcher.displayCountryList();
        } catch (ListEmptyException e) {
            e.printStackTrace();
        }
    }
    public static void sortElement(){
        Collections.sort(countryList, Country.sortByName);
        System.out.println("Classement par order alphabétique :");
        for (Country item : countryList){
            System.out.println(" - "+item.getName());
        }
    }

    public static void main(String[] args) throws AgeCapException {

        //exo2 part2
        //try {
            ExoExecption.getAgeCap();
        //} catch (AgeCapException e) {
           // e.printStackTrace();}





        //exo1 part 2
        /*
        try {
            System.out.println(ExoExecption.divisionByZero(1,0));
        } catch (DivisionZero e) {
            System.out.println(e);
        }finally {
            try {
                System.out.println("Il sera donc remplacé par 1 avec comme résultat "+ExoExecption.divisionByZero(1,1));
            } catch (DivisionZero e) {
                e.printStackTrace();
            }
        }
        */

        /*
        //exos part 1
        Country france =  new Country("France");
        Country italie =  new Country("Italie");
        Country allemagne =  new Country("Allemagne");
        Country portugal =  new Country("Portugal");
        Country espagne =  new Country("Espagne");
        Country suisse =  new Country("Suisse");
        Launcher.addCountry(france);
        Launcher.addCountry(italie);
        Launcher.addCountry(allemagne);
        Launcher.addCountry(portugal);
        Launcher.addCountry(espagne);
        Launcher.addCountry(suisse);


        try {
            Launcher.displayCountryList();
        } catch (ListEmptyException e) {
            e.printStackTrace();
        }
        Launcher.sortElement();
        Launcher.displayCountryList();
        Launcher.removeAll();
        Launcher.displayCountryList();
        Launcher.modifOneElement();

 */
    }
}
