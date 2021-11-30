## Santorini

A **two-player strategy board game based on object-oriented design**, where each player aims climbing a tower of 3 tiles. 
The board is a standard 5 × 5 chessboard. The game starts with each player having 2 pieces placed on the board.
The 2 players alternate at moving their pieces in one or more of the three lines of action: vertical, horizontal, and diagonal. 
After moving a piece, a player should place a tile next to the new location of the just moved piece. 
Pieces can jump on tiles according to some rules. The player who succeeds in bringing one of their tiles on top of a 3 tiles tower wins.

**The following video explains the game in detail:** https://www.youtube.com/watch?v=JmPzVjdweYI#t= 0m59s

The difference is Santorini allows players to select between exactly two types of pieces, Cubes and Pyramids. 
Both players can have different, or the same types of pieces. 
**Cubes** can only move horizontally and vertically. **Pyramids**, on the other hand, can only move diagonally.
Both types of pieces can place tiles on the 3 lines of actions.


**Rules:**

• The locations (0,0) is the upper left corner. (4,4) is the lower right corner.
• Every cell in the board has a level. Initially all cells have level 0. Placing a tile on a cell raises its
level by one.
• Player one pieces should be placed in the locations: (0,0) and (4,1). Note that the first number is
the y-coordinate and the second number is the x-coordinate.
• Player two pieces should be placed in the locations: (0,3) and (4,4). Note that the first number is the y-coordinate and the second number is the x-coordinate.
• Cubes can only move horizontally and vertically. Pyramids can move only diagonally.
• Both pieces types can place tiles horizontally, vertically, and diagonally.
• Both players can select the same or different types of pieces.
• Player one starts first.
• Every player should move a piece and then place a tile in their turn.
• The placed tile has to be adjacent to the new location of the just moved tile.
• Tiles can only be placed on tiles but not on pieces.
• Pieces can move to tiles that are maximum one level higher.
• Placing a tile on a tower of 3 tiles kills the tower. The whole cell no longer exists.
• A player wins if they move one of their pieces to a 3-levels-high tower or if the opponent cannot move.


