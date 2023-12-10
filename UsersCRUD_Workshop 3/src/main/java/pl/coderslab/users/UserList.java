package pl.coderslab.users;

import pl.coderslab.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// wyświetlanie listy użytkowników
@WebServlet(name = "UserList", urlPatterns = {"/user/list"})
public class UserList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        req.setAttribute("users", userDao.findAll());
        req.getServletContext().getRequestDispatcher("/users/list.jsp").forward(req, resp);
    }
}
