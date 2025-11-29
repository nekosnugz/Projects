function write() {
    let myDiv = document.getElementById("pars");
    myDiv.innerHTML += "<p>Il vincitore è... Orlando!</p>";
}


function write2() {
    let myDiv = document.getElementById("pars2");
    myDiv.innerHTML += "<p>Ciao mondo</p>";
    cont++;
    if (cont == 3) clearInterval(timer);
}

for (let i = 0; i < 5; i++) setTimeout(write, 1000 * (i+1));
let timer = setInterval(write2, 1000);
let cont = 0;