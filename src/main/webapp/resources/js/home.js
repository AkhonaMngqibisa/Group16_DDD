
function scroll_activation() {
    let about = document.getElementById("about").getBoundingClientRect().top;
    let services = document.getElementById("services").getBoundingClientRect().top;
    let current = document.querySelector("nav li.active");
    if(services <= 1) {
        if (!current || current?.id !== "nav-services") {
            current?.classList.remove("active");
            document.getElementById("nav-services").classList.add("active");
        }
    }
    else if(about <= 1) {
        if (!current || current?.id !== "nav-about") {
            current?.classList.remove("active");
            document.getElementById("nav-about").classList.add("active");
        }
    }
    else {
        if (!current || current?.id !== "nav-home") {
            current?.classList.remove("active");
            document.getElementById("nav-home").classList.add("active");
        }
    }
}
scroll_activation();
document.addEventListener("scroll", scroll_activation);