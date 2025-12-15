package org.lessons.java.security;

// importo lo scanner per utilizzare la tastiera
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // dichiaro tutte le variabili
        String nome;
        String cognome;
        String colore;
        String password;
        int giorno;
        int mese;
        int anno;
        int somma;

        // creo uno Scanner per leggere l'input dell'utente dalla tastiera
        Scanner input = new Scanner(System.in);

        //stampo a schermo le stringhe e inserisco i dati
        System.out.println("Inserisci il nome");
        nome = input.nextLine();

        System.out.println("Inserisci il cognome");
        cognome = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        colore = input.nextLine();

        System.out.println("Inserisci il giorno di nascita");
        giorno = input.nextInt();

        System.out.println("Inserisci il mese di nascita");
        mese= input.nextInt();

        System.out.println("Inserisci l'anno di nascita");
        anno = input.nextInt();

        somma = giorno + mese + anno;

        System.out.println("La password generata è: ");
        // concateno tutto per creare la password
        password = nome + "-" + cognome + "-" + colore + "-" + somma;

        // stampo a schermo la password
        System.out.println(password);

        // chiudo la risorsa dell'input
        input.close();
    }
}
