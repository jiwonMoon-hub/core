package hello.servlet.web.servletmvc;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// 회원가입 페이지 호출
@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
        public class MvcMemberFormServlet extends HttpServlet {
        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
                      String viewPath = "/WEB-INF/views/new-form.jsp";
                      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
                      dispatcher.forward(request, response); //servlet 호출할 때 사용
                      }
}