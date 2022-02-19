package hangman.model;

public class OriginalScore implements GameScore {

	public OriginalScore() {
		// TODO Auto-generated constructor stub
	}

	
	

/*
 * @pre  Se inicia con 100 puntos, no se bonifican letras correctas tambien se pnealiza
 * cada letra incorrecta con 10 puntos y el puntaje minimo es 0.
 * 
 * @pos si inconrrectCount>0   entonces retorne puntaje=(100 - inconrrectCount*10)
 * @pos si inconrrectCount==0 && correctCount==0  entonces retorne puntaje= 500 
 * @pos si inconrrectCount==0 && correctCount>0  entonces retorne puntaje= 500 
 * @pos si correctCount=0 && inconrrectCount=0 entonces retorne puntaje = 0.
 * @pos si inconrrectCount < 0 || correctCount < 0 return error
 * @pos si inconrrectCount > 10 thrwon EXception
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
