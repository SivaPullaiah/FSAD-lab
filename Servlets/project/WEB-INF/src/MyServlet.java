import java.io.*;
import java.util.*;
import javax.servlet.*;
public class MyServlet extends GenericServlet {
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><head><title>First Servlet</title></head>");
        pw.println("<body><center><h1>This massage come from Servlet</h1>");
        pw.println("</center></body></html>");
        pw.close();
    }
}