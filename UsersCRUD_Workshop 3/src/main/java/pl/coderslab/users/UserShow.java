package pl.coderslab.users;

import pl.coderslab.User;
import pl.coderslab.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// wyświetlanie danych użytkownika
@WebServlet(name = "UserShow", urlPatterns = {"/user/show"})
public class UserShow extends HttpServlet {

    // wyświetlenie formularza
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        UserDao userDao = new UserDao();
        User read = userDao.read(Integer.parseInt(id));
        req.setAttribute("user", read);
        req.getServletContext().getRequestDispatcher("/users/show.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        userDao.delete(Integer.parseInt(req.getParameter("id")));
        resp.sendRedirect("/user/list");
    }
}
