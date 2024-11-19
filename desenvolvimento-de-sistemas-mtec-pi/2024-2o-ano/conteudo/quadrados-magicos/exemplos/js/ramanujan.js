/*
 * Arquivo: ramanujan.js
 * Atualizado em: 19.11.2024
 * Objetivo: Retorna uma matriz quadrada de ordem 4 referente ao Quadrado Mágico de Ramanujan
*/

function ramanujan(dd, mm, aaaa) {

  // Converte aaaa em cc aa
  const ano_str = aaaa.toString();
  const cc = parseInt(ano_str[0] + ano_str[1]);
  const aa = parseInt(ano_str[2] + ano_str[3])

  let matriz = [];

  // Completa o Quadrado Mágico de Ramanujan
  matriz[0] = [dd, mm, cc, aa];
  matriz[1] = [aa + 1, cc - 1, mm - 3, dd + 3];
  matriz[2] = [mm - 2, dd + 2, aa + 2, cc - 2];
  matriz[3] = [cc + 1, aa - 1, dd + 1, mm - 1];

  return matriz;
}
