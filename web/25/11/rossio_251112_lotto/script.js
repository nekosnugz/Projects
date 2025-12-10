let extracted = [];

function extractNumber() {
    let rep = 0;
    while (rep != 5) {
        if (extracted.length == 90) break;
        else {
            let draw = Math.floor(Math.random() * 90) + 1;
            console.log(draw);
            
            if (extracted.indexOf(draw) == -1) {
                extracted.push(draw);
                rep++;
            }
        }
    }
    if (extracted.length == 90) console.log("fine");
}