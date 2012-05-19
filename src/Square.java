

/**
 *
 * @author max
 */
class Square
{
   
   boolean east = false;
   boolean west = false;
   boolean north = false;
   boolean south = false;
   
    @Override
   public String toString()
   {
      return "  |   east = "+ east +
      "   |\n  |   west = "+ west +
      "   |\n  |   north = "+ north +
      "  |\n  |   south = "+ south +
              "  |";
   }
}
