package hangman.model;

public class BonusScore implements GameScore{

	public BonusScore() {
		// TODO Auto-generated constructor stub
	}

	
	
	/*
	
	 * 
	 * @pre  Se inicia con 0 puntos,  se bonifican las letras correctas con 10 puntos cada una y  tambien se pnealiza
	 * cada letra incorrecta con 5 puntos y el puntaje minimo es 0.
	 *
	 * @pos si correctCount>=0 && correctCount>=0 && correctCount - incorrectCount*2 >= 0 entonces retorne puntaje=(correctCount*10 - inconrrectCount*5) 
	 * @pos SI correctCount<0 || inconrrectCount<0 enttonces Error(-1).
	 * @pos si  puntaje <0 entonces retorne 0.
	 * 
	 * @param coorectCount, incorrectCount
	 * 
	 * @throws 
	 */
	
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		if(incorrectCount>=0 && correctCount>=0 && correctCount - incorrectCount*2 >= 0) {
			return correctCount*10 - incorrectCount*5;
		}
		if(incorrectCount<0 || correctCount<0) {
			return -1;
		}
		if(correctCount*10 - incorrectCount*5 < 0) {
			return 0;
		}
		return 0;
	}

}
