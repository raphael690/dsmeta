# Projeto Spring react
## Crie um app completo para o seu portifólio com as tecnologias mais demandadas do mercado

## Objetivos do projeto parte 1
* Criar projetos backend e frontend
* Salvar os projetos no github em monorepo
* Montar o visual estático do front end

## Design Figma
* https://www.figma.com/file/PehiT8Dw4Lv5ioTSULZeRI/DSMeta3
* https://www.figma.com/file/Yu2RHFmirHQ4BIVZM2XxY6/DSMeta2
* https://www.figma.com/file/EN1zFtk4eY3Jgmpgi9YaMG/DSMeta1

## Pré-requisito: Git instalado

## Ferramentas

* Nodejs 16 e Yarn (video: https://youtu.be/x5tgFTS-CYA)
* STS (vídeo: https://youtu.be/TGQOK9QsX88)
* VS Code
     - Intellicode
     - ESLint
     - JSX HTML  <tags/>

## Passo: Criar projeto ReactJS

Irei criar uma pasta chamada projetos dentro do disco c: aposto irei criar 1 outra pasta de projetos chamada dsmeta e logo em seguida 2 subpasta dentro da pasta dsmeta chamada frontend e backend.

c:\projetos | dsmeta
------------|--------
       -    |backend
       -    |frontend

comando para criar a pasta frontend:
~~~ 
yarn create vite frontend --template reacts-ts
~~~~
## Passo: Criar projeto Spring Boot


* Criar projeto Spring Boot no **Spring Initializr** com as seguintes dependências:
     -    Web
     -    JPA
     -    H2
     -    Security
* Ajuste no arquivo pom.xml:
~~~~
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version><!--$NO-MVN-MAN-VER$ -->
</plugin>
~~~~
* Botão direito no projeto -> Maven -> Update project (force upadate)

## Passo: salvar primeira versão no Github
~~~~
git init
git add .
git commit -m "Project created"
git branch -M main
git remote add origin git@github.com:seuusuario/seurepositorio.git
git push -u origin main
~~~~
## Passo: "Limpar" O projeto ReactJS

* COMMIT: Project clean
## Passo: Primeiro componente

* COMMIT: First component
## Passo: Outros componentes

* COMMIT: Other components
## Passo: Datepicker

Documentação: https://github.com/Hacker0x01/react-datepicker
~~~~
yarn add react-datepicker@4.8.0 @types/react-datepicker@4.4.2
~~~~
~~~~
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
~~~~
~~~~
<DatePicker
    selected={new Date()}
    onChange={(date: Date) => {}}
    className="dsmeta-form-control"
    dateFormat="dd/MM/yyyy"
/>
~~~~
* COMMIT: Datapicker

## Passo: React Hook useState para manter estado das datas
Macete para criar uma data de X dias atrás:
~~~~
const date = new Date(new Date().setDate(new Date().getDate() - 365));
~~~~
* COMMIT: useSate
