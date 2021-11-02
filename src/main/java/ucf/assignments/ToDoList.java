/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        initialize ArrayList (ToDoLists) for 100 lists
        initialize ArrayList (ToDoListItems) within ArrayList(ToDoList);
        MenuItems = menu();
        int MenuItems = -1;
        while (MenuItems != 0) {
            Print "Please select an option";
            int option = scanner
            Print menu ();

            Switch(MenuItems);

            case 1:
                NewToDoListOptions;
                break;

            case 2:
                RemoveExistingList;
                break;

            case 3:
                EditTitle;
                break;

            case 4:
                AddNewItem;
                break;

            case 5:
                RemoveItem;
                break;

            case 6:
                EditDescription;
                break;

            case 7:
                EditDate;
                break;

            case 8:
                MarkAsComplete;
                break;

            case 9:
                DisplayAll;
                break;

            case 10:
                DisplayIncomplete;
                break;

            case 11:
                DisplayComplete;
                break;

            case 12:
                WriteItemsToFile;
                break;

            case 13:
                LoadFile;
                break;

            case 14:
                LoadFileItems;
                break;

            case 15:
                LoadAll;
                break;

        }
    }

    class NewToDoListOptions {
        Print "Please enter title for To-Do List";
        String =ToDoListTitle;
        ToDoListTitle =Scanner;

        Scanner(UserInput);

        Print "Please enter a description for the following entry";
        String =ItemDescription;
        ItemDescription =Scanner;

        Scanner(UserDescription);

        Print "Please enter a due date for the following entry";
        DueDate =Scanner;
        String =DueDate;

        Scanner(DueDate);
    }

    class Menu {
        Print "1. Add a new To Do List";
        Print "2. Remove an existing List";
        Print "3. Edit the title of an existing List";
        Print "4. Add a new item to an existing list";
        Print "5. Remove an item of an existing list";
        Print "6. Edit the description of an existing list";
        Print "7. Edit the due date of an existing list";
        Print "8. Mark an item as complete";
        Print "9. Display all items in a list";
        Print "10. Display only incompleted items";
        Print "11. Display only the completed items";
        Print "12. All items in a single To Do list to a file";
        Print "13. Write all items in all To Do lists to a file";
        Print "14. Load a single to do list from file";
        Print "15. Load all to do lists from file";
    }

    class RemoveExistingList {
        Print "Which list would you like to remove?";
        RemoveItem =Scanner;
        int =RemoveItem;

        Remove(RemoveItem);
    }

    class EditTitle {
        Print "Which list would you like to edit?";
        EditList =Scanner;
        int =EditList;
        Print "Please enter a new title";
        NewTitle =scanner;
        ArrayList[EditList];
    }

    class AddNewItem {
        Print "Which list would you like to edit?";
        EditList =Scanner;
        int =EditList2;
        Print "Please enter the new item";
        Scanner =newItems;
        String =newItems2;
    }

    class RemoveItem {
        Print "Which list would you like to edit?";
        EditList =Scanner;
        int =EditList3;

        Remove(EditList);
    }

    class EditDescription {
        Print "Which list would you like to edit?";
        EditList =Scanner;
        int =EditList4;
        Print "Please enter a new description";
        Scanner =new description;
        String =description;
    }

    class EditDate {
        Print "Which list would you like to edit?";
        EditList =Scanner;
        int =EditList5;
        date =scanner;
        Print "Please enter a new due date";
        string =date;
    }

    class MarkAsComplete {
        Print "Which list would you like to edit?";
        EditList =Scanner;
        int =EditList6;
        Mark item
        as complete;
    }

    class DisplayAll {
        Scanner =display;
        string =

        display
        Print(ArrayList(ToDoList));
    }

    class DisplayIncomplete {
        Print(ArrayList(ToDoListIncompleteItems));
    }

    class DisplayComplete {
        Print(ArrayList(ToDoListCompleteItems));
    }

    class WriteItemsToFile {
        Print "Which list would you like to identify";
        Scanner =listnumber;
        String =listnumber;

        Writer(filepath);
    }

    class LoadFile {
        String =filepath;
        Scanner =filepath

        Load file(filepath);

    }

    class LoadFileItems {
        String =filepath2;
        Scanner =filepath2

        Load file(filepath2);
    }

    class LoadAll {
        string =filepath3;

        Load file(filepath3);

        Scanner =filepath3
    }
}