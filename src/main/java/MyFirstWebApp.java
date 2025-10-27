import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class MyFirstWebApp extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("servlet init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet service");
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<h2>Parth /login hit</h2> ");
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
    }
}
