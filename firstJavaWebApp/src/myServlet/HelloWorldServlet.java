package myServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class HelloWorldServlet implements Servlet
{
	private ServletConfig config;
	public void destroy(){}

	public ServletConfig getServletConfig()
	{
		return config;
	}
	
	/**
	 * �÷�������ʹ�ã���˷���null���ɡ�
	 */
	public String getServletInfo()
	{		
		return null;
	}

	/**
	 * ServletConfig�������������졣�����ڵ���init()����ʱ��������Ϊ��������Servlet 
	 */
	public void init(ServletConfig config) throws ServletException
	{
		this.config = config;
	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException
	{
		//�õ�PrintWriter����Servletʹ���������������Ӧ
        PrintWriter out=res.getWriter();
        //��ͻ��˷����ַ����ݡ�
        out.println("Hello World");
        //�ر������
		out.close();
	}
}