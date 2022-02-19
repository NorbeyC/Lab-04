package hangman.model;

public class PowerScore implements GameScore{

	public PowerScore() {
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * @pre  Se inicia con 0 puntos, la i-esima letra correcta se bonifica con 5^2 correctas, tambien se pnealiza
	 * cada letra incorrecta con 8 puntos y el puntaje minimo es 0.
	 * 
	 * @pos si correctCount>=0 && correctCount>=0 && score<=500 && score>=0 entonces retorne puntaje=(5^correctCount-inconrrectCount*8) 
	 * @pos si puntaje>500  entonces retorne puntaje=500.
	 * @pos si puntaje <0 retonre 0.
	 * @pos si correctCount<0 || inconrrectCount<0 entonces ERROR (-1).
	 * 
	 * @param coorectCount, incorrectCount
	 * 
	 * @throws 
	 */
	
	
	
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		double sc = Math.pow(5.0,correctCount) - incorrectCount*8;
		int score = (int) sc;
		System.out.println(score);
		
		if(incorrectCount>=0 && correctCount>=0 && score<=500 && score>=0) {
			return score;
		}
		if(score > 500) {
			return 500;
		}
		if(score < 0) {
			return 0;
		}
		if(incorrectCount<0 || correctCount<0) {
			return -1;
		}
		return 0;
	}

}
