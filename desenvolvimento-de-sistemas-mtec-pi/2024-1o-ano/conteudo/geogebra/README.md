<sup>Estudos Avançados em Matemática e suas Tecnologias</sup>
<img alt="" width="99%" height="2px" align="right">

&nbsp;

<h1 align="center">GeoGebra</h1>
<h4 align="center">Prof. Eduardo Ono</h4>
<h6 align="center">Atualizado em: 11/11/2024</h6>

&nbsp;

```javascript
function clear() {
    for (var ind = ggbApplet.getObjectNumber() - 1; ind >= 0; ind = ind - 1) {
        var obj = ggbApplet.getObjectName(ind)
        var type = ggbApplet.getObjectType(obj)
        /*alert("" + ind + "  "+ obj + "  " + type)*/
        if (type == "point") {
            ggbApplet.deleteObject(obj)
        }
    }
}

function m(c, j, t) {
    let montante = c * Math.pow((1 + j), t);
    return montante;
}

clear();
c = 10000;
j = 0.006;
meses = 120
for (var t = 0; t <= meses; t++) {
    y = m(c, j, t);
     ggbApplet.evalCommand("A_" + t + "=(" + t + "," + y + ")");
}

// Ajusta o intervalo dos eixos x e y
var min_x = -1;
var min_y = c - 0.1 * c;
var max_x = t + 1;
var max_y = m(c, j, meses);
max_y = max_y + 0.1 * max_y;
ggbApplet.evalCommand("ZoomIn(" + min_x + "," + min_y + "," + max_x + "," + max_y + ")");
```

&nbsp;

| Thumb | Descrição |
| --- | --- |
| ![img](https://img.youtube.com/vi/By-FJn-tjTY/default.jpg) | <sup>[Alessandri Giuseppe]</sup> [__ggBJavaScript__](https://www.youtube.com/watch?v=By-FJn-tjTY)<br><sub>(19:04, YouTube, 22/Out/2020)</sub> |
