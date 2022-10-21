import java.io.*;
import java.util.*;
import javax.servlet.*;
public class PostParam extends GenericServlet {
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        Enumeration e=req.getParameterNames();
        pw.println("<html><head><title>Param</title></head>");
        pw.println("<body><center><table><tr><th>PName</th>");
        pw.println("<th>PValue</th></tr>");
        while(e.hasMoreElements()) {
            String pname=(String)e.nextElement(); //for parameter name
            String pvalue=req.getParameter(pname); //for parameter value
            pw.println("<tr><th>"+pname+"</th><th>"+pvalue+"</th></tr>");
        }
        pw.println("</table></center></body></html");
        pw.close();
    }
}