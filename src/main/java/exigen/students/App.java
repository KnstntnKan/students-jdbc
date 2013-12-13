package exigen.students;

/**
 * @author Anna Khasanova
 */
public class App {

    public static String getResponse(String question) {
        String questionOut = "Можно ли вам " + question;
        if (!questionOut.endsWith("?")) {
            questionOut += "?";
        }
        return questionOut.concat(printAnswer(new DefaultReplyGenerator()));
    }

    private static String  printAnswer(ReplyGenerator replyGenerator) {
        return replyGenerator.generate();
    }
}
