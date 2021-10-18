<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        body, html {
            background: lavenderblush;
        }

        header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background: lavender;
            padding: 10px 20px;
        }
        .logo img {
            max-width: 100px;
            display: block;
        }
        nav ul {
            list-style-type: none;
        }
        nav li {
            display: inline-block;
            margin: 0 10px;
        }
        nav a {
            text-decoration: none;
            color: black;
            font-weight: bold;
        }

        body > div.content {
            margin: 50px 5% 0;
        }

        .main-img {
            margin-top: 50px;
            width: 100%;
            display: grid;
        }

        .main-img img {
            width: 80%;
            margin: auto;
        }

        .content > h2 {
            margin-bottom: 1em;
        }

        .service-cards {
            display: flex;
            justify-content: space-evenly;
        }

        .service-cards img {
            width: 250px;
            height: 250px;
        }
    </style>
</head>
<body>
    <header>
        <div class="logo">
            <img src="../../resources/img/logo.jpg" alt="">
        </div>
        <nav>
            <ul>
                <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/services">Services</a></li>
                <li><a href="${pageContext.request.contextPath}/about">About</a></li>
                <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                <li><a href="/login">Log In</a></li>
            </ul>
        </nav>
    </header>
    <div class="main-img">
        <img src="../../resources/img/gym.png" alt="">
    </div>
    <div class="about content">
        <h2>About</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. At commodi dolore ducimus est fuga quam quisquam voluptate! Deserunt dicta dolorum eveniet hic nam repellendus repudiandae veniam. Aliquam beatae debitis earum esse facere, illum ipsam, molestiae obcaecati optio, praesentium provident quam soluta temporibus vel veritatis. Amet consequuntur culpa dolores dolorum, eligendi et expedita facilis id illo impedit ipsam laudantium molestiae molestias nihil nobis numquam omnis quaerat quasi qui quidem reiciendis saepe sapiente sint, vel voluptatibus! Alias, atque delectus dolorem eaque eos error hic inventore molestiae nihil, qui quis quos repudiandae sint suscipit ullam, veritatis voluptatem. A architecto consectetur culpa delectus distinctio dolore doloremque, est harum, hic inventore, laborum laudantium magni mollitia nisi perspiciatis repellat soluta. Deleniti dolor dolorem eveniet maiores? Unde.</p>
    </div>
    <div class="services content">
        <h2>Services</h2>
        <div class="service-cards">
            <div class="card"><img src="https://unsplash.it/250/250" alt=""></div>
            <div class="card"><img src="https://unsplash.it/251/251" alt=""></div>
            <div class="card"><img src="https://unsplash.it/252/252" alt=""></div>
        </div>
    </div>
</body>
</html>