package fr.exceptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Launcher {

    private static final List<Country> countryList = new ArrayList<>();

    public static void addCountry(Country country){
        countryList.add(country);
    }
    public static void displayCountryList(){
        if (countryList.isEmpty()){
            System.out.println("Liste vide");
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
        Launcher.displayCountryList();
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
        Launcher.displayCountryList();
    }





    public static void main(String[] args) {
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
/*
        Launcher.displayCountryList();
        Launcher.removeAll();
        Launcher.displayCountryList();

 */

        Launcher.modifOneElement();
    }
}
