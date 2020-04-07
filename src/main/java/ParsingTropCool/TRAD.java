package ParsingTropCool;

//import java.io.File;
//import java.nio.charset.Charset;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.util.Scanner;

public class TRAD {
	
		public static void main(String [] args) {
			
			//@Emplacement du fichier logjson
			String logjson = "C:\\Users\\Alexis - Epsi\\eclipse-workspace\\20190722\\src\\main\\resources\\log.json";
			//String loghtml = "C:\\Users\\Alexis - Epsi\\eclipse-workspace\\20190722\\src\\main\\resources\\log.html";

			
	        String form = TRAD.saisieUtil("Quel format de données voulez-vous traduire ? ");
			//@Gestion d'erreurs au niveau de la réponse pour la question format
	        if (form.contentEquals("json") || form.contentEquals("JSON"))
	        {
	        	new ParserJSON(logjson);

	            /*System.out.print("Quel Attribut souhaitez-vous voir ? ");
	            Scanner demandeatt = new Scanner(System.in);
	            String att = demandeatt.nextLine(); 
	            demandeatt.close();
	            System.out.println("CA ROULE");*/
	        }
	        // @GEstion HTML pas créée
	        
	        /*else if (form.contentEquals("HTML") || form.contentEquals("html")
	        {
	        	new ParserHTML(loghtml);
	        }*/
	        else
	        {
	        	System.out.println("Format invalide");
	        }
		}
		
		//@Génération de la demande utilisateur
		protected static String saisieUtil(String message)
		{
			System.out.println(message);
			Scanner scanner = new Scanner(System.in);
			String saisie = null;
			saisie = scanner.nextLine();
			return saisie;
		}
	
}