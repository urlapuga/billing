package billing.shaper.servlets.task;

import billing.shaper.model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ViewTask",urlPatterns = "/tasks")
public class ViewTask extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reqHandler(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reqHandler(request,response);
    }

    protected void reqHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("newtask"));
        request.getRequestDispatcher("/tasks.jsp").forward(request, response);
    }

}
