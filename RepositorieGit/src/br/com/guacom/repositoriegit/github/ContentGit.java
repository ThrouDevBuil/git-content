package br.com.guacom.repositoriegit.github;


//Check out - Resgatar

public class ContentGit {
	/*
	 *		(Distributed Version Control System ou DVCS)
	 * GitHub � uma plataforma de hospedagem de c�digo-fonte com controle de vers�o usando o Git. 
	 * Ele permite que programadores, utilit�rios ou qualquer usu�rio cadastrado na plataforma contribuam em projetos privados 
	 * e/ou Open Source de qualquer lugar do mundo. 
	 * GitHub � amplamente utilizado por programadores para divulga��o de seus trabalhos ou para que outros programadores 
	 * contribuam com o projeto, al�m de promover f�cil comunica��o atrav�s de recursos que relatam problemas ou mesclam
	 * reposit�rios remotos (issues, pull request).
	 * 
	 * A maior diferen�a entre Git e qualquer outro VCS, est� na forma que o Git trata os dados. 
	 * Conceitualmente, a maior parte dos outros sistemas armazena informa��o como uma lista de mudan�as por arquivo. 
	 * O Git considera que os dados s�o como um conjunto de snapshots (captura de algo em um determinado instante, como em uma foto) 
	 * de um mini-sistema de arquivos. Cada vez que voc� salva ou consolida (commit) o estado do seu projeto no Git, 
	 * � como se ele tirasse uma foto de todos os seus arquivos naquele momento e armazenasse uma refer�ncia para essa captura. 
	 * Para ser eficiente, se nenhum arquivo foi alterado, a informa��o n�o � armazenada novamente
	 * 
	 * A maior parte das opera��es no Git precisam apenas de recursos e arquivos locais para operar � 
	 * geralmente nenhuma outra informa��o � necess�ria de outro computador na sua rede.
	 * 
	 * O mecanismo que o Git usa para fazer o checksum � chamado de hash SHA-1, uma string de 40 caracteres composta de caracteres 
	 * hexadecimais (0-9 e a-f) que � calculado a partir do conte�do de um arquivo ou estrutura de um diret�rio no Git. 
	 * Tudo que o git armazena � identificado pelo valor hash do seu cont�udo.
	 * 
	 *  Git faz com que seus arquivos sempre estejam em um dos tr�s estados fundamentais: consolidado (committed), modificado (modified) 
	 *  e preparado (staged). Dados s�o ditos consolidados quando est�o seguramente armazenados em sua base de dados local. 
	 *  Modificado trata de um arquivo que sofreu mudan�as mas que ainda n�o foi consolidado na base de dados. 
	 *  Um arquivo � tido como preparado quando voc� marca um arquivo modificado em sua vers�o corrente para que ele fa�a parte do snapshot 
	 *  do pr�ximo commit (consolida��o).
	 * 
	 *  As tr�s se��es principais de um projeto do Git: o diret�rio do Git (git directory, repository), o diret�rio de trabalho 
	 *  (working directory), e a �rea de prepara��o (staging area).
	 * 
	 *  	Estados do Git:
	 *  		1 - O diret�rio do Git � o local onde o Git armazena os metadados e o banco de objetos de seu projeto. 
	 *  		Esta � a parte mais importante do Git, e � a parte copiada quando voc� clona um reposit�rio de outro computador.
	 * 	
	 *  		2 - O diret�rio de trabalho � um �nico checkout de uma vers�o do projeto. Estes arquivos s�o obtidos a partir da base de dados 
	 *  		comprimida (Redu��o do espa�o ocupado por dados no dispositivo) 
	 *          no diret�rio do Git e colocados em disco para que voc� possa utilizar ou modificar.
	 * 
	 * 			3 - A �rea de prepara��o � um simples arquivo, geralmente contido no seu diret�rio Git, 
	 * 			que armazena informa��es sobre o que ir� em seu pr�ximo commit. 
	 * 			� bastante conhecido como �ndice (index), mas est� se tornando padr�o cham�-lo de �rea de prepara��o.
	 * 
	 * O workflow b�sico do Git pode ser descrito assim:
	 *  
	 *		1 - Voc� modifica arquivos no seu diret�rio de trabalho.
	 *		2 - Voc� seleciona os arquivos, adicionando snapshots deles para sua �rea de prepara��o.
	 * 		3 - Voc� faz um commit, que leva os arquivos como eles est�o na sua �rea de prepara��o e os armazena permanentemente  
	 *			no seu diret�rio Git. 
	 * 
	 * 	Se uma vers�o particular de um arquivo est� no diret�rio Git, � considerada consolidada. 
	 *  Caso seja modificada mas foi adicionada � �rea de prepara��o, est� preparada. 
	 *  E se foi alterada desde que foi obtida mas n�o foi preparada, est� modificada. 
	 * 
	 * 
	 * 
	 * O que � controle de vers�o, e por que voc� deve se importar?
	 * 		- O controle de vers�o � um sistema que registra as mudan�as feitas em um arquivo ou um conjunto de arquivos 
	 * 		  	ao longo do tempo de forma que voc� possa recuperar vers�es espec�ficas (Version Control System ou VCS). 
	 * 		
	 * 		- Ele permite reverter arquivos para um estado anterior, reverter um projeto inteiro para um estado anterior, 
	 * 		   	comparar mudan�as feitas ao decorrer do tempo, ver quem foi o �ltimo a modificar 
	 * 			algo que pode estar causando problemas.
	 * 
	 * 
	 * 
	 * Cada altera��o que voc� faz fica gravada em um hist�rico, podendo ser visualizada e restaurada a qualquer instante.
	 * 
	 * O Git permite que voc� marque um dado estado do seu projeto com uma etiqueta, que pode ser usada para determinar uma vers�o dele.
	 * 
	 * Uma das fun��es do Git � centralizar os arquivos de trabalho, impedindo que haja confus�o sobre o que foi 
	 * e n�o foi modificado por cada um.
	 *
	 * N�o � poss�vel criar reposit�rios privados na vers�o gratuita. 
	 * � necess�rio pagar uma mensalidade para que seu c�digo n�o seja aberto.
	 * 
	 * 		Clone Repositorie:
	 * Para clonar um reposit�rio do Github, basta usar o comando git clone URL, 
	 * substituindo URL pelo endere�o de clonagem do Github. 
	 * O endere�o de clonagem pode ser encontrado na p�gina do reposit�rio, 
	 * ou adicionando-se o final .git ao endere�o da p�gina do reposit�rio.
	 *
	 *
	 * Ao clonar um reposit�rio, o Git vai te mostrar o progresso e enfim uma mensagem de sucesso.
	 *
	 * O Git permite que realizemos o controle de vers�o de um reposit�rio, por�m um reposit�rio deve 
	 * ser associado diretamente com uma pasta no sistema de arquivos. 
	 * Portanto, n�o podemos adicionar arquivos localizados em pastas diferentes que n�o estejam associadas ao mesmo reposit�rio.
	 *
	 * Para navegar pelo reposit�rio, basta entrar no diret�rio criado usando o comando (cd 'nome do reposit�rio')
	 * 
	 * Para visualizar as tags de um projeto, basta entrar no diret�rio do reposit�rio e digitar o comando git tag.
	 * 
	 * dir - Visualizar os arquivos dispon�veis
	 * 
	 * git diff v0.1 v0.2 - Verifica quais foram as altera��es que ocorreram no projeto
	 * 
	 * A op��o checkout altera seu reposit�rio local fazendo com que seus arquivos fiquem 
	 * no mesmo estado em que estavam quando a tag v0.1 foram criados!
	 * git blame (nomeDoArquivo) - Mostra as altera��es linha por linha e a data de altera��o
	 * 
	 * Ao rodar o comando git diff v0.1 v0.2, vemos as altera��es entre uma vers�o e a outra. 
	 * No caso, a frase est� com um s�mbolo (-) na frente, indicando que esta foi removida da vers�o 0.1 pra 0.2.
	 *
	 * Pasta com controle de altera��es = Reposit�rio.
	 * git init - Para transformar a pasta em um rep�sitorio. (O git controlar� esta pasta)
	 * 
	 * mdkdir - Cria uma pasta
	 * 
	 * git ls-files - Mostra todos os arquivos que est�o sendo controlados pelo git
	 * 
	 * git status - O comando git status exibe um resumo dos arquivos modificados, 
	 * adicionados ou exclu�dos de seu working directory, em compara��o com o HEAD. (untracked - N�o est� rastreando "monitorando")
	 * 
	 * git add - O comando git add, seguido pelo caminho relativo ou completo do arquivo, 
	 * registra que o mesmo deve ser adicionado ao controle de vers�o!
	 * 
	 * git commit -m "" - Precisa de uma mensagem para descrever qual opera��o est� sendo efetuada 
	 * Grava as altera��es no reposit�rio. Faz com que as altera��es registradas, como uma modifica��o de arquivo ou 
	 * o rastreamento de um arquivo novo, sejam incorporadas no hist�rico de modifica��es como um novo ponto de trabalho.. 
	 * 
	 * 
	 * git config user.name "Nome" - Para saber quem efetuou a altera��o
	 * git config user.email "email" - Para vincular a conta do git
	 */
	
	
}
