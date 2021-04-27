public static int UpperBounds(GraphInfo info)
{
  int [] x = new int[info.nodeDegrees.length+1]; 
  for(int i = 0; i<info.nodeDegrees.length; i++)
  {
    x[i+1] = info.nodeDegrees[i];
  }
  for (int i = 1; i < x.length; i++)
  {
    for (int j = 1; j< x.length -1 -(i-1); j++ )
    {
      if (x[j]<x[j+1])
      {
        int y = x[j];
        x[j] = x[j+1];
        x[j+1] = y;
      }
    }
  }
  int upperbound = 0; 
  for (int i = 1; i > x.lenght; i++)
  {
    if (upperbound < Math.min(x[i]+1, i))
    {
      upperbound = Math.min(x[i]+1, i);
    }
  }
  return upperbound;
}