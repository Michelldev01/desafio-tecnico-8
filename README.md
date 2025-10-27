# Desafio Técnico: Git e GitHub

Bem-vindo ao nosso desafio técnico! O objetivo deste exercício é avaliar suas habilidades em Programação Orientada a Objetos (POO) em Java, implementando uma classe com base em um modelo pré-definido.

Este repositório contém 20 definições de classes independentes. Cada candidato deve implementar **apenas uma** classe da lista abaixo a escolha do recrutador.

## 🚀 O Desafio

Você deve implementar a classe escolhida em um arquivo `.java` correspondente, seguindo todos os requisitos listados abaixo.

### Requisitos da Classe

Cada classe deve conter **obrigatoriamente**:

1.  **Atributos:** Todos os atributos listados na definição da classe.
2.  **Construtor:** Um construtor que receba parâmetros para inicializar **todos** os atributos da classe.
3.  **Getters e Setters:** Métodos `get` e `set` para todos os atributos (seguindo as convenções do Java).
4.  **Métodos Específicos:** A implementação dos 2 métodos de comportamento específicos listados para a classe.

## 📝 Instruções de Entrega

Siga rigorosamente este fluxo de trabalho para que sua entrega seja validada:

1.  **Fork do Repositório:** Faça um "Fork" deste repositório para a sua própria conta no GitHub.
2.  **Clone:** Clone o seu fork para a sua máquina local (`git clone ...`).
3.  **Crie sua Branch:** Crie uma nova branch a partir da `main` com o nome da classe que você escolheu. O padrão deve ser `feature/<NomeDaClasse>`.
    * *Exemplo:* Se você escolheu a classe `Carro`, sua branch deve se chamar `feature/Carro`.
    * Comando: `git checkout -b feature/Carro`
4.  **Implemente a Classe:** Crie o arquivo `.java` (ex: `Carro.java`) dentro do diretório raiz deste projeto e implemente todos os requisitos.
6.  **Commit e Push:** Faça o commit do seu trabalho e envie para o seu fork.
    * `git add Carro.java`
    * `git commit -m "Implementação da classe Carro"`
    * `git push origin feature/Carro`
7.  **Abra o Pull Request (PR):** No GitHub, vá até o seu fork e abra um "Pull Request" (PR) da sua branch (`feature/Carro`) para a branch `main` do repositório **original** (este repositório).
8.  **Aguarde a Revisão:** O recrutador irá revisar o seu PR e fornecer feedback.

Boa sorte!

---

## 📋 Lista de Classes para Implementação

### 1. `Carro`
* **Atributos:** `marca` (String), `modelo` (String), `ano` (int), `cor` (String), `velocidadeAtual` (double)
* **Métodos:**
    1.  `acelerar(double incremento)`: Aumenta a `velocidadeAtual` em `incremento`.
    2.  `frear(double decremento)`: Diminui a `velocidadeAtual` em `decremento` (não pode ser menor que zero).

### 2. `ContaBancaria`
* **Atributos:** `numeroConta` (String), `nomeTitular` (String), `saldo` (double), `limite` (double), `tipoConta` (String - ex: "Corrente", "Poupança")
* **Métodos:**
    1.  `sacar(double valor)`: Diminui o `saldo`. Deve verificar se há saldo (ou limite) suficiente.
    2.  `depositar(double valor)`: Aumenta o `saldo`.

### 3. `Produto`
* **Atributos:** `codigo` (int), `nome` (String), `descricao` (String), `preco` (double), `estoque` (int)
* **Métodos:**
    1.  `adicionarEstoque(int quantidade)`: Aumenta a quantidade em `estoque`.
    2.  `removerEstoque(int quantidade)`: Diminui a quantidade em `estoque`. Deve verificar se há estoque suficiente.

### 4. `Livro`
* **Atributos:** `titulo` (String), `autor` (String), `isbn` (String), `anoPublicacao` (int), `numeroPaginas` (int)
* **Métodos:**
    1.  `abrir()`: Simula a abertura do livro (pode imprimir uma mensagem).
    2.  `detalhesDoLivro()`: Retorna uma String formatada com todos os detalhes do livro.

### 5. `Aluno`
* **Atributos:** `matricula` (String), `nome` (String), `email` (String), `curso` (String), `notas` (List<Double>)
* **Métodos:**
    1.  `calcularMedia()`: Retorna a média aritmética das `notas`.
    2.  `verificarAprovacao()`: Retorna `true` se a média for >= 7.0, e `false` caso contrário.

### 6. `Funcionario`
* **Atributos:** `idFuncionario` (int), `nome` (String), `cargo` (String), `salario` (double), `dataAdmissao` (LocalDate)
* **Métodos:**
    1.  `promover(String novoCargo, double novoSalario)`: Atualiza o `cargo` e o `salario`.
    2.  `calcularSalarioAnual()`: Retorna o `salario` multiplicado por 12.

### 7. `Pedido`
* **Atributos:** `idPedido` (int), `nomeCliente` (String), `itens` (List<String>), `valorTotal` (double), `status` (String - ex: "Pendente", "Enviado")
* **Métodos:**
    1.  `adicionarItem(String item)`: Adiciona um item à lista `itens`.
    2.  `atualizarStatus(String novoStatus)`: Altera o `status` do pedido.

### 8. `Cliente`
* **Atributos:** `idCliente` (int), `nome` (String), `cpf` (String), `telefone` (String), `email` (String)
* **Métodos:**
    1.  `fazerLogin(String email, String senha)`: Simula um login (pode apenas verificar se o email bate).
    2.  `atualizarTelefone(String novoTelefone)`: Atualiza o atributo `telefone`.

### 9. `Filme`
* **Atributos:** `titulo` (String), `diretor` (String), `anoLancamento` (int), `genero` (String), `duracaoMinutos` (int)
* **Métodos:**
    1.  `play()`: Imprime uma mensagem "Reproduzindo o filme [titulo]".
    2.  `pausar()`: Imprime uma mensagem "Filme [titulo] pausado".

### 10. `Musica`
* **Atributos:** `nome` (String), `artista` (String), `album` (String), `duracaoSegundos` (int), `genero` (String)
* **Métodos:**
    1.  `tocar()`: Imprime uma mensagem "Tocando [nome] de [artista]".
    2.  `parar()`: Imprime uma mensagem "Música parada".

### 11. `Computador`
* **Atributos:** `marca` (String), `modelo` (String), `processador` (String), `memoriaRamGB` (int), `armazenamentoGB` (int)
* **Métodos:**
    1.  `ligar()`: Altera um atributo booleano (crie-o, ex: `isLigado`) para `true`.
    2.  `desligar()`: Altera o atributo booleano para `false`.

### 12. `Celular`
* **Atributos:** `marca` (String), `modelo` (String), `numeroTelefone` (String), `sistemaOperacional` (String), `nivelBateria` (int - 0 a 100)
* **Métodos:**
    1.  `fazerLigacao(String numero)`: Imprime "Ligando para [numero]...".
    2.  `carregarBateria()`: Define o `nivelBateria` como 100.

### 13. `Endereco`
* **Atributos:** `rua` (String), `numero` (String), `complemento` (String), `bairro` (String), `cidade` (String), `cep` (String)
* **Métodos:**
    1.  `formatarEnderecoCompleto()`: Retorna uma String única com o endereço formatado (ex: "Rua X, N 10, Bairro Y...").
    2.  `validarCep()`: Retorna `true` se o CEP tiver um formato válido (ex: 8 dígitos), `false` caso contrário.

### 14. `Fatura`
* **Atributos:** `codigoBarras` (String), `dataVencimento` (LocalDate), `valor` (double), `nomePagador` (String), `statusPagamento` (String)
* **Métodos:**
    1.  `pagar()`: Altera o `statusPagamento` para "Pago".
    2.  `verificarAtraso()`: Retorna `true` se a `dataVencimento` for anterior à data atual (LocalDate.now()).

### 15. `Voo`
* **Atributos:** `codigoVoo` (String), `origem` (String), `destino` (String), `dataHoraPartida` (LocalDateTime), `assentosDisponiveis` (int)
* **Métodos:**
    1.  `reservarAssento(int quantidade)`: Diminui os `assentosDisponiveis`. Deve verificar se há assentos.
    2.  `cancelarReserva(int quantidade)`: Aumenta os `assentosDisponiveis`.

### 16. `Hotel`
* **Atributos:** `nome` (String), `endereco` (String), `estrelas` (int), `quartosDisponiveis` (int), `precoDiaria` (double)
* **Métodos:**
    1.  `fazerCheckIn(int numQuartos)`: Diminui o número de `quartosDisponiveis`.
    2.  `fazerCheckOut(int numQuartos)`: Aumenta o número de `quartosDisponiveis`.

### 17. `ReceitaCulinaria`
* **Atributos:** `nome` (String), `ingredientes` (List<String>), `instrucoes` (String), `tempoPreparoMin` (int), `porcoes` (int)
* **Métodos:**
    1.  `adicionarIngrediente(String ingrediente)`: Adiciona um item à lista `ingredientes`.
    2.  `imprimirReceita()`: Imprime todos os atributos da receita de forma formatada.

### 18. `TimeFutebol`
* **Atributos:** `nome` (String), `cidadeSede` (String), `anoFundacao` (int), `mascote` (String), `jogadores` (List<String>)
* **Métodos:**
    1.  `contratarJogador(String nomeJogador)`: Adiciona um jogador à lista `jogadores`.
    2.  `listarElenco()`: Imprime o nome de todos os jogadores da lista.

### 19. `Paciente`
* **Atributos:** `idPaciente` (String), `nome` (String), `dataNascimento` (LocalDate), `tipo_sanguineo` (String), `historicoMedico` (String)
* **Métodos:**
    1.  `atualizarHistorico(String novaEntrada)`: Adiciona (concatena) a `novaEntrada` ao `historicoMedico`.
    2.  `calcularIdade()`: Retorna a idade do paciente com base na `dataNascimento`.

### 20. `Evento`
* **Atributos:** `nome` (String), `local` (String), `dataHora` (LocalDateTime), `capacidadeMaxima` (int), `ingressosVendidos` (int)
* **Métodos:**
    1.  `venderIngresso(int quantidade)`: Aumenta os `ingressosVendidos`. Deve verificar se não ultrapassa a `capacidadeMaxima`.
    2.  `verificarDisponibilidade()`: Retorna o número de ingressos ainda disponíveis (capacidade - vendidos).
