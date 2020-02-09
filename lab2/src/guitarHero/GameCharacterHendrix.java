package  guitarHero;
public class GameCharacterHendrix extends GameCharacter {

	public GameCharacterHendrix() {
		 guitarBehavior=new Guitar_GibsonSG();
		 soloBehavior=new Solo_PutGuitarOnFire();
	}

	public void playSolo() {
		soloBehavior.solo();
		this.change();
	}

	public void change() {
		System.out.println("Changing new guitar!! ");
		this.setGuitar(new Guitar_Telecaster());
	}
}
