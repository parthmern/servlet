import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FormServlet doGet");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<p>doGet</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Form servlet post");
        System.out.println("req" + req);
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<p>name" + name + " email " + email + "</p>");
    }
}
