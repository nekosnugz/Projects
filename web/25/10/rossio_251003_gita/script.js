const time = new Date();

let form = {
    parentFname: null,
    studentFname: null, studentClass: null,
    destination: null,
    date: null,
    departTime: null,
    returnTime: null,
    price: null,
    fields: null
}

form.fields = [];

for (let i = 0; i < 10; i++) {
    form.fields[i] = document.getElementById("input" + i);
}


function compileForm() {
    form.parentFname = prompt("Inserisci il nome completo del genitore dell'alunno");
    form.studentFname = prompt("Inserisci il nome completo dell'alunno");
    form.studentClass = prompt("Inserisci la classe dell'alunno");
    form.date = prompt("Inserisci il giorno della partenza");
    form.destination = prompt("Inserisci la destinazione del viaggio d'istruzione");
    form.departTime = prompt("Inserisci la data e l'ora di partenza");
    form.returnTime = prompt("Inserisci la data e l'ora di ritorno");
    form.price = prompt("Inserisci il prezzo del viaggio in €");
    
    form.fields[0].innerText = form.parentFname;
    form.fields[1].innerText = form.studentFname;
    form.fields[2].innerText = form.studentClass;
    form.fields[3].innerText = form.studentFname;
    form.fields[4].innerText = form.destination;
    form.fields[5].innerText = form.date;
    form.fields[6].innerText = form.departTime;
    form.fields[7].innerText = form.returnTime;
    form.fields[8].innerText = form.price;
    form.fields[9].innerText = time.toDateString();
}