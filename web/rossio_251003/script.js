let welcomeMessage = document.getElementById("welcome_message");

let user = {
    name: "Orlando",
    surname: "Rossi"
};

function welcome() {
    welcomeMessage.innerText = `welcome ${user.name} ${user.surname}`;
}

welcome();