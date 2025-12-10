function view() {
    document.getElementById("def").style.display = "inline";
}

document.getElementById("title").addEventListener("click", view);
document.getElementById("title").addEventListener("mouseenter", view);
document.getElementById("title").addEventListener("click", () => {
    alert("Hi");
    document.getElementById("title").removeEventListener("mouseenter", view);
});
