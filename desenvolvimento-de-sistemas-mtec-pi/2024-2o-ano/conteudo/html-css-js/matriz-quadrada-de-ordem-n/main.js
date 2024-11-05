var ordemQuadrado = 0;

// Cria uma matriz de ordem "ordemQuadrado"

var celulas = [];

function criarQuadrado() {
  // celulas.splice(0, celulas.length); // Limpa celulas[]
  celulas = [];
  ordemQuadrado = document.getElementById('ordem-input').value;
  const quadrado = document.getElementById('quadrado');
  quadrado.innerHTML = ''; // Remove todos os elementos filhos
  quadrado.style.gridTemplateColumns = `repeat(${ordemQuadrado}, 50px)`;

  for (let row = 0; row < ordemQuadrado; row++) {
    // linha.splice(0, linha.length); // Limpa linha[]
    linha = [];
    for (var col = 0; col < ordemQuadrado; col++) {
      linha[col] = document.createElement('div');
      linha[col].classList.add('celulas');
      linha[col].innerText = `${row}, ${col}`;
    }
    celulas.push(linha);
  }

  for (let row = 0; row < ordemQuadrado; row++) {
    for (var col = 0; col < ordemQuadrado; col++) {
      quadrado.appendChild(celulas[row][col]);
    }
  }
}

function alterarValores() {

  for (let row = 0; row < celulas.length; row++) {
    linha = [];
    for (let col = 0; col < celulas.length; col++) {
      linha[col] = celulas[row][col];
      linha[col].innerText = 100;
    }
  }
}

/*
const quadrado = document.getElementById('quadrado');

let celulaAtual;

if (celulas.length > 0) {
  celulaAtual = celulas[0][0];
}
document.addEventListener('keyup', (e) => {
  if (e.key == 'ArrowRight') {

  }
});
*/
