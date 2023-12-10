package pl.coderslab.users;

import pl.coderslab.User;
import pl.coderslab.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// dodawanie użytkownika
@WebServlet(name = "UserAdd", urlPatterns = {"/user/add"})
public class UserAdd extends HttpServlet {

    // wyświetlanie formularza
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/users/add.jsp").forward(req, resp);
    }

    // tworzenie obiektu i ustawianie atrybutów setterami
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUserName(req.getParameter("userName"));
        user.setEmail(req.getParameter("userEmail"));
        user.setPassword(req.getParameter("userPassword"));
        UserDao userDao = new UserDao();
        userDao.create(user);
        resp.sendRedirect("/user/list");
    }
}
