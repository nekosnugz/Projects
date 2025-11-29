const movies = ["Film1","Film2","Film3","Film4","Film5","Film6"];
const ratings = [];

function listMovies () {
    let dest = document.getElementById("lista");
    for (let i in movies) {
        dest.innerHTML += `<li>${movies[i]}</li>`;
    }

    document.getElementById("filmSelection").setAttribute("min", 1);
    document.getElementById("filmSelection").setAttribute("max", movies.length);
}

function sendRating() {
    let mail = document.getElementById("email");
    let filmSel = document.getElementById("filmSelection");
    
    let submission = {
        email: mail.value,
        filmIndex: filmSel.value,
    }

    console.log(submission.email);
    console.log(submission.filmIndex);

    ratings.push(submission);

    mail.value = null;
    filmSel.value = null;
    console.log(ratings);
}

function listMostVoted() {
    let movieVotes = [];
}

listMovies();