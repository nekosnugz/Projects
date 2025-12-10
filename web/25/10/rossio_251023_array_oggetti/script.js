let phones = [
    {
        ind: 0,
        brand: "Samsung",
        model: "Galaxy S25 FE",
        MSRP: 649.99,
        screenSize: 6.7,
        SoC: "Exynos 2400",
        baseRAM: 8,
        baseStorage: 128,
        mainCameraMP: 50,
    },
    {
        ind: 1,
        brand: "Honor",
        model: "Magic8 Pro",
        MSRP: 719.99,
        screenSize: 6.71,
        SoC: "Snapdragon 8 Elite Gen 5",
        baseRAM: 12,
        baseStorage: 256,
        mainCameraMP: 200,
    },
    {
        ind: 2,
        brand: "Xiaomi",
        model: "17 Pro Max",
        MSRP: 719.99,
        screenSize: 6.9,
        SoC: "Snapdragon 8 Elite Gen 5",
        baseRAM: 12,
        baseStorage: 512,
        mainCameraMP: 50,
    },
    {
        ind: 3,
        brand: "Oppo",
        model: "Find X9 Pro",
        MSRP: 639.99,
        screenSize: 6.78,
        SoC: "Mediatek Dimensity 9500",
        baseRAM: 12,
        baseStorage: 256,
        mainCameraMP: 200,
    },
    {
        ind: 4,
        brand: "Apple",
        model: "iPhone 17 Pro Max",
        MSRP: 1489.99,
        screenSize: 6.9,
        SoC: "Apple A19 Pro",
        baseRAM: 12,
        baseStorage: 256,
        mainCameraMP: 48,
    }
]

function createPhoneButtons() {
    let phoneSelection = document.getElementById("phoneSelection");
    phoneSelection.innerHTML = null;
    for (let i = 0; i < phones.length; i++) {
        let a = phones[i];
        phoneSelection.innerHTML += `<button class="phones" id="phone${a.ind}" onclick="displayPhone(${a.ind})">${a.brand, a.model}</button>`;
    }
}

function displayPhone(index) {
    // console.log(phones[index]);
    // console.log(phones[index].brand, phones[index].model);
    // console.log(`img${index}.jpg`);
    let target = document.getElementById("info");
    target.innerHTML = `<img class="phoneImage" src="./images/img${index}.jpg" alt="a">
            <div>
                <h1>${phones[index].brand + " " + phones[index].model}</h1>
                <p>Prezzo: <span>€ ${phones[index].MSRP}</span></p>
                <p>Dimensione schermo: <span>${phones[index].screenSize}</span> </p>
                <p>Processore: <span>${phones[index].SoC}</span></p>
                <p><span>${phones[index].baseRAM}</span> GB RAM</p>
                <p><span>${phones[index].baseStorage}</span> GB Archiviazione</p>
                <p>Risoluzione fotocamera: <span>${phones[index].mainCameraMP} MP</span></p>
            </div>`;
}

createPhoneButtons()