import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        String nome, pIVA, luogo, telefono, email,lingua, iban, nomeref, note;
        boolean risposta;
        byte tipologia;
        risposta=true;

        while(risposta)  {
            
        System.out.println("Definisci il fornitore");

        System.out.println("Categoria:");
        System.out.println("0 - Piante");
        System.out.println("1 - Vasellame");
        System.out.println("2 - Concime");
        System.out.println("3 - Giardinaggio");
        tipologia=sc.nextByte();
        TipologiaCategoria tipologiaCategoria = TipologiaCategoria.values()[tipologia]; 

        System.out.println("Nome:");
        nome=sc.nextLine();

        System.out.println("P.IVA:");
        pIVA=sc.nextLine();

        System.out.println("Luogo:");
        luogo=sc.nextLine();

        System.out.println("Numero di telefono:");
        telefono=sc.nextLine();

        System.out.println("Email:");
        email=sc.nextLine();

        System.out.println("Lingua:");
        lingua=sc.nextLine();

        System.out.println("Iban:");
        iban=sc.nextLine();

        System.out.println("Nome Referente:");
        nomeref=sc.nextLine();

        System.out.println("Note:");
        note=sc.nextLine();



     ///////////////////////////////////////SECONDA FASE//////////////////////////////////////////////

        System.out.println("Il fornitore che hai definito:");

        System.out.println("Nome:  " + nome);
        System.out.println("P.IVA:  " + pIVA);
        System.out.println("Luogo:  " + luogo);
        System.out.println("Numero di telefono:  " + telefono);
        System.out.println("Email:  " + email);
        System.out.println("Lingua:  " + lingua);
        System.out.println("IBAN:  " + iban);
        System.out.println("Nome referente:  " + nomeref);
        System.out.println("Note:  " + note);
        System.out.println("Note:  " + tipologiaCategoria);


        System.out.println("Vuoi inserire un altro fornitore? (true/false)" );
        risposta=sc.nextBoolean();
        sc.nextLine();

    }
    System.out.println("Grazie per aver usato il nostro servizio");
}
        }
