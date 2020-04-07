package ParsingTropCool;

import ParsingTropCool.Parsable;

public class Launcher {

	public void activerParsing(file f, Parsable p)
	{
		if(p.verifierFormat(f)) {
			String[] res = p.extraireAlertes(f);
			p.deplacerFichier();
		}
	}
	
	public static void main(String[] args) {
		Launcher l = new Launcher();
		l.activerParsing(new File(:"C:\\test.json"), new ParserJSON());
		l.activerParsing(new File(:"C:\\test.json"), new ParserHTML());
	}	
	
}
