function _criarQuadrado() {
  const N = document.getElementById('ordem-quadrado').value;
  let quadrado_container = document.getElementById('quadrado-container');
  quadrado_container.innerHTML = ''; // Remove todos os elementos filhos
  const quadrado_magico = criarQuadrado(N);
  quadrado_magico.style.gridTemplateColumns = `repeat(${N}, 50px)`;

  // Adiciona a classe 'celula' (css) em todas as celulas
  const cels = quadrado_magico.children;
  for (let cel of cels) {
    cel.classList.add('celula');
  }
  quadrado_magico.setAttribute('id', 'quadrado-magico');
  quadrado_container.appendChild(quadrado_magico);
  console.log(quadrado_container);
}

function _metodoDeSiao() {
  var matriz = controllerConverterQuadradoParaMatriz();

}

function controllerConverterQuadradoParaMatriz() {
  const quadrado = document.getElementById('quadrado');
  const celulas = quadrado.children;
  const num_celulas = celulas.length;
  if (num_celulas == 0) {
    return;
  }
  const N = Math.round(Math.sqrt(num_celulas));
  if ((N * N) != num_celulas) {
    return;
  }
  // Verifica se a ordem do Quadrado Mágico é impar
  if (N % 2 == 0) {
    return;
  }
  // Armazena as células do Quadrado Mágico em uma matriz
  var matriz = [];
  var linha = [];
  for (let i = 0; i < celulas.length; i++) {
    celulas[i].innerHTML = '';
    linha.push(celulas[i]);
    if ((i + 1) % N == 0) {
      matriz.push(linha);
      linha = [];
    }
  }
  return matriz;
}
