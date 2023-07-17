package Hiearchical.inheritance;

public class ScoreBoard extends Cricket {
	public void Board()
	{
		
		System.out.println("India wins the match");
	}
	public static void main(String[] args) {
		Bating bat=new Bating();
		bat.display();
		bat.bating(215);
		Balling ball=new Balling();
		ball.display();
		ball.balling(5);
		ScoreBoard score=new ScoreBoard();
		score.display();
		score.Board();

	}

}
