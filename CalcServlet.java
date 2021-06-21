import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-21
 * Time: 19:48
 */
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.方法开头设置通用属性，编码和数据类型
        //设置编码
        response.setCharacterEncoding("UTF-8");
        //设置数据类型
        response.setContentType("text/html");
        //2.



        PrintWriter writer = response.getWriter();
        writer.println("<h1>你好，servlet！</h1>");
    }
}
