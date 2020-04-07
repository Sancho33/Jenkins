 */
 import java.util.Scanner;

/**
 * @author Benjamin
 *
 */
public class Parser {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        
        //D�claration de l'emplacement de mes fichiers
        String fichierJSON = "C:\\Users\\Benjamin\\eclipse-workspace\\MonParser\\src\\main\\resources\\log.json";
        String fichierHTML = "C:\\Users\\Benjamin\\eclipse-workspace\\MonParser\\src\\main\\resources\\log.html";
        

 

        //Permet de v�rifier si on continue de demander
        boolean bool = true;
        while (bool) {       
            //On demande l'extension
            String typeFichier = Parser.inputUser("Quel type de fichier ?");
            
            if (typeFichier.contentEquals("html")) {
                System.out.println("Traitement du fichier HTML en cours...");
                new ParserHTML(fichierHTML);
                bool = false;
            } else if (typeFichier.equals("json")) {
                System.out.println("Traitement du fichier JSON en cours...");
                new ParserJSON(fichierJSON);
                bool = false;
            } else {
                System.out.println("Veuillez r�essayer...");
            }
        }

 

    }
    
    //Cr�ation de la m�thode inputUser pour ne pas r�utiliser les 4 lignes de Scanner � chaque utilisation
    //On ne ferme pas le scanner car sinon le programme plante
    public static String inputUser(String message) {
         System.out.println(message);
         String input = "";
         Scanner scanner = new Scanner(System.in);
         input = scanner.nextLine();
         return input;
    }

 

}