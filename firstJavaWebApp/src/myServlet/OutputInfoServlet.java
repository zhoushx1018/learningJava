package myServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OutputInfoServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
               throws ServletException,IOException
    {
        
        resp.setContentType("text/html;charset=gb2312");
        
        PrintWriter out=resp.getWriter();
        
        Enumeration headNames=req.getHeaderNames();
        
        out.println("<html><head>");
        out.println("<title>Info Page</title>");
        out.println("</head>");
        out.println("<body><center>");

        out.println("<table border=1 align=center>");
        out.println("<caption>Servlet���յ���HTTP��Ϣ��ͷ����Ϣ</caption>");
        out.println("<tr bgcolor=#999999>");
        out.println("<th>��Ϣ��ͷ������</th>");
        out.println("<th>��Ϣ��ͷ��ֵ</th>");
        out.println("</tr>");
        
        while(headNames.hasMoreElements())
        {
            String name=(String)headNames.nextElement();
            String value=req.getHeader(name);
            out.println("<tr>");
            out.println("<td>"+name+"</td>");
            out.println("<td>"+value+"</td>");
            out.println("</tr>");
        }
        
        out.println("</table><p>");
        
        out.println("<table border=1 align=center>");
        out.println("<caption>����������Ϣ</caption>");
        
        out.println("<tr>");
        out.println("<td>�ͻ��˵�IP��ַ</td>");
        out.println("<td>"+req.getRemoteAddr()+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>�ͻ��˵Ķ˿ں�</td>");
        out.println("<td>"+req.getRemotePort()+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>�������˵�IP��ַ</td>");
        out.println("<td>"+req.getLocalAddr()+"</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>�������˵Ķ˿ں�</td>");
        out.println("<td>"+req.getLocalPort()+"</td>");
        out.println("</tr>");
        
        out.println("</table>");
        
        out.println("</center></body></html>");
        out.close();
    }
}