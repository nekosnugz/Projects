// let width = 24, height = 24;
// let mines = 99;

let side = 12;
let mines = 10, generated = 0;

let grid = new Array(side).fill(new Array(side).fill(0));

let res = "";

while (generated < mines) {
    let rand = Math.floor(Math.random() * (side * side));
    let x = rand / side;
    let y = rand % side;

    if (grid[y][x] != '*') {
        grid[y][x] = '*';
        generated++;
    }
}

for (let i = 0; i < side; i++) {
    for (let j = 0; j < side; j++) {
        if (grid[i][j] != '*') {
            if (grid[i][j+1] == '*') grid[i][j]++;
            if (i != side - 1 && j != side - 1 && grid[i+1][j+1] == '*') grid[i][j]++;
            if (i != side - 1 && grid[i+1][j] == '*') grid[i][j]++;
            
            if (i-1 > 0) {
                if (grid[i-1][j] == '*') grid[i][j]++;
                if (j != side - 1 && grid[i-1][j+1] == '*') grid[i][j]++;
            }

            if (j-1 > 0) {
                if (grid[i][j-1] == '*') grid[i][j]++;
                if (i != side - 1 && grid[i+1][j-1] == '*') grid[i][j]++;
            }
            
            if (i-1 > 0 && j-1 > 0 && grid[i-1][j-1] == '*') grid[i][j]++;
        }
        res += grid[i][j] + " ";
    }
    res += "\n";
}

console.log(res);