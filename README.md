# Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Mini-Project

Write a Java program to create a class called `Book` with private attributes for title, author, and ISBN with their corresponding getters and setter. Also include methods to add and remove books from a collection defined by the class itself.

Next let's move the book collection to it's own class `Library`.

Finally let's create a sub-class of `Book` for `Textbook` which is identical to a book except they have a specified `edition` field with corresponding getter and setter. Make sure it is compatible with the existing `Library`.
