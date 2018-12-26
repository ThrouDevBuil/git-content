package br.com.guacom.repositoriegit.github;


//Check out - Resgatar

public class ContentGit {
	/*
	 *		(Distributed Version Control System ou DVCS)
	 * GitHub é uma plataforma de hospedagem de código-fonte com controle de versão usando o Git. 
	 * Ele permite que programadores, utilitários ou qualquer usuário cadastrado na plataforma contribuam em projetos privados 
	 * e/ou Open Source de qualquer lugar do mundo. 
	 * GitHub é amplamente utilizado por programadores para divulgação de seus trabalhos ou para que outros programadores 
	 * contribuam com o projeto, além de promover fácil comunicação através de recursos que relatam problemas ou mesclam
	 * repositórios remotos (issues, pull request).
	 * 
	 * A maior diferença entre Git e qualquer outro VCS, está na forma que o Git trata os dados. 
	 * Conceitualmente, a maior parte dos outros sistemas armazena informação como uma lista de mudanças por arquivo. 
	 * O Git considera que os dados são como um conjunto de snapshots (captura de algo em um determinado instante, como em uma foto) 
	 * de um mini-sistema de arquivos. Cada vez que você salva ou consolida (commit) o estado do seu projeto no Git, 
	 * é como se ele tirasse uma foto de todos os seus arquivos naquele momento e armazenasse uma referência para essa captura. 
	 * Para ser eficiente, se nenhum arquivo foi alterado, a informação não é armazenada novamente
	 * 
	 * A maior parte das operações no Git precisam apenas de recursos e arquivos locais para operar — 
	 * geralmente nenhuma outra informação é necessária de outro computador na sua rede.
	 * 
	 * O mecanismo que o Git usa para fazer o checksum é chamado de hash SHA-1, uma string de 40 caracteres composta de caracteres 
	 * hexadecimais (0-9 e a-f) que é calculado a partir do conteúdo de um arquivo ou estrutura de um diretório no Git. 
	 * Tudo que o git armazena é identificado pelo valor hash do seu contéudo.
	 * 
	 *  Git faz com que seus arquivos sempre estejam em um dos três estados fundamentais: consolidado (committed), modificado (modified) 
	 *  e preparado (staged). Dados são ditos consolidados quando estão seguramente armazenados em sua base de dados local. 
	 *  Modificado trata de um arquivo que sofreu mudanças mas que ainda não foi consolidado na base de dados. 
	 *  Um arquivo é tido como preparado quando você marca um arquivo modificado em sua versão corrente para que ele faça parte do snapshot 
	 *  do próximo commit (consolidação).
	 * 
	 *  As três seções principais de um projeto do Git: o diretório do Git (git directory, repository), o diretório de trabalho 
	 *  (working directory), e a área de preparação (staging area).
	 * 
	 *  	Estados do Git:
	 *  		1 - O diretório do Git é o local onde o Git armazena os metadados e o banco de objetos de seu projeto. 
	 *  		Esta é a parte mais importante do Git, e é a parte copiada quando você clona um repositório de outro computador.
	 * 	
	 *  		2 - O diretório de trabalho é um único checkout de uma versão do projeto. Estes arquivos são obtidos a partir da base de dados 
	 *  		comprimida (Redução do espaço ocupado por dados no dispositivo) 
	 *          no diretório do Git e colocados em disco para que você possa utilizar ou modificar.
	 * 
	 * 			3 - A área de preparação é um simples arquivo, geralmente contido no seu diretório Git, 
	 * 			que armazena informações sobre o que irá em seu próximo commit. 
	 * 			É bastante conhecido como índice (index), mas está se tornando padrão chamá-lo de área de preparação.
	 * 
	 * O workflow básico do Git pode ser descrito assim:
	 *  
	 *		1 - Você modifica arquivos no seu diretório de trabalho.
	 *		2 - Você seleciona os arquivos, adicionando snapshots deles para sua área de preparação.
	 * 		3 - Você faz um commit, que leva os arquivos como eles estão na sua área de preparação e os armazena permanentemente  
	 *			no seu diretório Git. 
	 * 
	 * 	Se uma versão particular de um arquivo está no diretório Git, é considerada consolidada. 
	 *  Caso seja modificada mas foi adicionada à área de preparação, está preparada. 
	 *  E se foi alterada desde que foi obtida mas não foi preparada, está modificada. 
	 * 
	 * 
	 * 
	 * O que é controle de versão, e por que você deve se importar?
	 * 		- O controle de versão é um sistema que registra as mudanças feitas em um arquivo ou um conjunto de arquivos 
	 * 		  	ao longo do tempo de forma que você possa recuperar versões específicas (Version Control System ou VCS). 
	 * 		
	 * 		- Ele permite reverter arquivos para um estado anterior, reverter um projeto inteiro para um estado anterior, 
	 * 		   	comparar mudanças feitas ao decorrer do tempo, ver quem foi o último a modificar 
	 * 			algo que pode estar causando problemas.
	 * 
	 * 
	 * 
	 * Cada alteração que você faz fica gravada em um histórico, podendo ser visualizada e restaurada a qualquer instante.
	 * 
	 * O Git permite que você marque um dado estado do seu projeto com uma etiqueta, que pode ser usada para determinar uma versão dele.
	 * 
	 * Uma das funções do Git é centralizar os arquivos de trabalho, impedindo que haja confusão sobre o que foi 
	 * e não foi modificado por cada um.
	 *
	 * Não é possível criar repositórios privados na versão gratuita. 
	 * É necessário pagar uma mensalidade para que seu código não seja aberto.
	 * 
	 * 		Clone Repositorie:
	 * Para clonar um repositório do Github, basta usar o comando git clone URL, 
	 * substituindo URL pelo endereço de clonagem do Github. 
	 * O endereço de clonagem pode ser encontrado na página do repositório, 
	 * ou adicionando-se o final .git ao endereço da página do repositório.
	 *
	 *
	 * Ao clonar um repositório, o Git vai te mostrar o progresso e enfim uma mensagem de sucesso.
	 *
	 * O Git permite que realizemos o controle de versão de um repositório, porém um repositório deve 
	 * ser associado diretamente com uma pasta no sistema de arquivos. 
	 * Portanto, não podemos adicionar arquivos localizados em pastas diferentes que não estejam associadas ao mesmo repositório.
	 *
	 * Para navegar pelo repositório, basta entrar no diretório criado usando o comando (cd 'nome do repositório')
	 * 
	 * Para visualizar as tags de um projeto, basta entrar no diretório do repositório e digitar o comando git tag.
	 * 
	 * dir - Visualizar os arquivos disponíveis
	 * 
	 * git diff v0.1 v0.2 - Verifica quais foram as alterações que ocorreram no projeto
	 * 
	 * A opção checkout altera seu repositório local fazendo com que seus arquivos fiquem 
	 * no mesmo estado em que estavam quando a tag v0.1 foram criados!
	 * git blame (nomeDoArquivo) - Mostra as alterações linha por linha e a data de alteração
	 * 
	 * Ao rodar o comando git diff v0.1 v0.2, vemos as alterações entre uma versão e a outra. 
	 * No caso, a frase está com um símbolo (-) na frente, indicando que esta foi removida da versão 0.1 pra 0.2.
	 *
	 * Pasta com controle de alterações = Repositório.
	 * git init - Para transformar a pasta em um repósitorio. (O git controlará esta pasta)
	 * 
	 * mdkdir - Cria uma pasta
	 * 
	 * git ls-files - Mostra todos os arquivos que estão sendo controlados pelo git
	 * 
	 * git status - O comando git status exibe um resumo dos arquivos modificados, 
	 * adicionados ou excluídos de seu working directory, em comparação com o HEAD. (untracked - Não está rastreando "monitorando")
	 * 
	 * git add - O comando git add, seguido pelo caminho relativo ou completo do arquivo, 
	 * registra que o mesmo deve ser adicionado ao controle de versão!
	 * 
	 * git commit -m "" - Precisa de uma mensagem para descrever qual operação está sendo efetuada 
	 * Grava as alterações no repositório. Faz com que as alterações registradas, como uma modificação de arquivo ou 
	 * o rastreamento de um arquivo novo, sejam incorporadas no histórico de modificações como um novo ponto de trabalho.. 
	 * 
	 * 
	 * git config user.name "Nome" - Para saber quem efetuou a alteração
	 * git config user.email "email" - Para vincular a conta do git
	 */
	
	
}
