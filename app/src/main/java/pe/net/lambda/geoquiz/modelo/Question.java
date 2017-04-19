package pe.net.lambda.geoquiz.modelo;

/**
 * Created by Gary on 12/04/2017.
 */

public class Question {

    private int mTextRespuestaId;
    private boolean mAnswerTrue;

    public Question(int textRespuestaId, boolean answerTrue){
        mTextRespuestaId = textRespuestaId;
        mAnswerTrue = answerTrue;
    }
}
