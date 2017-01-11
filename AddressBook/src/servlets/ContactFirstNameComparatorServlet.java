package servlets;

import util.Contact;
import util.ContactFirstNameComparator;
import util.ContactLastNameComparator;
import util.Process;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class ContactFirstNameComparatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Boolean b = (Boolean) session.getAttribute("loggedIn");
        if (b == null || !b) {
            response.sendRedirect("login");
        } else {
            String filename = (String) session.getAttribute("email");

            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"ru\">");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->");
            out.println("<title>addressbook</title>");
            out.println("<!-- Bootstrap -->");
            out.println("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">");
            out.println("<link href=\"css/style.css\" rel=\"stylesheet\">");
            out.println("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">");
            out.println("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/addressbook.jpg\">");
            out.println("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");
            out.println("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->");
            out.println("<!--[if lt IE 9]>");
            out.println("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>");
            out.println("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>");
            out.println("<![endif]-->");
            out.println("</head>");
            out.println("<body>");

            out.println("<div class=\"navbar navbar-default navbar-fixed-top\">");
            out.println(" <div class=\"container\">");
            out.println(" <div class=\"navbar-header\">");
            out.println("<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#responsive-menu\">");
            out.println("<span class=\"sr-only\">Open navigation</span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("<span class=\"icon-bar\"></span>");
            out.println("</button>");
            out.println("<a class=\"navbar-brand\" href=\"#\"><i class=\"glyphicon glyphicon-home hidden-lg hidden-md hidden-sm\"style=\"color: white;\"></i></a>");
            out.println("</div>");
            out.println("<div class=\"collapse navbar-collapse\" id=\"responsive-menu\">");
            out.println("<ul class=\"nav navbar-nav\">");
            out.println("<li><a href=\"http://localhost/home.jsp\"><i class=\"glyphicon glyphicon-home\"></i> Home</a></li>");
            out.println("<li><a href=\"exit\"><i class=\"glyphicon glyphicon-log-out\"></i> Sign out</a></li>");
            out.println("</ul>");
            out.println("<div class=\"navbar-form navbar-right \" role=\"search\">");
            out.println("<form name action=\"search\">");
            out.println("<div class=\"input-group\">");
            out.println("<input type=\"text\" name=\"Search\" class=\"form-control\" placeholder=\"Search by Address Book\">");
            out.println("<span class=\"input-group-btn\">");
            out.println("<button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>");
            out.println("</span>");
            out.println("</div>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");

            out.println("<!-- BUTTON-GROUP  -->");
            out.println("<div class=\"container\">");
            out.println("<div class=\"row\">");
            out.println("<div class=\"margin-top\">");
            out.println("<div class=\"center\">");
            out.println("<a href=\"viweall\" class=\"btn btn-link btn-md\"><i class=\"fa fa-users\"></i> All contacts</a>");
            out.println("<a href=\"adduser\" class=\"btn btn-link btn-md\"><i class=\"fa fa-user-plus\"></i> Add</a>");
            out.println("<a href=\"edit\" class=\"btn btn-link btn-md\"><i class=\"fa fa-pencil\"></i> Edit</a>");
            out.println("<a href=\"remove\" class=\"btn btn-link btn-md\"><i class=\"glyphicon glyphicon-trash\"style=\"font-size: 85%;font-weight: bold;\"></i> Delete</a>");
            out.println("<div class=\"btn-group\">");
            out.println("<a href=\"#\" class=\"btn btn-link btn-md\"data-toggle=\"dropdown\">Sort  <span class=\"caret\"></span></a>");
            out.println("<ul class=\"dropdown-menu\" role=\"menu\">");
            out.println("<li><a href=\"http://localhost/sortingdown\"><i class=\"glyphicon glyphicon-arrow-down\"style=\"font-size: 75%;\"></i>   Last name</a></li>");
            out.println("<li><a href=\"http://localhost/sortingup\"><i class=\"glyphicon glyphicon-arrow-up\"style=\"font-size: 75%;\"></i>   Last name</a></li>");
            out.println("<li><a href=\"http://localhost/firstnamesort1\"><i class=\"glyphicon glyphicon-arrow-down\"style=\"font-size: 75%;\"></i>   First name</a></li>");
            out.println("<li><a href=\"http://localhost/firstnamesort\"><i class=\"glyphicon glyphicon-arrow-up\"style=\"font-size: 75%;\"></i>   First name</a></li>");
            out.println(" </ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");

            out.println("<!-- TABLE  -->");
            out.println("<div class=\"container\">");
            out.println("<div class=\"scroll\">");
            out.println("<table class=\"table table-bordered table-hover\">");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>№</th>");
            out.println("<th>First Name</th>");
            out.println("<th>Last Name</th>");
            out.println("<th>Email</th>");
            out.println("<th>Phone</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");

            int arrindex = 0;
            int number = 1;
            Process process = new Process();
            ArrayList<Contact> contacts = null;
            try {
                contacts = process.getCollection(filename);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // revers sorting
            Collections.sort(contacts, Collections.reverseOrder(new ContactFirstNameComparator()));

            for (Contact u : contacts) {
                out.println("<tr><td>" + number++ + "</td><td><a href=\"/user?name=" + arrindex++ + "\">" + u.getFirstName() + "</a></td><td>" + u.getLastName() + "</td><td>" + u.getEmail() + "</td><td>" + u.getPhone() + "</td></tr>");
            }

            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");
            out.println("</div>");

            out.println("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
            out.println("<!-- Include all compiled plugins (below), or include individual files as needed -->");
            out.println("<script src=\"js/bootstrap.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
