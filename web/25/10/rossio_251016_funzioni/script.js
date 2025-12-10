function writeElementContent(content, id) {
    document.getElementById(id).innerText = content;
}

function deleteElementContent(id) {
    document.getElementById(id).innerText = "";
}

function appendElementContent(content, id) {
    document.getElementById(id).innerText += content;
}

function duplicateElementContent(id) {
    document.getElementById(id).innerText += document.getElementById(id).innerText;
}