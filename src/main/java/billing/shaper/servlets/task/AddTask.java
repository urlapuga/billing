package billing.shaper.servlets.task;

import billing.shaper.Service.TaskService;
import billing.shaper.Service.TaskServiceImpl;
import billing.shaper.model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddTask", urlPatterns = "/addtask")
public class AddTask extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        reqHandler(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        reqHandler(request, response);
    }


    protected void reqHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TaskService ts = new TaskServiceImpl();
        ts.add(new Task(request.getParameter("message")));
        request.getRequestDispatcher("/?page=tasks").forward(request, response);
    }
}
