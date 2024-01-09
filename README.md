# Integrated Software Development Workshop 2023/2024

## Group 13 Members

| Name                                            | Matric No | Role   |
| :---------------------------------------------- | :-------- | :----- |
| [Yeo Din Song](https://github.com/Yeo8023)      | 163369    | Leader |
| [Loo Chi Hao](https://github.com/haocloo)       | 163703    | Member |
| [Lim Yong Jun](https://github.com/LimmmYongJun) | 164598    | Member |
| [Lim Jia Liang](https://github.com/LIMJIALIANG) | 163564    | Member |

## Resources

- [Project Guidelines](https://elearning.usm.my/sidang2324/pluginfile.php/264071/mod_resource/content/1/Project%20CAT201%20guidelines_ZZ.pdf)
- [Google Sheets](https://docs.google.com/spreadsheets/d/1ghV6Cwjd-0VkDH6BznByNTTSaDVdCK0S_aGxE619Dtg/edit#gid=311505842)
- [Google Docs](https://docs.google.com/document/d/19suEB7De7tjgj3Xgtr2OZHE7gmp4nJADi2cHoLwATHc/edit?usp=sharing)
- [UML Diagram](https://drive.google.com/file/d/1dm5RRlR6Sq67EF71jfyPBU1Wj5fi_x6O/view?usp=sharing)

## Setup

1. Download [Java 17 JDK](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)
2. Set up system environment variables:
   - Variable Name: `JAVA_HOME`
   - Variable Value: `C:\Program Files\Java\jdk-17`
3. Update `Path` to include `%JAVA_HOME%\bin`
4. In VSCode, press `Ctrl+Shift+P`, enter `Java: Configure Java Runtime`, select `java 17`
5. Download the `extension pack for Java` & `gradle` for java in VSCode
6. Restart your laptop
7. Download [JavaFX Scene Builder](https://gluonhq.com/products/scene-builder/#download)

## First Time Setup

```bash
git clone https://github.com/haocloo/CAT201-Project-G13.git
cd CAT201-Project-G13
```

## Build and Run

1. Clean the project / Delete build folder (optional)

```bash
./gradlew clean
```

2. Build the project

```bash
./gradlew build
```

3. Run the project

- Enable apache and mysql, navigate to `http://localhost/phpmyadmin/`

1. Create a new database called `restaurant`
2. Create table employee with 5 columns
   ...

- Run this command in vscode terminal

```bash
./gradlew run
```

4. To fix error opening FXML file,

- head over to scene builder
- open an empty file
- click on the `settings icon` on the right side
- click `JAR/FXML Manager`
- click `Add Library/FXML from file system`
- navigate to the lib folder `CAT201-Project-G13\app\lib`
- select `fontawesomefx-8.2.jar`

5. Setup in mysql
1. Create a new database called `restaurant`
1. Create table `employee` with 6 columns:
   id INT (primary key)
   name VARCHAR 100
   password VARCHAR 100
   question VARCHAR 100
   answer VARCHAR 100
   date DATE

## Git Commands

![Simplified Diagram for GitHub Collaboration](https://raw.githubusercontent.com/haocloo/github-collaboration-guide/main/simplified%20diagram.png)

## Folder tree `tree /f /a > tree.txt`

```bash
CAT201-Project-G13.
|   .gitattributes
|   .gitignore
|   gradlew
|   gradlew.bat
|   README.md
|   settings.gradle
|
+---.gradle
|
+---.vscode
|       settings.json
|       tasks.json
|
+---app
|   |   build.gradle
|   |
|   +---build
|   |
|   +---lib
|   |       aopalliance-1.0.jar
|   |       bcmail-jdk14-1.38.jar
|   |       bcmail-jdk14-138.jar
|   |       bcprov-jdk14-1.38.jar
|   |       bcprov-jdk14-138.jar
|   |       bctsp-jdk14-1.38.jar
|   |       castor-core-1.3.3.jar
|   |       castor-xml-1.3.3.jar
|   |       commons-beanutils-1.9.0.jar
|   |       commons-collections-3.2.2.jar
|   |       commons-digester-2.1.jar
|   |       commons-lang-2.6.jar
|   |       commons-logging-1.1.1.jar
|   |       core-2.3.0.jar
|   |       ecj-4.3.1.jar
|   |       fontawesomefx-8.2.jar
|   |       icu4j-57.1.jar
|   |       itext-2.1.7.js5.jar
|   |       jackson-annotations-2.1.4.jar
|   |       jackson-core-2.1.4.jar
|   |       jackson-databind-2.1.4.jar
|   |       jakarta-regexp-1.4.jar
|   |       jasperreports-6.3.0.jar
|   |       jasperreports-fonts-6.17.0.jar
|   |       jasperreports-javaflow-6.16.0.jar
|   |       javax.inject-1.jar
|   |       jcommon-1.0.23.jar
|   |       jfreechart-1.0.19.jar
|   |       lucene-analyzers-common-4.5.1.jar
|   |       lucene-core-4.5.1.jar
|   |       lucene-queries-4.5.1.jar
|   |       lucene-queryparser-4.5.1.jar
|   |       lucene-sandbox-4.5.1.jar
|   |       mysql-connector-java-5.1.48.jar
|   |       ojdbc14-10.2.0.2.0.jar
|   |       olap4j-0.9.7.309-JS-3.jar
|   |       spring-aop-3.0.6.RELEASE.jar
|   |       spring-asm-3.0.6.RELEASE.jar
|   |       spring-beans-3.0.6.RELEASE.jar
|   |       spring-context-3.0.6.RELEASE.jar
|   |       spring-core-3.0.6.RELEASE.jar
|   |       spring-expression-3.0.6.RELEASE.jar
|   |       stax-1.2.0.jar
|   |       stax-api-1.0-2.jar
|   |       stax-api-1.0.1.jar
|   |
|   \---src
|       \---main
|           +---java
|           |   \---cat201
|           |       \---project
|           |           |   App.java
|           |           |
|           |           +---controllers
|           |           |       CardProduct.java
|           |           |       Login.java
|           |           |       Main.java
|           |           |
|           |           \---model
|           |                   customersData.java
|           |                   data.java
|           |                   database.java
|           |                   productData.java
|           |
|           \---resources
|               |   report.jasper
|               |   report.jrxml
|               |
|               +---css
|               |       CardDesign.css
|               |       Login.css
|               |       Main.css
|               |
|               +---images
|               |       companyLogo.jpg
|               |
|               \---views
|                       CardProduct.fxml
|                       Login.fxml
|                       Main.fxml
|
\---gradle
    \---wrapper
            gradle-wrapper.jar
            gradle-wrapper.properties
```
