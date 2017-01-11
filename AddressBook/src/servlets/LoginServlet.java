package servlets;

import util.Authentication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Authentication authentication = new Authentication();

        String login = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            if (authentication.login(login, password)) {
                session.setAttribute("loggedIn", true);
                session.setAttribute("email", login);
                response.sendRedirect("viweall");
            } else {
                session.setAttribute("loggedIn", false);
                response.sendRedirect("login");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

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
        out.println("<div class=\"container\">");
        out.println("<div class=\"navbar-header\">");
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
        out.println("<li><a href=\"http://localhost/home.jsp#capabilities\">Capabilities</a></li>");
        out.println("<li><a href=\"http://localhost/home.jsp#prices\">Prices</a></li>");
        out.println("<li><a href=\"http://localhost/home.jsp#contact\">Contact</a></li>");
        out.println("</ul>");
        out.println("<ul class=\"nav navbar-nav navbar-right\">");
        out.println("<li><a href=\"login\"><i class=\"glyphicon glyphicon-log-in\"></i> Log In</a></li>");
        out.println("<li><a href=\"register\"><i class=\"fa fa-registered\" aria-hidden=\"true\"></i> Free registration</a></li>");
        out.println("</ul>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");

        // Form
        out.println("<div id=\"carousel\" class=\"carousel slide center\">");
        out.println("<div class=\"carousel-inner\">");
        out.println("<div class=\"item active\"><br>");
        out.println("<img src=\"images/vi-office1.png\" alt=\"\">");
        out.println("<div class=\"carousel-caption\">");
        out.println("<div class=\"col-md-6 col-md-offset-3\">");
        out.println("<img src=\"images/a.png\">");
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\">");
        out.println("<div class=\"form-group\">");
        out.println("<input type=\"email\" maxlength=\"64\" name=\"email\" required placeholder=\"Email\" class=\"form-control\">");
        out.println("</div>");
        out.println("<div class=\"form-group\">");
        out.println("<input type=\"password\" maxlength=\"128\" name=\"password\" required placeholder=\"Password\" class=\"form-control\">");
        out.println("</div>");
        out.println("<div class=\"btn-log\">");
        out.println("<button class=\"btn btn-link btn-md\" type=\"submit\">Log in </button>");
        out.println("<a href=\"register\" class=\"btn btn-link btn-md\">Registration</a>");
        out.println("</form>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<br><br>");
        out.println("<img src=\"images/a.png\">");
        out.println("© Copyright 2016-2017 | Developed By Hol&Art Company");

        out.println("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->");
        out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
        out.println("<!-- Include all compiled plugins (below), or include individual files as needed -->");
        out.println("<script src=\"js/bootstrap.js\"></script>");
        out.println("</body>");
        out.println("</html>");
    }
}
