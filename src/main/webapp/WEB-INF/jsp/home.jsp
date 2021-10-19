<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="../resources/css/home/home.css">
    <script src="resources/js/home.js" defer></script>
</head>
<body id="home">
    <header>
        <div class="logo">
            <img src="../resources/img/logo/logo_white.png" alt="">
        </div>
        <nav>
            <ul>
                <li id="nav-home"><a href="#home">Home</a></li>
                <li id="nav-about"><a href="#about">About</a></li>
                <li id="nav-services"><a href="#services">Services</a></li>
                <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                <li><a href="${pageContext.request.contextPath}/login">Log In</a></li>
            </ul>
        </nav>
    </header>
    <div class="main-img">
        <img src="resources/img/home/gym.png" alt="">
    </div>
    <div class="about content">
        <div id="about" class="hyperlink"></div>
        <h2>About</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. At commodi dolore ducimus est fuga quam quisquam voluptate! Deserunt dicta dolorum eveniet hic nam repellendus repudiandae veniam. Aliquam beatae debitis earum esse facere, illum ipsam, molestiae obcaecati optio, praesentium provident quam soluta temporibus vel veritatis. Amet consequuntur culpa dolores dolorum, eligendi et expedita facilis id illo impedit ipsam laudantium molestiae molestias nihil nobis numquam omnis quaerat quasi qui quidem reiciendis saepe sapiente sint, vel voluptatibus! Alias, atque delectus dolorem eaque eos error hic inventore molestiae nihil, qui quis quos repudiandae sint suscipit ullam, veritatis voluptatem. A architecto consectetur culpa delectus distinctio dolore doloremque, est harum, hic inventore, laborum laudantium magni mollitia nisi perspiciatis repellat soluta. Deleniti dolor dolorem eveniet maiores? Unde.</p>
    </div>
    <div class="services content">
        <div id="services" class="hyperlink"></div>
        <h2>Services</h2>
        <div class="service-cards">
            <div class="card"><img src="https://unsplash.it/250/250" alt=""></div>
            <div class="card"><img src="https://unsplash.it/251/251" alt=""></div>
            <div class="card"><img src="https://unsplash.it/252/252" alt=""></div>
        </div>
    </div>
</body>
</html>