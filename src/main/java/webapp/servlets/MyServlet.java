package webapp.servlets;


import exigen.students.App;
import exigen.students.MyDataBase;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    public static final String QUESTION = "question";

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        PrintWriter writer = res.getWriter();

        writer.println("<html>");
        writer.println("<head><title>JDBC task</title></head>");
        writer.println("<body>Добрый день!" +
                "<FORM method=\"post\"> " +
                "Могу ли я <INPUT NAME=\""+QUESTION+"\"> <BR> " +
                "<INPUT TYPE=SUBMIT>\n" +
                "</FORM> " +
                "</body>");
        writer.println("</html>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        req.setCharacterEncoding("UTF-8");

        String a = req.getParameter(QUESTION);
        MyDataBase.addQuestion(a);
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head><title>JDBC</title></head>");
        writer.println("<body>Добрый день!" +
                "<FORM method=\"post\">  " +
                "Могу ли я <INPUT NAME=\"question\">? <BR> " +
                "<INPUT TYPE=SUBMIT>\n" +
                "</FORM> <br>" +
                App.getResponse(a) +
                "</body>");
        writer.println("</html>");
        writer.close();


    }
}
