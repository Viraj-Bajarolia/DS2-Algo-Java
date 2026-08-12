This homework covers stacks and a few different ways they can be used.

## What is included

- `LinkedStack.java` - linked implementation of a stack. It includes `priorityPush` and the extra credit `peekNext` method.
- `ArrayStack.java` - array implementation of a stack with the extra credit `peekNext` method.
- `StackInterface.java` - interface used by both stack classes.
- `HomeworkM10Driver.java` - tests the stack methods.
- `Folder.java` and `FileItem.java` - classes used to build the folder hierarchy.
- `HomeworkM10FolderDriver.java` - prints the folder hierarchy using a stack instead of recursion.
- `ExampleFolderFileStructure.PNG` and `ExampleFolderFileStructure_Annotated.PNG` - examples of the folder structure.

## priorityPush

`priorityPush` is added to `LinkedStack`. If the value is already in the stack, its first occurrence from the top is moved to the top and the method returns `true`. If the value is not already there, it is pushed normally and the method returns `false`.

## peekNext

The extra credit `peekNext` methods return the item directly under the top item without changing the stack. There is one version for `LinkedStack` and one for `ArrayStack`. If there are fewer than two items, the methods throw `EmptyStackException`, which is consistent with the existing `peek` behavior.

## Folder problem

The folder part of the homework replaces a recursive folder-printing method with a stack-based version. One stack keeps track of which folders still need to be printed and another keeps track of the indentation level. Subfolders are pushed in reverse order so they print in the same order as the recursive version.

## Other homework topics

The homework also included converting infix expressions to postfix notation and evaluating postfix expressions using stacks.

## Running the code

Run `HomeworkM10Driver.java` to test `priorityPush`. The extra credit `peekNext` tests are included in that file but are commented out in the original driver.

Run `HomeworkM10FolderDriver.java` to compare the recursive folder output with the stack version.
