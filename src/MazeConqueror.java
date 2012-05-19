

public class MazeConqueror
{
    public static void main(String[] args)
    {
        Square[][] maze = new Square[4][11];
        InitializeMazeWithSquares(maze);
        System.out.println(maze[2][4]);

    }

    public static void InitializeMazeWithSquares(Square[][] maze)
    {
        //        System.out.println(maze[2][1]);


                for (int x = 0; x < 4; x++)
                {
                    Square[] squares = maze[x];
                    maze[x][0] = new Square();

                    for (int y = 0; y < squares.length; y++)
                    {
                        maze[x][y] = new Square();
                        System.out.println("x =" + x + "y =" + y);
                    }
                }
    }
}
