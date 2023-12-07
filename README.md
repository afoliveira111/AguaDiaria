# Agua Diaria
 "Aguadiaria". Este aplicativo Android foi desenvolvido para acompanhar o consumo diário de água, proporcionando uma experiência intuitiva e interativa. Abaixo estão os principais detalhes sobre as tecnologias, arquiteturas e recursos utilizados no desenvolvimento.



## :camera_flash: Screenshots
<!-- You can add more screenshots here if you like -->

<img src="/result/Screenshot_1.png" width="260">&emsp;<img src="/result/Screenshot_2.png" width="260">&emsp;<img src="/result/Screenshot_3.png" width="260"><img 


# Tecnologias Utilizadas

* Snackbar: Esse componente fornece uma notificação leve e temporária para feedback do usuário.
* Recursos de string: O aplicativo usa recursos de string para o texto exibido em vários elementos da interface do usuário, permitindo uma localização e personalização fáceis.

# Componentes de UI:

* TextView
* EditText
* Button
  

# Classe GlassPreferences
Ela é responsável por gerenciar preferências relacionadas ao consumo de água. Ela utiliza o SharedPreferences para armazenar e recuperar dados de forma eficiente. A classe possui os seguintes métodos principais:

* save(value: Int): Salva a quantidade diária de água consumida.
* fetch(): Recupera a quantidade diária de água consumida.
  
  
# Enum Class GlassType
Ela define os tipos de copos disponíveis para o usuário. Cada tipo tem um valor associado representando a quantidade de água que o copo pode armazenar. Os tipos de copos são:

* SMALL(200): Copo pequeno com capacidade para 200 ml.
* MEDIUM(250): Copo médio com capacidade para 250 ml.
* LARGE(500): Copo grande com capacidade para 500 ml.

 

 # TODO

* Melhorar a estilização do aplicativo.
  
* Melhorar o visual

## Autor

Antonio Felipe Oliveira | **LinkedIn www.linkedin.com/in/id-antonio-felipe**



## License

The MIT License (MIT)

Copyright (c) 2023 Antonio Felipe Oliveira

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
