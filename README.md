# Shape-Game
A game inspired by the well-known game Tetris


This game is inspired by the well-known Tetris. 
We have a generator that produces shapes randomly selected from square, triangle, pentagon and circle.
The total number of shapes the generator can produce is predetermined, and the shapes are produced with a randomly selected size. 
We have a player who collects the shapes into a stack of limited size. 
For each new shape generated, the player must choose whether to keep that shape or not. 
If he keeps it, the shape goes to the top of the stack. 
For each shape he keeps, the player gets points equal to the area of the shape. 
If the new shape that the player picks up has the same area as the one at the top of the stack, then the points he gets are multiplied by ten.
Also, if the new shape is of the same type as the one at the top of the stack, then the two shapes are removed from the stack (the player keeps the points). 
The game ends when either the generator runs out of shapes, or the player's stack is full. 
The player's goal is to collect as many points as possible.

In order to run the project you should run the **ShapeGame** Class
