# Integrated Software Development Workshop 2023/2024

## Group 13 Members

| Name                                            | Matric No | Role   |
| :---------------------------------------------- | :-------- | :----- |
| [Yeo Din Song](https://github.com/Yeo8023)      | 163369    | Leader |
| [Loo Chi Hao](https://github.com/haocloo)       | 163703    | Member |
| [Lim Yong Jun](https://github.com/LimmmYongJun) | 164598    | Member |
| [Lim Jia Liang](https://github.com/LIMJIALIANG) | 163564    | Member |

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

- Start apache and mysql via XAMPP, navigate to `http://localhost/phpmyadmin/` to view restaurant table

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

## Git Commands

![Simplified Diagram for GitHub Collaboration](https://raw.githubusercontent.com/haocloo/github-collaboration-guide/main/simplified%20diagram.png)
