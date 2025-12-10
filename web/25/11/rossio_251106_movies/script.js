let movies = [
    {
        title: "Movie1",
        src: "",
        alt: "insert img"
    },
    {
        title: "Movie2",
        src: "",
        alt: "insert img"
    },
    {
        title: "Movie3",
        src: "",
        alt: "insert img"
    },
    {
        title: "Movie4",
        src: "",
        alt: "insert img"
    },
    {
        title: "Movie5",
        src: "",
        alt: "insert img"
    },

]
let currentSlide = 0;

function setSlide(index) {
    let toHide = document.getElementById("slide" + currentSlide);

    switch (index) {
        case 'next':
            (currentSlide == 0) ? currentSlide = movies.length - 1 : currentSlide--;
            break;
            
        case 'previous':
            (currentSlide == movies.length - 1) ? currentSlide = 0 : currentSlide++;
            break;
            
        default:
            currentSlide = (index >= 0 && index < movies.length) ? index : console.warn("Unreacheable index");
    }
    let toShow = document.getElementById("slide" + currentSlide);
    toHide.style.display = "none";
    toShow.style.display = "block";
}

function initMovies(movieObjArr, tar) {
    let target = document.getElementById(tar);
    let defaultSlide;
    target.innerHTML = "";

    for (let i = 0; i < movies.length; i++) {
        content = movies[i];
        target.innerHTML += `<div class="slide inactive" id="slide${i}"><img src="${content.src}" alt="${content.title}"><p id="title${i}">${content.title}</p></div>`;
    }

    defaultSlide = document.getElementById("slide0");

    defaultSlide.classList.remove("inactive");
    defaultSlide.classList.add("active");
}

function updateLeaderboard() {
    let movieName = document.getElementById("movieName");
    let movieImg = document.getElementById("movieImg");

    if (movieName.value != '' &&  movieImg.value != '') {
        

    }

}

initMovies(movies, "slideContainer");