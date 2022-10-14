import java.io.*;
import java.util.*;
import javax.servlet.*;

public class MyServlet extends GenericServlet 
{
    public void Service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        res.set(ContentType("text/html"));
        PrintWriter pw = res.getWriter();
        pw.println("<html><head><title></title></head>");
        pw.println("<body><center><h1>This Message come from servlet</h1>");
        pw.println("</center></body></html>");
        pw.colse();
    }
}