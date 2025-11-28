const students = ["Andrea", "Chiara", "Davide", "Elena", "Fabio", "Giulia", "Leonardo", "Luca", "Marco", "Matteo", "Nicole", "Paolo", "Sara", "Sofia", "Tommaso"];
const canBeExtracted = [true, true, true, true, true, true, true, true, true, true, true, true, true, true, true];
let studentsQty = students.length;

// console.log(students.length);
// console.log(canBeExtracted.length);

function generateStudents(a) {
    const first = a ? true : false;
    let qty = document.getElementById("students-qty");
    let target = document.getElementById("students-grid");

    studentsQty = qty.value;

    console.log(qty);
    console.log(qty.value);
    console.log(target);

    target.innerHTML = `<div class="list-group-item d-flex fw-bold bg-light"><div class="col-2">Numero di registro</div><div class="col-2">Estraibile</div><div class="col-8">Nome</div></div>`;
    for (let i = 0; i < qty.value; i++) {
        target.innerHTML += `<div class="list-group-item d-flex align-items-center" id="entry${i}"><div class="col-2 text-muted">${i+1}</div><div class="col-2"><input class="form-check-input list-checkbox" type="checkbox" id="extract${i}" onclick="toggleSelection(${i})" checked></div><div class="col-8"><input type="text" class="form-control" id="studentName${i}" placeholder="Studente n. ${i+1}" onkeypress="updateStudent(${i})"></div></div>`;
    }
    
    if (!first) {
        students.length = 0;
    }

    for (let i = 0; i < qty.value; i++) {
        let temp = document.getElementById("studentName" + i);
        // console.log(temp);
        // console.log(students[i]);
    
        if (first) students.push("Studente n. " + (i + 1));

        temp.value = first && students[i] != "undefined" && students[i] !== "" ? students[i] : "Studente n. " + (i + 1);

        canBeExtracted[i] = true;
    }
}

function toggleSelection(num) {
    let tar = document.getElementById("extract" + num);
    if (tar == null) alert("Valore non valido");
    else {
        canBeExtracted[num] = !canBeExtracted[num];
        tar.checked = canBeExtracted[num];        
    }
}

function selectAll() {
    for (let i = 0; i < studentsQty; i++) {
        console.log(i);
        let tar = document.getElementById("extract" + i);
        console.log(tar);
        
        canBeExtracted[i] = true;
        console.log("valore: " +tar);
        tar.checked = true;        
    }
}

function deselectAll() {
    for (let i = 0; i < studentsQty; i++) {
        console.log(i);
        let tar = document.getElementById("extract" + i);
        console.log(tar);
        
        canBeExtracted[i] = false;
        console.log("valore: " +tar);
        tar.checked = false;
    }
}

function updateStudent(num) {
    if (num == undefined) alert("Errore");
    else {
        let el = document.getElementById("studentName" + num);
        students[num] = el.value;
        console.log(students[num]);
    }
}

function extractRandomStudent() {
    let resultInput = document.getElementById("risultatoEstrazione");
    let studentName;
    let availableIndices = [];
    
    let entryElement;
    let checkbox;
    let nameInput;
    
    for (let i = 0; i < studentsQty && i < canBeExtracted.length; i++) {
        if (canBeExtracted[i]) {
            availableIndices.push(i);
        }
    }

    if (availableIndices.length === 0) {
        resultInput.value = "Nessun alunno estraibile rimanente.";
        // Aggiunto l'alert come richiesto
        alert("Attenzione: Tutti gli alunni sono stati estratti o deselezionati!");
        return;
    }

    const randomIndexInArray = Math.floor(Math.random() * availableIndices.length);
    const randomIndex = availableIndices[randomIndexInArray];

    
    if (students[randomIndex] && students[randomIndex].trim() !== "") {
        studentName = students[randomIndex];
    } else {
        studentName = document.getElementById("studentName" + randomIndex).placeholder;
    }
    
    
    entryElement = document.getElementById("entry" + randomIndex);
    checkbox = document.getElementById("extract" + randomIndex);
    nameInput = document.getElementById("studentName" + randomIndex);
    
    alert("Estratto/a: " + studentName);
    resultInput.value = "Estratto/a: " + studentName;

    canBeExtracted[randomIndex] = false;
    
    if (checkbox) {
        checkbox.checked = false; // Deseleziona
        checkbox.disabled = true; // Disattiva
    }
    
    if (nameInput) nameInput.disabled = true; // Rende il nome non modificabile

    if (entryElement) {
        // Sposta il focus (scrolla) all'alunno estratto
        entryElement.scrollIntoView({ behavior: 'smooth', block: 'center' });
        
        // Rimuove sfondi precedenti di disponibilità
        entryElement.classList.remove('bg-success-subtle', 'bg-secondary-subtle');
        
        // Imposta lo sfondo per l'alunno ESTRATTO (non più selezionabile)
        entryElement.classList.add('bg-danger-subtle'); 
    }
}

generateStudents(true);