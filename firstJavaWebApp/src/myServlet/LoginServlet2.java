package myServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet2 extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
               throws ServletException,IOException
    {
        
        resp.setContentType("text/html;charset=gb2312");
        
        PrintWriter out=resp.getWriter();

        out.println("<form method=post action=portal>");
        
        out.println("<table>");
        
        out.println("<tr>");
        out.println("<td>�������û���</td>");
        out.println("<td><input type=text name=username></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>����������</td>");
        out.println("<td><input type=password name=password></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><input type=reset value=����></td>");
        out.println("<td><input type=submit value=��¼></td>");
        out.println("</tr>");
        
        out.println("</table>");
        out.println("</form>");
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
               throws ServletException,IOException
    {
        doGet(req,resp);
    }
}