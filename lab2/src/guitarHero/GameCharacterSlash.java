package  guitarHero;
public class GameCharacterSlash extends GameCharacter {

	public GameCharacterSlash() {
		 guitarBehavior=new Guitar_Telecaster();
		 soloBehavior=new Solo_SmashTheGuitar();
	}

	public void playSolo() {
		soloBehavior.solo();
		this.change();
	}


	public void change() {
		System.out.println("Changing new guitar!! ");
		this.setGuitar(new Guitar_GibsonSG());
	}
	
}