# Sistema de Cadastro de Produtos

## Intergrantes do Grupo
Yuri Lemos Xavier Ferreira - 22600726
Vinicius Ilha Guerra de Paiva - 22602048

## Descrição

Mini sistema CRUD em Java, executado pelo terminal (CLI), para cadastrar produtos de um estoque. Os dados ficam só na memória, então são perdidos quando o programa é encerrado.

## Funcionalidades

- **Cadastrar produto:** informa nome, quantidade e preço. O nome não pode ser vazio, a quantidade não pode ser negativa e o preço deve ser maior que zero. Se algum dado for inválido, o programa mostra "Dados invalidos" e volta ao menu.
- **Listar produtos:** mostra todos os produtos cadastrados, numerados.
- **Atualizar produto:** escolhe o número do produto e informa os novos dados, com a mesma validação do cadastro.
- **Remover produto:** escolhe o número do produto para excluí-lo.
- **Encerrar:** o programa roda até o usuário digitar 0.

## Organização

```
src/
├── app/Main.java              (menu do programa)
└── modelo/
    ├── Produto.java           (classe do produto)
    ├── EstruturaList.java     (CRUD com ArrayList)
    └── EstruturaArray.java    (versão com vetor, não usada no Main)
```

## Como executar

É necessário ter o JDK instalado.

1. Abra o terminal na pasta do projeto (onde está a pasta `src`).
2. Compile:

   ```
   javac -d out src/app/Main.java src/modelo/*.java
   ```

3. Execute:

   ```
   java -cp out app.Main
   ```

4. Digite o número da opção do menu e aperte Enter. Digite 0 para encerrar.
