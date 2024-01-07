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

```bash
./gradlew run
```

## Git Commands

![Simplified Diagram for GitHub Collaboration](https://raw.githubusercontent.com/haocloo/github-collaboration-guide/main/simplified%20diagram.png)

## Folder tree `tree /f /a > tree.txt`
```bash
|   \---src
|       \---main
|           +---java
|           |   \---cat201
|           |       \---project
|           |           |   App.java
|           |           |   
|           |           \---controllers
|           |                   LoginController.java
|           |                   MainController.java
|           |                   SceneController.java
|           |                   
|           \---resources
|               |   styles.css
|               |   
|               +---images
|               |       companyLogo.jpg
|               |       
|               \---views
|                       Login.fxml
|                       Main.fxml
```