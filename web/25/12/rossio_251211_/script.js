let door = {
    name: "A",
    reward: "Goat"
}

const doors = [
    {
        name: "A",
        reward: "Goat"
    },
    {
        name: "B",
        reward: "Goat"
    },
    {
        name: "C",
        reward: "Ralsei"
    },
    // {
    //     name: "D",
    //     reward: "Goat"
    // }
]

function makeDoors(array, id) {
    let target = document.getElementById(id);
    array.forEach(element => {
        target.innerHTML += `<button id="door-${element.name}" class="p-3">${element.name}</span></button>`;
        document.getElementById(`door-${element.name}`).addEventListener("click", () => {
            makeChoice(array, element.name);
        });
    })
}

makeDoors(doors,"doorContainer");

let userChoice;

function makeChoice(array, name) {
    console.log("name: " + name);
    for (let i of array) {
        console.log(i);
        console.log("value: " + i.name);
        if (name == i.name) {
            let temp = document.getElementById(`door-${name}`);
            temp.style = "background: red";
            temp.disabled = true;
            temp.removeEventListener("click",);
            break;
        }
    }
}