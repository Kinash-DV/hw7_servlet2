package dv.kinash;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String mood = req.getParameter("mood");
        String place = req.getHeader("place");

        name = (name == null) ? "John Dou" : name;
        mood = (mood == null) ? "happy" : mood;
        place = (place == null) ? "London" : place;

        resp.getWriter().println(
                String.format("Hi, %s from %s, you are felling %s", name, place, mood));
    }
}
