let pallina = document.getElementById("pallina");
let posX = 0;
let posY = 0;

let repMS = 20;
let speedX = 15;
let speedY = 20;

let xTimer = setInterval(moveX, repMS);
let yTimer = setInterval(moveY, repMS);

function moveX() {
    if (posX >= window.innerWidth || posX < 0) speedX *= -1;
    pallina.style.left = `${posX += speedX}px`;
}

function moveY() {
    if (posY >= window.innerHeight || posY < 0) speedY *= -1;
    pallina.style.top = `${posY += speedY}px`;
}
