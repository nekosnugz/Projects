function setUnit() {
    let sourceSel = document.getElementById("source");
    let targetSel = document.getElementById("target");
    let selVal = source.val;
    let validUnitGroup = 0;

    // Imposto l'altro select con unità valide per la conversione
    switch (selVal) {
        case 0:     // Peso
        case 1:
        case 2:
            validUnitGroup = 0;
            break;
        case 3:     // Lunghezza
        case 4:
            validUnitGroup = 1;
            break;
        case 5:
        case 6:
        case 7:
            validUnitGroup = 2;
            break;
        case 8:
        case 9:
        case 10:
            validUnitGroup = 3;
            break;
        // default:
        //     alert("Errore fatale");
        //     location.reload();
    }

    for (let i = 0; i < 4; i++) {
        let temp = document.getElementById("targetLabel" + i);
        temp.style.display = (i == validUnitGroup) ? "block" : "none";
        if (i == 0) targetSel.value = 0;
        if (i == 1) targetSel.value = 3;
        if (i == 2) targetSel.value = 5;
        if (i == 3) targetSel.value = 8;
    }

    // Chiamo la funzione di conversione

}

function convertUnit() {
    let sourceSel = document.getElementById("source").value;
    let targetSel = document.getElementById("target").value;
    let input = document.getElementById("inputValue");
    let output = document.getElementById("outputValue");

    if (sourceSel == targetSel) output.value = input.value;
    else if (sourceSel == 0) {
        switch (targetSel) {
            case 1:
                output.value = input.value * 10e3; // Kg -> g == *1000
                break;
            case 2:
                output.value = input.value * 10e6;
                break;
        }
    } else if (sourceSel == 1) {
        switch (targetSel) {
            case 0:
                output.value = input.value / 10e3; // g 
                break;
            case 2:
                output.value = input.value * 10e3;
                break;
        }
    } else if (sourceSel == 2) {
        switch (targetSel) {
            case 1:
                output.value = input.value / 10e3;
                break;
            case 2:
                output.value = input.value / 10e6;
                break;
        }
    } else if (sourceSel == 3) {
        
    }



    // console.log(outputValue.value);

}