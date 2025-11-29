const scores = [];
let counter = 0;
let timeout = undefined;
let clickerButton = document.getElementById("button");
let resetButton = document.getElementById("reset");
let myPrompt = document.getElementById("prompt");

resetButton.disabled = true;
clickerButton.disabled = false;

function addCounter() {
    counter++;
    // console.log(counter);
    if (timeout == undefined) {
        timeout = setTimeout(() => {
            clickerButton.disabled = true;
            resetButton.disabled = false;
            console.log(`Total clicks: ${counter}`);
        }, 5000);
    }
}

function resetCounter() {
    clickerButton.disabled = false;
    resetButton.disabled = true;
    counter = 0;
}

function resetPrompt() {
    myPrompt.innerText = "Clicca su Conta per iniziare!";
}

resetPrompt();