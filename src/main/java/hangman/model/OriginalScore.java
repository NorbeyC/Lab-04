package hangman.model;

public class OriginalScore implements GameScore {

	public OriginalScore() {
		// TODO Auto-generated constructor stub
	}

	
	

/*
 * @pre  Se inicia con 100 puntos, no se bonifican letras correctas tambien se pnealiza
 * cada letra incorrecta con 10 puntos y el puntaje minimo es 0.
 * 
 * @pos si inconrrectCount>=0 && incorrectCount<=10 && correctCount>=0 entonces retorne puntaje=(100 - inconrrectCount*10)
 * @pos si inconrrectCount < 0 || correctCount < 0 return error(-1)
 * @pos si inconrrectCount > 10 return 0
 * 
 * @param coorectCount, incorrectCount
 * 
 * @throws 
 */
	
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		if(incorrectCount>=0 && incorrectCount<=10 && correctCount>=0) {
			return 100 - incorrectCount*10;
		}
		if(incorrectCount<0 || correctCount<0) {
			return -1;
		}
		if(incorrectCount > 10) {
			return 0;
		}
		
		return 0;
	}

}
