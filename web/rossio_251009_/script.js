// 
let people = [];
const maxPeople = 10;
let canAddButton = true;

function readFields() {
    let person = {
    name: "",
    surname: "",
    }

    let name = document.getElementById("field1");
    let surname = document.getElementById("field2");
    let response = document.getElementById("response");
    let signup = document.getElementById("btn-line");

    person.name = name.value;
    person.surname = surname.value;
    if (people.length < maxPeople) {
        response.innerHTML += `<p>Grazie ${person.name + " " + person.surname} per aver registrato i tuoi dati!</p><br>`;
        people.push(person);
        name.value = "";
        surname.value = "";
    } else {
        console.warn("Hai raggiunto il massimo numero di persone")
        if (canAddButton) {
            signup.innerHTML += `<button class="btn bg-info mx-4" input="button" onclick="drawPerson()">Sorteggia</button>`
        }
        canAddButton = false;
    }
}

function drawPerson() {
    let response = document.getElementById("response");
    let draw = Math.floor(Math.random() * (maxPeople));
    response.innerHTML = `<p class="bg-info">E' uscito ${people[draw].name} ${people[draw].surname}!</p>${response.innerHTML}`;
}