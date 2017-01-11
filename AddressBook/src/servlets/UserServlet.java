package servlets;

import util.Contact;
import util.Process;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UserServlet extends HttpServlet {

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

            String arrindex = request.getParameter("name");
            if (arrindex == null) {
                response.sendRedirect("viweall");
            } else {
                ArrayList<Contact> contacts = null;
                Process process = new Process();


                out.println("<!-- BUTTON-GROUP  -->");
                out.println("<div class=\"container\">");
                out.println("<div class=\"row\">");
                out.println("<div class=\"margin-top\">");
                out.println("<div class=\"center\">");
                out.println("<a href=\"viweall\" class=\"btn btn-link btn-md\"><i class=\"fa fa-users\" ></i> All contacts</a>");
                out.println("<a href=\"adduser\" class=\"btn btn-link btn-md\"><i class=\"fa fa-user-plus\"></i> Add</a>");
                out.println("<a href=\"editform?dzen=" + arrindex + "\" class=\"btn btn-link btn-md\"><i class=\"fa fa-pencil\"></i> Edit</a>");
                out.println("<button class=\"btn btn-link btn-md\" type=\"button\" data-toggle=\"modal\" data-target=\"#myModal\"><i class=\"glyphicon glyphicon-trash\"style=\"font-size: 85%;font-weight: bold;\"></i> Delete</button>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");

                // Form Edit User
                out.println("<div class=\"container\">");
                out.println("<div class=\"row\">");

                try {
                    int index = Integer.parseInt(arrindex);

                    out.println("<div class=\"col-lg-10 col-lg-offset-1\">");
                    out.println("<div class=\"row\">");
                    out.println("<div class=\"col-md-6 \">");
                    out.println("<div class=\"col-md-10 col-md-offset-1 \">");

                    out.println("<hr>");
                    out.println("<img style=\"height: 120px;\" src=\"images/dir.png\">Contact person");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>First Name :  </b>" + process.viweAll(filename).get(index).getFirstName() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Last Name :  </b>" + process.viweAll(filename).get(index).getLastName() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Birthday :  </b>" + process.viweAll(filename).get(index).getBirthday() + "");
                    out.println("</div>");

                    out.println("<hr>");
                    out.println("<img style=\"height: 120px;\" src=\"images/phone-icon.png\">Accessibility");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Mobile :  </b>" + process.viweAll(filename).get(index).getMobile() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Phone :  </b>" + process.viweAll(filename).get(index).getPhone() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Work Phone :  </b>" + process.viweAll(filename).get(index).getWorkphone() + "");
                    out.println("</div>");

                    out.println("<div class=\"form-group\">");
                    out.println("<b>Fax :   </b>" + process.viweAll(filename).get(index).getFax() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Email :   </b>" + process.viweAll(filename).get(index).getEmail() + "");
                    out.println("</div>");

                    out.println("<hr>");
                    out.println("<img style=\"height: 120px;\" src=\"images/internet.png\">Web");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Website :   </b><a href=" + process.viweAll(filename).get(index).getWebsite() + ">Web</a>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Twiter :   </b><a href=" + process.viweAll(filename).get(index).getTwiter() + ">Twiter</a>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Google+ :   </b><a href=" + process.viweAll(filename).get(index).getGoogle() + ">Google+</a>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>YouTybe :   </b><a href=" + process.viweAll(filename).get(index).getYoutybe() + ">YouTybe</a>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Instagram :   </b><a href=" + process.viweAll(filename).get(index).getInstagram() + ">Instagram</a>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Facebook :   </b><a href=" + process.viweAll(filename).get(index).getFacebook() + ">Facebook</a>");
                    out.println("</div>");

                    out.println("</div>");
                    out.println("</div>");
                    out.println("<div class=\"col-md-6\">");
                    out.println("<div class=\"col-md-10 col-md-offset-1\">");

                    out.println("<hr>");
                    out.println("<img style=\"height: 120px;\" src=\"images/company.png\">Company detalis");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Company Name :   </b>" + process.viweAll(filename).get(index).getCompany() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Departament :   </b>" + process.viweAll(filename).get(index).getDepartament() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Pozition :   </b>" + process.viweAll(filename).get(index).getPozition() + "");
                    out.println("</div>");

                    out.println("<hr>");
                    out.println("<img style=\"height: 120px;\" src=\"images/Home.ico\">Location");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Address :   </b>" + process.viweAll(filename).get(index).getAddress() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Country :   </b>" + process.viweAll(filename).get(index).getCountry() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>State :   </b>" + process.viweAll(filename).get(index).getState() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>City :   </b>" + process.viweAll(filename).get(index).getCity() + "");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Zip :   </b>" + process.viweAll(filename).get(index).getZip() + "");
                    out.println("</div>");

                    out.println("<hr>");
                    out.println("<img style=\"height: 120px;\" src=\"images/notepad.png\">Note");
                    out.println("<div class=\"form-group\">");
                    out.println("<b>Message :   </b>" + process.viweAll(filename).get(index).getMessage() + "");
                    out.println("</div>");

                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("<br>");
                    out.println("<br>");

                    out.println("<!-- MyMODAL  -->");
                    out.println("<div id=\"myModal\" class=\"modal fade\">");
                    out.println("<div class=\"modal-dialog\">");
                    out.println("<div class=\"modal-dialog\">");
                    out.println("<div class=\"modal-content\">");
                    out.println("<div class=\"modal-header\"><button class=\"close\" type=\"button\" data-dismiss=\"modal\">×</button>");
                    out.println("Are you sure you want to delete a contact person?");
                    out.println("</div>");
                    out.println("<form method=\"post\" action=\"remove\" name=\"dzen\">");
                    out.println("<input hidden name=\"dzen\" type=\"text\" value=" + arrindex + ">");
                    out.println("<div class=\"modal-footer\">");
                    out.println("<button class=\"btn btn-link btn-md\" type=\"submit\"><i class=\"glyphicon glyphicon-trash\"style=\"font-size: 85%;font-weight: bold;\"></i> Delete</button>");
                    out.println("<button class=\"btn btn-link btn-md\" type=\"button\" data-dismiss=\"modal\">Cancel</button></div>");
                    out.println("</form>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            out.println("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
            out.println("<!-- Include all compiled plugins (below), or include individual files as needed -->");
            out.println("<script src=\"js/bootstrap.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
