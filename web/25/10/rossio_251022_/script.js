//
function addTextRepeated(num, text, id) {
    let par = document.getElementById(id);
    console.log(num, text, id, par);
    console.log(typeof num);
    if (typeof num == "number") {
        if (par == null || id == undefined) {
            for (let i = 0; i < num; i++) document.body.innerText += text;
        } else {
            for (let i = 0; i < num; i++) par.innerText += text;
        }
        return true;
    } else return false;
}