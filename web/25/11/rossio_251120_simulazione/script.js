const dadi = [
    {
        tipo: "D6",
        facce: 6,
        punteggi: [1, 2, 3, 4, 5, 6]
    },
    {
        tipo: "D20",
        facce: 20,
        punteggi: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    },
    {
        tipo: "D8",
        facce: 8,
        punteggi: [25, 50, 75, 100, 125, 150, 175, 200]
    },
    
]

let dado = {
    tipo: "D6",
    facce: 6,
    punteggi: [1, 2, 3, 4, 5, 6]
}

let punteggio = 0;

console.log(dado.tipo);
console.log(dado.facce);
console.log(dado.punteggi);

function lanciaDado(mioDado) {
    let risultato = mioDado.punteggi[Math.floor(Math.random() * mioDado.punteggi.length)];
    console.log(risultato);
    aggiornaPunteggio(risultato);
    return risultato;
}

function mostraLancio(mioDado, id) {
    let target = document.getElementById(id);
    let risultato = lanciaDado(mioDado);

    target.innerText = `Dal dado di tipo ${mioDado.tipo} con ${mioDado.facce} facce è uscito ${risultato}!`;
}

function creaPulsantiDadi() {
    let target = document.getElementById("container_pulsanti")
    for (let i = 0; i < dadi.length; i++) {
        target.innerHTML += `<button type="button" class="btn btn-outline-primary" onclick="mostraLancio(dadi[${i}], 'risultato_lancio')">Lancia dado ${i+1}</button>`
    }
    target.innerHTML += `<button type="button" class="btn btn-outline-primary" onclick="superTiro()">Super Tiro!</button>`;
    target.innerHTML += `<button type="button" class="btn btn-outline-primary" onclick="azzera()">Azzera il punteggio</button>`;
}

function aggiornaPunteggio(num) {
    let target = document.getElementById("punteggio");
    punteggio += num;
    target.innerText = `Punteggio totale: ${punteggio}`;
}

function superTiro() {
    let target = document.getElementById("risultato_lancio");
    let superRisultato = 0;
    target.innerHTML = "";

    for (let i = 0; i < dadi.length; i++) {
        let src = dadi[i];
        let risultato = src.punteggi[Math.floor(Math.random() * src.punteggi.length)];
        superRisultato += risultato;
        target.innerHTML += `<div class="col col-4 border border-3 fw-semibold"><p>Dado: ${src.tipo}</p><p>Risultato: ${risultato}</p></div>`;
    }
    aggiornaPunteggio(superRisultato);
    target.innerHTML += `<div class="col col-12 border border-3 p-3 fw-bold">Risultato del super tiro: ${superRisultato}</div>`;
}

function azzera() {
    aggiornaPunteggio(-punteggio);
    let target = document.getElementById("risultato_lancio");
    target.innerHTML = "";
}

creaPulsantiDadi();
aggiornaPunteggio(0);