package hangman.model;

public class PowerScore implements GameScore{

	public PowerScore() {
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * @pre  Se inicia con 0 puntos, la i-esima letra correcta se bonifica con 5^2 correctas, tambien se pnealiza
	 * cada letra incorrecta con 8 puntos y el puntaje minimo es 0.
	 * 
	 * @pos si correctCount>0  entonces retorne puntaje=(5^correctCount-inconrrectCount*8) 
	 * @pos si puntaje>500  entonces retorne puntaje=500.
	 * @pos si puntaje <0 retonre error.
	 * @pos si correctCount<0 || inconrrectCount<0 entonces ERROR.
	 * @pos si correctCount== 0 && inconrrectCount == 0 Return puntaje = 0.
	 * 
	 * @param coorectCount, incorrectCount
	 * 
	 * @throws 
	 */
	
	
	
	@Override
	public int calculateScore(int correctCount, int inconrrectCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
