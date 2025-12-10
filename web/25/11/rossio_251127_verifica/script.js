let poligono = {
    lato: 5,
    num: 23
}

function perimetro(poligono) {
    return (poligono.lato * poligono.num).toFixed(2);
}

function aggiungiLato(poligono) {
    return ++poligono.num;
}

function modificaPoligono(poligono, newNum) {
    if (typeof newNum == "number" && newNum > 2) poligono.num = newNum;
}

let figure = [
    {
        lato: 3.12,
        num: 3
    },
    {
        lato: 3,
        num: 3
    },
    {
        lato: 5.23,
        num: 4
    },
    {
        lato: 15,
        num: 6
    },
    {
        lato: 8,
        num:5
    }
]

function fillTable(array, id) {
    let target = document.getElementById(id);
    target.innerHTML = `<div class="row"><div class="col fw-bold col-4">Numero Lati</div><div class="col fw-bold col-4">Dimensione lati</div><div class="col fw-bold col-4">Perimetro</div></div>`;
    for (let i = 0; i < array.length; i++) {
        target.innerHTML += `<div class="row border border-1" id="${id}-${i}"><div class="col-4">${figure[i].num}</div><div class="col-4">${figure[i].lato}</div><div class="col-4">${perimetro(figure[i])}</div></div>`;
    }
}

function estraiTriangoli(array) {
    const triangoli = [];
    for (let i = 0; i < array.length; i++) if (array[i].num == 3) triangoli.push(i);
    return triangoli;
}

let mieiTriangoli = estraiTriangoli(figure);

function evidenzia(n) {
    for (let i = 0; i < figure.length; i++) {
        let target = document.getElementById("tabellaPoligoniModificati-" + i);
        target.style = figure[i].num == n ? "background: lightgreen;" : "background: white;";
    }
}

document.getElementById("evidenziaTriangoli").addEventListener("mouseenter", function () {
    evidenzia(3);
})

document.getElementById("evidenziaQuadrati").addEventListener("mouseenter", function () {
    evidenzia(4);
})

document.getElementById("evidenziaPentagoni").addEventListener("mouseenter", function () {
    evidenzia(5);
})

document.getElementById("evidenziaTriangoli").addEventListener("mouseleave", function () {
    evidenzia(-1);
})

document.getElementById("evidenziaQuadrati").addEventListener("mouseleave", function () {
    evidenzia(-1);
})

document.getElementById("evidenziaPentagoni").addEventListener("mouseleave", function () {
    evidenzia(-1);
})

fillTable(figure, "tabellaPoligoni");

fillTable(mieiTriangoli, "tabellaTriangoli");

aggiungiLato(figure[0]);
modificaPoligono(figure[2], 5);
aggiungiLato(figure[3]);
modificaPoligono(figure[4], 8);

fillTable(figure, "tabellaPoligoniModificati");