# UFMG Trocaê
Um aplicativo para empréstimo de jogos entre estudantes da UFMG

## Requisitos
Java version: 11  
Acesso à internet para instalação automática das dependências

## 1) Baixando e editando o código  
1. Dentro do Intelij, selecione File -> New -> Project from Existing Source -> Salecione o arquivo POM.xml
2. Na outra caixa, "Search for projects recursively" e "Import Maven projects automatically". 
3. Nesta mesma tela certifique-se que esteja apontando para o diretório do Java instalado. 
4. Na última tela, mantenha selecionado apenas com.trocaae:troca-ae:0.0.1-SNAPSHOT

Após o procedimento, o Maven irá baixar e instalar todas as depenências necessárias, o que pode levar algum tempo  

## 2) Para compilar e rodar o projet  
1. Execute o arquivo src/main/java/com.trocae.application/Application
2. Assim que a aplicação estiver compilada, o acesso aos endpoint estará disponível em http://localhost:9095/swagger-ui.html#/ 


## 3) Rodando testes
1. Dentro do Intelij, ao lado direito superior, terá a opçao Maven
2. Execute a opção Lifecycle -> test
