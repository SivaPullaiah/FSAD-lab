import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DateServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        HttpSession hs=req.getSession(true);
        Date date=(Date)hs.getAttribute("date");
        if(date!=null){
            pw.println("<b>Last Accessed Date and Time is: "+date);
        }
        date=new Date();
        hs.setAttribute("date",date);
        pw.println("<b>Current Date and time is: "+date+"<br>");
        pw.close();
    }
}