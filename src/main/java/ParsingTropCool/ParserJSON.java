package ParsingTropCool;

//import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.Scanner;
//import org.json.JSONArray;
import org.json.JSONObject;

public class ParserJSON extends TRAD
{
	//@Constructeur du chemin vers le JSON log avec gestion du format étant en txt de base 
    public ParserJSON(String cheminjson) {
    	
        Charset c = Charset.defaultCharset();
        String txt = ParserJSON.readFile(cheminjson, c);
        
        JSONObject obj = new JSONObject(txt);
        //System.out.println(obj);
        
        //@Gestion d'erreurs au niveau de la saisie utilisateur
        String nlog = TRAD.saisieUtil("Numlog ?");
        if(!nlog.contentEquals("log1") && !nlog.contentEquals("log8") && !nlog.contentEquals("log3") && !nlog.contentEquals("log2"))
        {
        	System.out.println("Numéro de log incorrect");
        }
        else
        {
        	//@Restructuration de l'affichage
        	JSONObject log = obj.getJSONObject(nlog);
        	//System.out.println(log);
        
        	String datestamp = obj.getJSONObject(nlog).getString("datestamp");
        	Integer level = obj.getJSONObject(nlog).getInt("level");
        	String type = obj.getJSONObject(nlog).getString("type");
        	String detail = obj.getJSONObject(nlog).getString("detail");
        	//@Possibilité d'inclure une gestion d'erreurs
        	System.out.println(/*nlog + */"Datestamp : " + datestamp + "\n" + "level : " + level + "\n" +  "type : " + type + "\n" + "detail : " + detail);
        }
    }

    //@Tentative de travail avec json array sans succès
    /* Travail à venir avec les variables
    
    public String Name = "";
    public String Datestamp = "";
    public int Level = 0;
    public String Type = "";
    public String Detail = "";*/

    /*public static void main(String [] args) {


        //JSONArray obj = new JSONArray(JSON);
        JSONArray arr = obj.getJSONArray("logs");


        
        for (int i = 0; i < arr.length(); i++) {

            String Name = arr.getJSONObject(i).getString("Name");
            String Datestamp = arr.getJSONObject(i).getString("Datestamp");
            int Level = arr.getJSONObject(i).getInt("Level");
            String Type = arr.getJSONObject(i).getString("Type");
            String Detail = arr.getJSONObject(i).getString("Detail");
            System.out.println(Name);
            System.out.println(Datestamp);
            System.out.println(Level);
            System.out.println(Type);
            System.out.println(Detail);
        	}
    }*/
    
    //@Gestion d'erreurs accès fichiers
    static String readFile(String path, Charset encoding) 
    {
        try
        {
              byte[] encoded = Files.readAllBytes(Paths.get(path));
              return new String(encoded, encoding);
        }
        catch(Exception e)
        {
            System.err.println("Erreur d'acces au fichier : " + path);
            return "";
        }
    }
}