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

public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Boolean b = (Boolean) session.getAttribute("loggedIn");
        if (b == null || !b) {
            response.sendRedirect("login");
        } else {
            String filename = (String) session.getAttribute("email");

            String firstName = request.getParameter("FirstName");
            String lastName = request.getParameter("LastName");
            String birthday = request.getParameter("birthday");
            String mobile = request.getParameter("mobile");
            String phone = request.getParameter("Phone");
            String workphone = request.getParameter("workphone");
            String fax = request.getParameter("fax");
            String email = request.getParameter("Email");
            String website = request.getParameter("website");
            String google = request.getParameter("google");
            String twiter = request.getParameter("twiter");
            String facebook = request.getParameter("facebook");
            String instagram = request.getParameter("instagram");
            String youtybe = request.getParameter("youtybe");
            String company = request.getParameter("company");
            String departament = request.getParameter("departament");
            String pozition = request.getParameter("pozition");
            String address = request.getParameter("address");
            String country = request.getParameter("country");
            String state = request.getParameter("state");
            String city = request.getParameter("city");
            String zip = request.getParameter("zip");
            String message = request.getParameter("message");

            Contact contact = new Contact();
            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setBirthday(birthday);
            contact.setMobile(mobile);
            contact.setPhone(phone);
            contact.setWorkphone(workphone);
            contact.setFax(fax);
            contact.setEmail(email);
            contact.setWebsite(website);
            contact.setGoogle(google);
            contact.setTwiter(twiter);
            contact.setFacebook(facebook);
            contact.setInstagram(instagram);
            contact.setYoutybe(youtybe);
            contact.setCompany(company);
            contact.setDepartament(departament);
            contact.setPozition(pozition);
            contact.setAddress(address);
            contact.setCountry(country);
            contact.setState(state);
            contact.setCity(city);
            contact.setZip(zip);
            contact.setMessage(message);

            Process process = new Process();
            try {
                process.addUser(contact, filename);
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.sendRedirect("viweall");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Boolean b = (Boolean) session.getAttribute("loggedIn");
        if (b == null || !b) {
            response.sendRedirect("login");
        } else {

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

            // Form Add User
            out.println("<div class=\"container margin-top\">");
            out.println("<div class=\"row\">");
            out.println("<form method=\"post\">");
            out.println("<div class=\"col-lg-10 col-lg-offset-1\">");
            out.println("<div class=\"center_text\">");
            out.println("<button class=\"btn btn-link btn-md\" type=\"submit\"><i class=\"fa fa-user-plus\"></i> Add</button>");
            out.println("<a href=\"http://localhost/viweall\" class=\"btn btn-link btn-md\"> Cancel </a>");
            out.println("</div>");
            out.println("<div class=\"row\">");
            out.println("<div class=\"col-md-6 \">");
            out.println("<div class=\"col-md-10 col-md-offset-1 \">");

            out.println("<hr>");
            out.println("<img style=\"height: 120px;\" src=\"images/dir.png\">Contact person");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>First Name</b></h6><input type=\"text\" maxlength=\"20\" name=\"FirstName\" required placeholder=\"First Name\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Last Name</b></h6><input type=\"text\" maxlength=\"20\" name=\"LastName\" required placeholder=\"Last Name\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Birthday</b></h6><input name=\"birthday\" class=\"form-control\" type=\"date\">");
            out.println("</div>");

            out.println("<hr>");
            out.println("<img style=\"height: 120px;\" src=\"images/phone-icon.png\">Accessibility");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Mobile</b></h6><input type=\"text\" maxlength=\"20\" name=\"mobile\"  placeholder=\"Mobile\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Phone</b></h6><input type=\"text\" maxlength=\"20\" name=\"Phone\"  placeholder=\"Phone\"class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Work Phone</b></h6><input type=\"text\" maxlength=\"20\" name=\"workphone\"  placeholder=\"Work Phone\"class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Fax</b></h6><input type=\"text\" maxlength=\"20\" name=\"fax\"  placeholder=\"Fax\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Email</b></h6><input type=\"email\" maxlength=\"64\" name=\"Email\"  placeholder=\"Email\" class=\"form-control\">");
            out.println("</div>");

            out.println("<hr>");
            out.println("<img style=\"height: 120px;\" src=\"images/internet.png\">Web");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Website</b></h6><input type=\"text\" maxlength=\"100\" name=\"website\" placeholder=\"http://\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Google+</b></h6><input type=\"text\" maxlength=\"100\" name=\"google\"  placeholder=\"http://\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Twiter</b></h6><input type=\"text\" maxlength=\"100\" name=\"twiter\"  placeholder=\"http://\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Facebook</b></h6><input type=\"text\" maxlength=\"100\" name=\"facebook\"  placeholder=\"http://\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Instagram</b></h6><input type=\"text\" maxlength=\"100\" name=\"instagram\"  placeholder=\"http://\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>YouTybe</b></h6><input type=\"text\" maxlength=\"100\" name=\"youtybe\"  placeholder=\"http://\" class=\"form-control\">");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");

            out.println("<div class=\"col-md-6\">");
            out.println("<div class=\"col-md-10 col-md-offset-1\">");

            out.println("<hr>");
            out.println("<img style=\"height: 120px;\" src=\"images/company.png\">Company detalis");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Company Name</b></h6><input type=\"text\" maxlength=\"50\" name=\"company\"  placeholder=\"Company Name\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Departament</b></h6><input type=\"text\" maxlength=\"50\" name=\"departament\"  placeholder=\"Departament\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Pozition</b></h6><input type=\"text\" maxlength=\"50\" name=\"pozition\"  placeholder=\"Pozition\" class=\"form-control\">");
            out.println("</div>");

            out.println("<hr>");
            out.println("<img style=\"height: 120px;\" src=\"images/Home.ico\">Location");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Address</b></h6><input type=\"text\" maxlength=\"100\" name=\"address\"  placeholder=\"Address\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Country</b></h6><input type=\"text\" maxlength=\"20\"  name=\"country\" placeholder=\"Country\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>State</b></h6><input type=\"text\" maxlength=\"50\" name=\"state\"  placeholder=\"State\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>City</b></h6><input type=\"text\" maxlength=\"30\" name=\"city\"  placeholder=\"City\" class=\"form-control\">");
            out.println("</div>");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Zip</b></h6><input type=\"text\" maxlength=\"20\" name=\"zip\" placeholder =\"Zip\" class=\"form-control\">");
            out.println("</div>");

            out.println("<hr>");
            out.println("<img style=\"height: 120px;\" src=\"images/notepad.png\">Note");
            out.println("<div class=\"form-group\">");
            out.println("<h6><b>Message</b></h6><textarea type=\"text\" class=\"form-control\" maxlength=\"1000\" name=\"message\" placeholder=\"Message\" rows=\"19\"></textarea>");
            out.println("</div>");

            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<form>");
            out.println("</div>");
            out.println("</div>");
            out.println("<br>");
            out.println("<br>");

            out.println("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
            out.println("<!-- Include all compiled plugins (below), or include individual files as needed -->");
            out.println("<script src=\"js/bootstrap.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
