package billing.shaper.pinger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PingerServlet",urlPatterns = "/pinger")
public class PingerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> ips = new ArrayList<>();
        ips.add("172.217.20.174");
        ips.add("172.217.21.171");

        HttpSession session = request.getSession();
        response.getWriter().write("172.217.20.174 " + Pinger.ping("172.217.20.174"));
    }
}
