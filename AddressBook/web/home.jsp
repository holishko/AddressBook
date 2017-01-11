<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>addressbook</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">

    <link rel="shortcut icon" type="image/x-icon" href="images/addressbook.jpg">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>

<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#responsive-menu">
                <span class="sr-only">Open navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><i class="glyphicon glyphicon-home hidden-lg hidden-md hidden-sm"
                                                style="color: white;"></i></a>
        </div>
        <div class="collapse navbar-collapse" id="responsive-menu">
            <ul class="nav navbar-nav">
                <li><a href="#"><i class="glyphicon glyphicon-home"></i> Home</a></li>
                <li><a href="#capabilities">Capabilities</a></li>
                <li><a href="#prices">Prices</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="login"><i class="glyphicon glyphicon-log-in"></i> Log In</a></li>
                <li><a href="register"><i class="fa fa-registered" aria-hidden="true"></i> Free registration</a></li>
            </ul>
        </div>
    </div>
</div>

<!-- 1  -->

<div id="carousel" class="carousel slide center">
    <div class="carousel-inner">
        <div class="item active">
            <img src="images/c.png" alt="">
            <div class="carousel-caption">
                <div class="col-xs-12 col-md-12 ">
                    <a href="register" class="btn btn-link btn-lg col-lg-6"> Try for free </a>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- 2  -->

<div id="sss" class="container">
    <br><br>
    <h2>Benefits Address Book</h2>
    <br><br>
    <div class="row">
        <div class="col-md-4">
            <div>
                <img src="images/advantage1.png" alt="">
            </div>
            <h4>Simple and intuitive interface</h4>
            <p>
                The system interface is simple, clear and does not require additional time for the development. It is
                modern, fast, and allows you to concentrate on working with contacts.
            </p>
        </div>
        <div class="col-md-4">
            <div>
                <img src="images/advantage2.png" alt="">
            </div>
            <h4>Always available online</h4>
            <p>
                You and your colleagues get access to the system from anywhere where there is Internet. With the online
                Address Book system, all contacts information will be stored centrally.
            </p>
        </div>
        <div class="col-md-4">
            <div>
                <img src="images/advantage3.png" alt="">
            </div>
            <h4>It does not require support costs</h4>
            <p>
                No need to hire a programmer to set up and support Address Book. Our specialists provide a stable
                operation of the system and the security of your data.
            </p>
        </div>
    </div>
    <br><br>
    <hr id="capabilities">
</div>
<br><br><br><br>

<!-- 3  -->

<div class="container">
    <div class="row">
        <h2>Capabilities Address Book</h2>
        <br><br>
        <div class="col-lg-6 centered"><img class="img-capabilities" src="images/user.png" alt="">
        </div>
        <div class="col-lg-6">
            <h4>Description</h4>
            <p>Address Book is a contact management software, wherewith you can note the addresses,
                birthdays, phone numbers, mobile, country, city, email addresses of your contacts.</p>
            <h4>Key features of contact manager software :</h4>
            <p>
                <i class="glyphicon glyphicon-ok"></i>For personal and commercial use<br>
                <i class="glyphicon glyphicon-ok"></i>Easily search for contact
                information<br>
                <i class="glyphicon glyphicon-ok"></i>Easy personal information management<br>
                <i class="glyphicon glyphicon-ok"></i>Custom fields<br>
                <i class="glyphicon glyphicon-ok"></i>Free support<br>
                <i class="glyphicon glyphicon-ok"></i>Free access 24/7<br>
            </p>
        </div>
    </div>
    <br><br>
    <hr>
    <br><br>
    <div class="row">
        <div class="col-lg-6 centered">
            <img class="img-capabilities" src="images/users.png" alt="">
        </div>
        <div class="col-lg-6">
            <h4>Contacts</h4>
            <p>This feature allows you to keep records of contacts who are your customers. Quickly create a
                contact. For the success of your customer base should be kept up to date sostoyanii.
                Ispolzuyte fields to store additional information.</p>
            <p>The Address Book is all that is necessary to maintain the customer base.</p>
        </div>
    </div>

    <br><br>
    <hr>
    <br><br>
    <div class="row">
        <div class="col-lg-6 centered">
            <img class="img-capabilities" src="images/useredit.png" alt="">
        </div>
        <div class="col-lg-6">


            <h4>Contact Card</h4>
            <p>The contact card contains the full spectrum of information about the client.Information at
                any time to edit or delete a contact.</p>

        </div>
    </div>
    <br>
    <br>
    <hr id="prices">
</div>

<!-- 4  -->

<div class="container center">
    <div class="row">
        <br><br>
        <p>
        <h2>PRICING PLANS</h2></p>
        <div class="col-md-4">
            <table class="table table-bordered">
                <thead class="prices">
                <tr>
                    <th><h3>START</h3></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>€19/ yr</td>
                </tr>
                <tr>
                    <td>1000 contacts</td>
                </tr>
                <tr>
                    <td>5 users</td>
                </tr>
                <tr>
                    <td>1 Year Free Support</td>
                </tr>
                <tr>
                    <td><a href="#" class="btn btn-link">Sing up</a></td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-md-4">
            <table class="table table-bordered">
                <thead class="prices">
                <tr>
                    <th><h3>BUSINESS</h3></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>€29/ yr</td>
                </tr>
                <tr>
                    <td>15 000 contacts</td>
                </tr>
                <tr>
                    <td>10 users</td>
                </tr>
                <tr>
                    <td>2 years Free Support</td>
                </tr>
                <tr>
                    <td><a href="#" class="btn btn-link">Sing up</a></td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-md-4">
            <table class="table table-bordered">
                <thead class="prices">
                <tr>
                    <th><h3>VIP</h3></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>€49/ yr</td>
                </tr>
                <tr>
                    <td>30 000 contacts</td>
                </tr>
                <tr>
                    <td>20 users</td>
                </tr>
                <tr>
                    <td>5 years Free Support</td>
                </tr>
                <tr>
                    <td><a href="#" class="btn btn-link">Sing up</a></td>
                </tr>
                </tbody>
            </table>
            <br>
            <br>
        </div>
        <br>
        <a href="register" class="btn btn-link btn-lg col-md-8 col-md-offset-2">
            <span>Start your free 14-day trial period</span>
        </a>
    </div>
</div>

<br><br>
<hr>
<!-- 5  -->
<section id="contact" class="section2 center">
    <div class="container">
        <div class="row">
            <h2>Contact Us</h2><br>
            <div class="col-md-4">
                <i class="glyphicon glyphicon-map-marker"></i>
                <p>265 6th Avenue, 5th Floor,
                    <br> New York, NY 10001
                </p>
            </div>
            <div class="col-md-4">
                <i class="glyphicon glyphicon-envelope"></i>
                <p>info@yourcompany.com</p>
            </div>
            <div class="col-md-4">
                <i class="glyphicon glyphicon-earphone"></i>
                <p> +1 200 123 4567</p>
            </div>
        </div>
        <br>
        <div class="row">
            <div class="col-lg-10 col-lg-offset-1 centered">
                <form action="sendemail" method="post">
                    <div class="row">
                        <div class="col-xs-12 col-md-6 form-group">
                            <input class="form-control" name="cf_name" placeholder="Name" type="text" required="">
                        </div>
                        <div class="col-xs-12 col-md-6 form-group">
                            <input class="form-control" name="cf_email" placeholder="Email" type="email" required="">
                        </div>
                    </div>
                    <br>
                    <textarea class="form-control" name="cf_message" placeholder="Message" rows="7"></textarea>
                    <div class="row">
                        <br><br>
                        <div class="col-xs-12 col-md-12 ">
                            <button class="btn btn-link btn-lg col-lg-12" type="submit">Send Message</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <br><br><br>
    </div>
</section>

<!-- 6  -->

<section id="bottom">
    <div class="container">
        <div class="row">
            <img src="images/a.png">
            © Copyright 2016 | Developed By Hol&Art Company
        </div>
    </div>
</section>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
</body>
</html>





