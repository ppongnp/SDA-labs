package  guitarHero;
public class GameCharacterYoung extends GameCharacter {

    public GameCharacterYoung(){
        soloBehavior = new Solo_JumpOffStage();
        guitarBehavior = new Guitar_GibsonLesPaul();
    }
}
