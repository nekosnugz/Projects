let dest = document.getElementById("pSpace");
let warnDiv = document.getElementById("warn");
let addBtn = document.getElementById("addP");
let parCount = 0;

function addParagraph() {
    parCount++;
    if (parCount == 10) addBtn.disabled = true;
    dest.innerHTML += `<p class="text-start bg-secondary text-white px-3 my-1">Ciao, questo e' il paragrafo ${parCount}</p>`;
    warnDiv.innerText = `Numero di paragrafi: ${parCount}/10`
}

function clearParagraph() {
    dest.innerHTML = "";
    warnDiv.innerText = ""
    parCount = 0;
    addBtn.disabled = false;
    warnDiv.innerText = `Numero di paragrafi: 0/10`
}