<%@ page import="billing.shaper.model.Task" %>
<%@ page import="java.util.List" %>
<%@ page import="billing.shaper.Service.TaskService" %>
<%@ page import="billing.shaper.Service.TaskServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tasks</title>
</head>
<body>

<form action="/addtask" method="post">
    Текст задачи: <input type="text"><input type="submit" value="Создать">
</form>

Мои задачи :

<table>
    <tr>
        <td>Текст задачи</td>
        <td>Исполнитель</td>
        <td>Статус</td>
    </tr>
<%
    TaskService ts = new TaskServiceImpl();
    List<Task> list = ts.getAll();
    String taskAdmin;
    for (Task t : list) {

        if(t.getEmployee()==null)taskAdmin = "Нет исполнителя";
        else{taskAdmin = t.getEmployee().getName() + " " + t.getEmployee().getLastName();}
        out.println("<tr><td>"+ t.getText()+ "</td><td>"+taskAdmin+"</td><td>" + t.getStatus() +"</td></tr>");
    }
%>

</table>
</body>
</html>
