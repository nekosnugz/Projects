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
    }
]

let open = Math.floor(Math.random() * doors.length);
let keepWin = 0, changeWin = 0;


console.log(open);