package atividade6;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
      import javax.servlet.jsp.PageContext;

      public final class aleatorio extends
                 org.apache.jasper.runtime.HttpJspBase implements
                 org.apache.jasper.runtime.JspSourceDependent {



       /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void _jspService(HttpServletRequest request,
                      HttpServletResponse response) throws java.io.IOException,
                      ServletException {

      
            HttpSession session = null;
            ServletContext application = null;
            ServletConfig config = null;
            JspWriter out = null;
            Object page = this;
            JspWriter _jspx_out = null;
            PageContext _jspx_page_context = null;

            try {
                      response.setContentType("text/html");
                      pageContext =_jspxFactory.getPageContext(this, request, response,null, true, 8192, true);
                      _jspx_page_context = pageContext;
                      application = pageContext.getServletContext();
                      config = pageContext.getServletConfig();
                      session = pageContext.getSession();
                      out = pageContext.getOut();
                      _jspx_out = out;

                      write("<html>\r\n");
                      out.write("<head>\r\n");
                      out.write("<title>Número aleatório</title>\r\n");
                      out.write("</head>\r\n");
                      out.write("<body>\r\n");
                      out.write("Esta página gera um novo número aleatório\r\n");
                      out.write("toda vez que é acessada: ");
                      out.print(Math.random());
                      out.write("\r\n");
                      out.write("</body>\r\n");
                      out.write("</html>");
               } catch (Throwable t) { 
                     
               }
         }
      }